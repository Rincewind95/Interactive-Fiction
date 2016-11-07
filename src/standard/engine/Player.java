package standard.engine;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Milos on 06/11/2016.
 */
public class Player
{
    Room location;
    HashSet<Item> inventory;

    public Player(Room loc)
    {
        location = loc;
        inventory = new HashSet<>();
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

    public Room locate()
    {
        return location;
    }
}
