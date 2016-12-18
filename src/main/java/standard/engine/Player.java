package standard.engine;

import java.util.HashMap;

/**
 * Created by Milos on 06/11/2016.
 */
public class Player
{
    Room location;
    HashMap<String, Item> inventory;

    public Player(Room loc)
    {
        location = loc;
        inventory = new HashMap<>();
    }

    public boolean hasItem(Item i)
    {
        return inventory.containsKey(i.getItem_id());
    }

    public void giveItem(Item i)
    {
        inventory.put(i.getItem_id(), i);
    }

    public void removeItem(Item i)
    {
        if(inventory.containsKey(i.getItem_id()))
            inventory.remove(i.getItem_id(), i);
    }

    public void moveTo(Room r)
    {
        location = r;
    }

    public Room getLocation()
    {
        return location;
    }

    public String listInventory(Engine eng)
    {
        String inv = "";
        if(!inventory.isEmpty())
        {
            inv += "Your have the following items:";
            for (String item_id: inventory.keySet())
            {
                inv += eng.findItem(item_id).listContents(eng, "");
            }
        }
        else
        {
            inv += "Your inventory is empty.";
        }
        return inv;
    }
}
