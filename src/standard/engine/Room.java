package standard.engine;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Milos on 06/11/2016.
 */
public class Room
{
    private String room_id;                   // the unique name of the room
    private String level_id;                  // the unique name of the level the room is located on
    private HashMap<String, Room> leads_to;   // the rooms that can be accessed from the N,E,S,W passages of the room
    private HashMap<String, String> dead_end; // a map of messages which are printed if one tries to go in a dead end (defaults to "Cannot go there")
    private boolean visited;                  // true if the room was ever visited

    private String brief;       // message printed upon first entry to the room
    private String description; // short description printed upon consequent entries

    private HashSet<Item> items; // list of all items currently contained in the room

    public Room(String room_id, String level_id)
    {
        this.room_id = room_id;
        this.level_id = level_id;
        leads_to = new HashMap<>();
        dead_end = new HashMap<>();
        brief = "";
        description = "";
        items = new HashSet<>();
        visited = false;
    }

    public static void createPath(Room r1, String dir1, Room r2, String dir2)
    {
        if (!r1.leads_to.containsKey(dir1) && !r2.leads_to.containsKey(dir2))
        {
            r1.leads_to.put(dir1, r2);
            r2.leads_to.put(dir2, r1);
        }
    }

    // works assuming the path was there in the first place
    public static void removePath(Room r1, String dir1, Room r2, String dir2)
    {
        if (r1.leads_to.get(dir1) == r2 && r2.leads_to.get(dir2) == r1)
        {
            r1.leads_to.remove(dir1, r2);
            r2.leads_to.remove(dir2, r1);
        }
    }

    public boolean wasVisited()
    {
        return visited;
    }

    public void visit()
    {
        visited = true;
    }

    public boolean hasPathInDir(String dir)
    {
        return leads_to.containsKey(dir);
    }

    public boolean hasDeadEndInDir(String dir)
    {
        return dead_end.containsKey(dir);
    }

    public String getLevel_id()
    {
        return level_id;
    }

    public String getRoom_id()
    {
        return room_id;
    }

    public boolean containsItem(Item i)
    {
        return items.contains(i);
    }

    public void addItem(Item i)
    {
        items.add(i);
    }

    public void removeItem(Item i)
    {
        items.remove(i);
    }

    public void addBrief(String brief)
    {
        this.brief = brief;
    }

    public String getBrief()
    {
        return brief;
    }

    public void addDescription(String desc)
    {
        description = desc;
    }

    public String getDescription()
    {
        return description;
    }

    public void addPathTo(String dir, Room r)
    {
        leads_to.put(dir, r);
    }

    public void addDeadEnd(String dir, String message)
    {
        dead_end.put(dir, message);
    }

    public Room getPathInDir(String dir)
    {
        return leads_to.get(dir);
    }

    public String getDeadEndInDir(String dir)
    {
        return dead_end.get(dir);
    }

    public String getLookInfo()
    {
        String info = "";

        info += description;
        info += "\n\n";

        if(!items.isEmpty())
        {
            info += "This room contains the following items:";
            for (Item item: items)
            {
                info += "\n" + item.getItem_id();
            }
        }
        else
        {
            info += "This room contains no items.";
        }

        info += "\n";
        if(!leads_to.isEmpty())
        {
            info += "\nThis room has the following exits:";
            for (String dir: leads_to.keySet())
            {
                info += "\nTo the " + dir + ": " + leads_to.get(dir).getRoom_id();
            }
        }
        else
        {
            info += "\nThis room has no immediate exits.";
        }
        return info;
    }
}
