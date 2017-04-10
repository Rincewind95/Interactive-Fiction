package engine;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import engine.utility.ItemLocation;
import engine.utility.Pair;
import engine.utility.Utility;

import java.util.HashMap;
import java.util.Set;

public class Item extends ItemLocation implements Comparable
{
    private String item_id;                         // the unique identifier of the item used to refer to it
    private boolean takeable;                       // true if the item can be taken from its respective room (if the item is not fixed in place)
    private flag location_flag;                     // flag that determines the location of the item (room if its in a room, inv for inventory, cont for in a container and prod means it will be produced later)
    private ItemLocation location;                  // the location of the item (room_id, inv, item or null (if the item has not yet been produced))
    private int volume;                             // the volume of the item
    private int holdingMass;                        // the holding mass of the container
    private HoldingType holdingType;                // the min/max/equal type of the holding mass
    private boolean isContainer;                    // true if the item is a container
    private Temperature temperature;                // the temperature of the item
    private boolean hasConstantTemp;                // true if the temperature level cannot change
    private int mass;                               // the mass of the container
    private boolean surpress;                       // true if the mass of the item is non-examinable
    private HashMap<Temperature, State> tmpToState; // the mapping from all of the temperatures to state
    private boolean stateChanges;                   // true only if at least one of the entries in tmpToState is different
    private HashMap<String, Item> contained;        // the items contained if the item is a container
    private Message description;                    // items short description

    public Item(String item_id,
                boolean takeable,
                flag location_flag,
                ItemLocation location,
                int volume,
                boolean isContainer,
                HoldingType holdingType,
                int holdingMass,
                int mass,
                boolean surpress,
                Temperature temperature,
                boolean constTemp,
                HashMap<Temperature, State> tempToState,
                boolean stateChanges,
                Message description)
    {
        this.item_id = item_id;
        this.takeable = takeable;
        this.location_flag = location_flag;
        this.location = location;
        this.description = description;
        this.volume = volume;
        this.isContainer = isContainer;
        this.holdingType = holdingType;
        this.holdingMass = holdingMass;
        this.mass = mass;
        this.surpress = surpress;
        this.temperature = temperature;
        this.hasConstantTemp = constTemp;
        this.tmpToState = tempToState;
        this.stateChanges = false;
        this.stateChanges = stateChanges;
        contained = new HashMap<>();
    }

    public Item(String item_id)
    {
        this.item_id = item_id;
        this.takeable = false;
        this.location_flag = flag.prod;
        this.location = null;
        this.holdingType = HoldingType.min;
        this.holdingMass = 0;
        this.mass = 0;
        this.description = null;
        this.volume = 0;
        this.isContainer = false;
        contained = new HashMap<>();
    }

    public HashMap<Temperature, State> getTmpToState()
    {
        return tmpToState;
    }

    public static String getStateChangeMessage(Item fir, State oldfir, Item sec, State oldsec)
    {
        String resp = "";
        if(!oldfir.equals(fir.tmpToState.get(fir.temperature)))
        {
            resp = "\r\nIn addition to this, the state of " + Utility.addThe(fir.item_id)+
                    " has changed to " + fir.tmpToState.get(fir.temperature).toString();
        }
        if(!resp.equals(""))
        {
            resp += ", and the ";
        }
        if(!oldsec.equals(sec.tmpToState.get(sec.temperature)))
        {
            if(resp.equals(""))
                resp = "\r\nIn addition to this, the ";

            resp += "state of " + Utility.addThe(sec.item_id)+
                    " has changed to " + sec.tmpToState.get(sec.temperature).toString();
        }
        if(!resp.equals(""))
            resp += ".";
        return resp;
    }

    public static String modifyTemperatures(Item item1, Item item2, StanfordCoreNLP pipeline)
    {
        String out = "";
        if (!item1.hasConstantTemp && !item2.hasConstantTemp)
        {
            // if both items have variable temperature, take the average of their temperatures
            Temperature finaltmp = Temperature.values()[(item1.temperature.ordinal() + item2.temperature.ordinal()) / 2];
            if (finaltmp != Temperature.normal)
            {
                out = ", and now both items are" +
                        (item1.temperature == finaltmp ? " still " : " ") + finaltmp.toString();
                for (int i = 0; i < 2; i++)
                {
                    Item item = (i == 0) ? item1 : item2;
                    out += Utility.volumeChangeMessage(item, finaltmp);
                }
            }
            else
                out = ", and now both items are at normal temperature and volume";
            item1.setTemperature(finaltmp);
            item2.setTemperature(finaltmp);
        }
        else if (item1.hasConstantTemp && !item2.hasConstantTemp)
        {
            out = ", and now " + Utility.addThe(item2.getItem_id()) +
                    " " + Utility.isAre(item2.getItem_id(), pipeline)
                    + (item1.temperature == item2.temperature ? " still " : " ");
            if (item1.temperature != Temperature.normal)
            {
                out += item1.temperature.toString();
                out += Utility.volumeChangeMessage(item2, item1.temperature);
            }
            else
                out += "at normal temperature and volume";
            item2.setTemperature(item1.temperature);
        }
        else if (!item1.hasConstantTemp && item2.hasConstantTemp)
        {
            out = ", and now " + Utility.addThe(item1.getItem_id()) +
                    " " + Utility.isAre(item2.getItem_id(), pipeline)
                    + (item1.temperature == item2.temperature ? " still " : " ");
            if (item2.temperature != Temperature.normal)
            {
                out += item2.temperature.toString();
                out += Utility.volumeChangeMessage(item1, item2.temperature);
            }
            else
                out += "at normal temperature and volume";
            item1.setTemperature(item2.temperature);
        }
        return out;
    }

