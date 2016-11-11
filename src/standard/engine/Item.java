package standard.engine;

/**
 * Created by Milos on 06/11/2016.
 */
public class Item
{
    private String item_id;      // the unique identifier of the item used to refer to it
    private boolean takeable;    // true if the item can be taken from its respective room (if the item is not fixed in place)
    private flag location_flag;  // flag that determines the location of the item (room if its in a room, inv for inventory and prod means it will be produced later)
    private Room location;       // the location of the item (room_id, inv of null (if the item has not yet been produced))
    private Message description; // items short description

    public Item(String item_id, boolean takeable, flag location_flag, Room location, Message description)
    {
        this.item_id = item_id;
        this.takeable = takeable;
        this.location_flag = location_flag;
        this.location = location;
        this.description = description;
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

    public void setLocation(flag loc)
    {
        location_flag = loc;
    }

    public flag getLocationFlag()
    {
        return location_flag;
    }

    public Room getLocation()
    {
        return location;
    }

    public void setLocation(Room r)
    {
        location_flag = flag.prod;
        location = r;
    }

    public boolean isTakeable()
    {
        return takeable;
    }

    public enum flag
    {
        room, inv, prod
    }
}
