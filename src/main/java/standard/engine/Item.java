package standard.engine;

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
    private HashMap<String, Item> contained; // the items contained if the item is a container
    private Message description;             // items short description

    public Item(String item_id, boolean takeable, flag location_flag, ItemLocation location, int volume, boolean isContainer, Message description)
    {
        this.item_id = item_id;
        this.takeable = takeable;
        this.location_flag = location_flag;
        this.location = location;
        this.description = description;
        this.volume = volume;
        this.isContainer = isContainer;
        contained = new HashMap<>();
    }

    public Item(String item_id)
    {
        this.item_id = item_id;
        this.takeable = false;
        this.location_flag = flag.prod;
        this.location = null;
        this.description = null;
        this.volume = 0;
        this.isContainer = false;
        contained = new HashMap<>();
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

    public Message getDescriptionMsg()
    {
        return description;
    }

    public void setDescription(Message description)
    {
        this.description = description;
    }

    public void setLocationFlag(flag loc)
    {
        location_flag = loc;
    }

    public flag getLocationFlag()
    {
        return location_flag;
    }

    public ItemLocation getLocation()
    {
        return location;
    }

    public void moveItem(flag fl, ItemLocation r, Engine eng)
    {
        // remove the item from the old location
        switch (location_flag)
        {
            case inroom:
                Room loc = (Room)location;
                loc.removeItem(this);
                break;
            case incont:
                Item cont = (Item)location;
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
        if(r instanceof Item)
        {
            Item container = (Item)r;
            container.addItem(this);
            location = container;
            location_flag = flag.incont;
        }
        else
        {
            Room loc = (Room)r;
            loc.addItem(this);
            location = loc;
            location_flag = flag.inroom;
        }
    }

    public void setLocation(ItemLocation loc)
    {
        location = loc;
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
        if(contained.containsKey(item.getItem_id()))
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

    public int getVolume()
    {
        return volume;
    }

    public enum flag
    {
        inroom, inv, incont, prod
    }

    public String getExamination()
    {
        String result = "";
        result += description.getMsg();
        if(!contained.isEmpty())
        {
            result += "\nContains the following:";
            for(String item : contained.keySet())
            {
                result += "\n- "+ item;
            }
        }
        return result;
    }
}