    public HoldingType getHoldingType()
    {
        return holdingType;
    }

    public int getTotalHoldingMass()
    {
        return holdingMass;
    }

    public int getTotalMass(Engine eng)
    {
        int res = mass;
        return res + getContainedMass(eng);
    }

    public int getContainedMass(Engine eng)
    {
        int res = 0;
        for (String item : contained.keySet())
            res += eng.findItem(item).getTotalMass(eng);
        return res;
    }

    public Pair<Boolean, String> canAddItemsMass(Item toAdd, Engine eng)
    {
        boolean enhanced = eng.isEnhanced();
        int newContainedMass = toAdd.getTotalMass(eng) + getContainedMass(eng);
        int holdingMass = getTotalHoldingMass();
        String massOutput = "";
        boolean massfits = true;
        if(enhanced)
        {
            if (newContainedMass > holdingMass)
            {
                massOutput = "too heavy";
            }
            else if (newContainedMass < holdingMass)
            {
                massOutput = "not heavy enough";
            }
        }
        switch (holdingType)
        {
            case min:
                massfits = (newContainedMass >= holdingMass);
                break;
            case max:
                massfits = (newContainedMass <= holdingMass);
                break;
            case equal:
                massfits = (newContainedMass == holdingMass);
                break;
        }
        return new Pair<>(massfits, massOutput);
    }

    @Override
    public int compareTo(Object o)
    {
        if (o instanceof Item)
        {
            return ((Item) o).item_id.compareTo(item_id);
        }
        return -1;
    }

    public String getItem_id()
    {
        return item_id;
    }

    public String getDescription()
    {
        return description.getMsg();
    }

    public void setDescription(Message description)
    {
        this.description = description;
    }

    public Message getDescriptionMsg()
    {
        return description;
    }

    public flag getLocationFlag()
    {
        return location_flag;
    }

    public void setLocationFlag(flag loc)
    {
        location_flag = loc;
    }

    public ItemLocation getLocation()
    {
        return location;
    }

    public void setLocation(ItemLocation loc)
    {
        location = loc;
    }

    public void moveItem(flag fl, ItemLocation r, Engine eng)
    {
        // remove the item from the old location
        switch (location_flag)
        {
            case inroom:
                Room loc = (Room) location;
                loc.removeItem(this);
                break;
            case incont:
                Item cont = (Item) location;
                cont.removeItem(this);
                break;
            case inv:
                eng.getPlayer().removeItem(this);
                break;
        }

        // add the item to the new location
        location_flag = fl;
        switch (fl)
        {
            case inv:
                location = null;
                eng.getPlayer().giveItem(this);
                return;
            case prod:
                location = null;
                return;
        }
        if (r instanceof Item)
        {
            Item container = (Item) r;
            container.addItem(this);
            location = container;
            location_flag = flag.incont;
        }
        else
        {
            Room loc = (Room) r;
            loc.addItem(this);
            location = loc;
            location_flag = flag.inroom;
        }
    }

    public boolean isTakeable()
    {
        return takeable;
    }

    public boolean isContainer()
    {
        return isContainer;
    }

    public void addItem(Item item)
    {
        contained.put(item.getItem_id(), item);
    }

    public void removeItem(Item item)
    {
        if (contained.containsKey(item.getItem_id()))
            contained.remove(item.getItem_id());
    }

    public Set<String> getContainedKeySet()
    {
        return contained.keySet();
    }

    public boolean contains(Item item)
    {
        return contained.containsKey(item.getItem_id());
    }

