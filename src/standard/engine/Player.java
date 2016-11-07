package standard.engine;

import java.util.TreeSet;

/**
 * Created by Milos on 06/11/2016.
 */
public class Player
{
    Room location;
    TreeSet<Item> inventory;

    public Player(Room loc)
    {
        location = loc;
        inventory = new TreeSet<>();
    }

    public boolean hasItem(Item i)
    {
        return inventory.contains(i);
    }

    public void giveItem(Item i)
    {
        inventory.add(i);
    }

    public void removeItem(Item i)
    {
        inventory.remove(i);
    }

    public void moveTo(Room r)
    {
        location = r;
    }

    public Room getLocation()
    {
        return location;
    }

    public String listInventory()
    {
        String inv = "";
        if(!inventory.isEmpty())
        {
            inv += "Your inventory contains the following items:";
            for (Item item: inventory)
            {
                inv += "\n" + item.getItem_id();
            }
        }
        else
        {
            inv += "Your inventory is empty.";
        }
        return inv;
    }
}
