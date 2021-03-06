package engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Player
{
    Room location;
    HashMap<String, Item> inventory;

    public Player(Room loc)
    {
        location = loc;
        inventory = new HashMap<>();
    }

    public Set<String> getInventoryKeySet()
    {
        return inventory.keySet();
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
            inv += "Your have the following:";
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

    public ArrayList<String> listAllItems(Engine eng)
    {
        ArrayList<String> allItems = new ArrayList<>();
        allItems.addAll(inventory.keySet());
        int loc = 0;
        while(loc < allItems.size())
        {
            Item curr = eng.findItem(allItems.get(loc));
            allItems.addAll(curr.getContainedKeySet());
            loc++;
        }
        return allItems;
    }
}