    public static double getVolumeChangeCoef(Temperature temperature, Item item)
    {
        double change = 0;
        switch (temperature)
        {
            case hot:
                change = 0.1;
                break;
            case warm:
                change = 0.05;
                break;
            case normal:
                change = 0;
                break;
            case cold:
                change = -0.05;
                break;
            case frozen:
                change = -0.1;
                break;
        }
        switch (item.getTmpToState().get(temperature))
        {
            case gaseous:
                change *= 1.2;
                break;
            case solid:
                change *= 0.8;
                break;
        }

        return 1+change;
    }

    public int getTotalVolume()
    {
        return (int)(volume*getVolumeChangeCoef(temperature, this));
    }

    public int getVolume(Engine eng)
    {
        int remaining_vol = getTotalVolume();
        for (String item : contained.keySet())
            remaining_vol -= eng.findItem(item).getTotalVolume();
        return remaining_vol;
    }

    public Temperature getTemperature()
    {
        return temperature;
    }

    public void setTemperature(Temperature tmp)
    {
        if (!hasConstantTemp)
        {
            temperature = tmp;
            for (String itemId : contained.keySet())
            {
                contained.get(itemId).setTemperature(tmp);
            }
        }
    }

    public String getIDWithTempAndState(boolean enhanced)
    {
        if(!enhanced)
            return item_id;
        String insert_string = "";
        if (!hasConstantTemp && temperature != Temperature.normal)
        {
            insert_string += temperature.toString();
        }
        if(stateChanges)
        {
            if (!insert_string.equals(""))
                insert_string += " ";
            insert_string += tmpToState.get(temperature).toString();
        }
        if(insert_string.equals(""))
            return item_id;

        String res = item_id;
        String[] prefixes = {"the ", "a ", "an "};
        String prefix = "";
        for (String pre : prefixes)
        {
            if (res.startsWith(prefix))
            {
                pre = prefix;
                res = res.substring(pre.length());
            }
        }
        res = prefix + insert_string + " " + res;
        return res;
    }

    public String listContents(Engine eng, String prefix)
    {
        String res = "\n" + prefix + "- " + getIDWithTempAndState(eng.isEnhanced());
        for (String child : contained.keySet())
        {
            res += eng.findItem(child).listContents(eng, prefix + "   ");
        }
        return res;
    }

    public String getExamination(Engine eng)
    {
        String result = "";
        result += description.getMsg();
        if (!contained.isEmpty())
        {
            result += "\nContains the following:";
            for (String item : contained.keySet())
            {
                result += eng.findItem(item).listContents(eng, "");
            }
        }
        if(eng.isEnhanced())
        {
            if (!hasConstantTemp)
            {
                if (temperature != Temperature.normal)
                {
                    int coef = (int) (getVolumeChangeCoef(temperature, this) * 100);
                    result += "\r\nThe volume of " + Utility.addThe(item_id) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently at " + coef + "% its normal size.";
                    result += "\r\n" + Utility.capitalise(Utility.addThe(item_id)) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently " + temperature.toString() + ".";
                }
                else
                {
                    result += "\r\nThe volume of " + Utility.addThe(item_id) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently at its normal size.";
                    result += "\r\n" + Utility.capitalise(Utility.addThe(item_id)) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently at normal temperature.";
                }
            }
            else
            {
                if(temperature != temperature.normal)
                    result += "\r\n" + Utility.capitalise(Utility.addThe(item_id)) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " always " + temperature.toString() + ".";
            }
            if (!surpress)
            {
                result += "\r\nThe mass of " + Utility.addThe(item_id) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " " + mass + "g.";
            }
            if (stateChanges)
            {
                String state = tmpToState.get(temperature).toString();
                result += "\r\n" + Utility.capitalise(Utility.addThe(item_id)) + " " +
                        Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently in " + state + " state.";
            }
        }
        return result;
    }

    // used only in evaluation
    public String getState(Engine eng)
    {
        String result = "";
        result += "\r\nLOCATION: " + location_flag.toString();
        if (!contained.isEmpty())
        {
            result += "\r\nCONTAINS:";
            for (String item : contained.keySet())
            {
                result += eng.findItem(item).listContents(eng, "");
            }
        }

        result += "\r\nTEMPERATURE: " + temperature.toString();
        int coef = (int) (getVolumeChangeCoef(temperature, this) * 100);
        result += "\r\nVOLUME: " + volume;
        result += "\r\nVOLUME COEF: " + coef + "%";
        result += "\r\nMASS: " + mass + "g.";
        result += "\r\nSTATE: " + tmpToState.get(temperature).toString();

        return result;
    }

    public enum Temperature
    {
        frozen, cold, normal, warm, hot
    }

    public enum flag
    {
        inroom, inv, incont, prod
    }

    public enum HoldingType
    {
        min, max, equal
    }

    public enum State
    {
        solid, liquid, gaseous
    }
}
