package standard.engine;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Milos on 06/11/2016.
 */
public class Item extends ItemLocation implements Comparable
{
    private String item_id;                  // the unique identifier of the item used to refer to it
    private boolean takeable;                // true if the item can be taken from its respective room (if the item is not fixed in place)
    private flag location_flag;              // flag that determines the location of the item (room if its in a room, inv for inventory, cont for in a container and prod means it will be produced later)
    private ItemLocation location;           // the location of the item (room_id, inv, item or null (if the item has not yet been produced))
    private int volume;                      // the volume of the item
    private boolean isContainer;             // true if the item is a container
    private int mass;                        // the mass of the container
    private boolean surpress;                // true if the mass of the item is non-examinable
    private int holdingMass;                 // the holding mass of the container
    private HoldingType holdingType;         // the min/max/equal type of the holding mass
    private HashMap<String, Item> contained; // the items contained if the item is a container
    private Temperature temperature;         // the temperature of the item
    private boolean hasConstantTemp;         // true if the temperature level cannot change
    private Message description;             // items short description

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
                massOutput = " too heavy ";
            }
            else if (newContainedMass < holdingMass)
            {
                massOutput = " not heavy enough ";
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

    public int getTotalVolume()
    {
        int vol = volume;
        switch (temperature)
        {
            case hot:
                vol += vol * 0.2;
                break;
            case warm:
                vol += vol * 0.1;
                break;
            case cold:
                vol -= vol * 0.1;
                break;
            case frozen:
                vol -= vol * 0.2;
                break;
        }
        return vol;
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

    public String getIDWithTemp(boolean enhanced)
    {
        if(!enhanced)
            return item_id;
        if (hasConstantTemp || temperature == Temperature.normal)
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
        res = prefix + temperature.toString() + " " + res;
        return res;
    }

    public String listContents(Engine eng, String prefix)
    {
        String res = "\n" + prefix + "- " + getIDWithTemp(eng.isEnhanced());
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
        if (!hasConstantTemp && eng.isEnhanced())
        {
            switch (temperature)
            {
                case hot:
                    result += "\nThe volume of " + Utility.addThe(item_id) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently at 120% its normal size.";
                    result += "\n" + Utility.capitalise(Utility.addThe(item_id)) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently hot.";
                    break;
                case warm:
                    result += "\nThe volume of " + Utility.addThe(item_id) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently at 110% its normal size.";
                    result += "\n" + Utility.capitalise(Utility.addThe(item_id)) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently warm.";
                    break;
                case normal:
                    result += "\n" + Utility.capitalise(Utility.addThe(item_id)) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently at normal temperature.";
                    break;
                case cold:
                    result += "\nThe volume of " + Utility.addThe(item_id) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently at 90% its normal size.";
                    result += "\n" + Utility.capitalise(Utility.addThe(item_id)) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently cold.";
                    break;
                case frozen:
                    result += "\nThe volume of " + Utility.addThe(item_id) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently at 80% its normal size.";
                    result += "\n" + Utility.capitalise(Utility.addThe(item_id)) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " currently frozen.";
                    break;
            }
        }
        if(eng.isEnhanced() && !surpress)
        {
            result += "\nThe mass of " + Utility.addThe(item_id) + " " + Utility.isAre(item_id, eng.getParser().getPipeline()) + " " + mass +"g.";
        }
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
}
