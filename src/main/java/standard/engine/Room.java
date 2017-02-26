package standard.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Milos on 06/11/2016.
 */
public class Room extends ItemLocation
{
    private String room_id;                    // the unique name of the room
    private String level_id;                   // the unique name of the level the room is located on
    private HashMap<String, Room> leads_to;    // the rooms that can be accessed from the N,E,S,W passages of the room
    private HashMap<String, Message> dead_end; // a map of messages which are printed if one tries to go in a dead end (defaults to "Cannot go there")
    private boolean visited;                   // true if the room was ever visited

    private Message brief;       // message printed upon first entry to the room
    private Message description; // short description printed upon consequent entries
    private HashMap<String, Item> items; // list of all items currently contained in the room

    public Room(String room_id)
    {
        // placeholder constructor
        this.room_id = room_id;
    }

    public Room(String room_id, String level_id)
    {
        this.room_id = room_id;
        this.level_id = level_id;
        this.leads_to = new HashMap<>();
        this.dead_end = new HashMap<>();
        this.items = new HashMap<>();
        visited = false;
    }

    public Room(String room_id,
                String level_id,
                Message brief,
                Message description)
    {
        this.room_id = room_id;
        this.level_id = level_id;
        this.leads_to = new HashMap<>();
        this.dead_end = new HashMap<>();
        this.brief = brief;
        this.description = description;
        this.items = new HashMap<>();
        visited = false;
    }

    //------------------Linker-Related-Bit----------------------
    public Set<String> getLeadsToKeySet()
    {
        return leads_to.keySet();
    }
    public Set<String> getDeadEndKeySet()
    {
        return dead_end.keySet();
    }
    //----------------------------------------------------------

    public Set<String> getItemKeySet()
    {
        return items.keySet();
    }

    public static void createPath(Room r1, String dir1, Room r2, String dir2)
    {
        r1.leads_to.put(dir1, r2);
        r2.leads_to.put(dir2, r1);
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

    public void setVisited(boolean visited)
    {
        this.visited = visited;
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

    public void setLevel_id(String level_id)
    {
        this.level_id = level_id;
    }

    public String getRoom_id()
    {
        return room_id;
    }

    public void setRoom_id(String room_id)
    {
        this.room_id = room_id;
    }

    public boolean containsItem(Item i)
    {
        return items.containsKey(i.getItem_id());
    }

    public void addItem(Item i)
    {
        items.put(i.getItem_id(), i);
    }

    public void removeItem(Item i)
    {
        if(items.containsKey(i.getItem_id()))
            items.remove(i.getItem_id(), i);
    }

    public void addBrief(Message brief)
    {
        this.brief = brief;
    }

    public Message getBriefMsg()
    {
        return brief;
    }

    public String getBrief()
    {
        return brief.getMsg();
    }

    public void setBrief(Message brief)
    {
        this.brief = brief;
    }

    public void setDescription(Message desc)
    {
        description = desc;
    }

    public String getDescription()
    {
        return description.getMsg();
    }

    public Message getDescriptionMsg()
    {
        return description;
    }

    public void addPathTo(String dir, Room r)
    {
        leads_to.put(dir, r);
    }

    public void addDeadEnd(String dir, Message message)
    {
        dead_end.put(dir, message);
    }

    public Room getPathInDir(String dir)
    {
        return leads_to.get(dir);
    }

    public String getDeadEndInDir(String dir)
    {
        return dead_end.get(dir).getMsg();
    }

    public Message getDeadEndInDirMsg(String dir)
    {
        return dead_end.get(dir);
    }

    public String getLookInfo(Engine eng)
    {
        String info = "";

        info += getDescription();

        if (!items.isEmpty())
        {
            for (String item_id : items.keySet())
            {
                info += "\nThere " +
                        (Utility.isSingular(item_id, eng.getParser().getPipeline()) ?
                                "is " + Utility.addAorAn(eng.findItem(item_id).getIDWithTempAndState(eng.isEnhanced())):
                                "are " + item_id) +
                        " here.";
                        //eng.findItem(item_id).listContents(eng, "");
            }
        }

        if (!leads_to.isEmpty())
        {
            for (String dir : leads_to.keySet())
            {
                info += "\n" + Utility.exitMap.get(dir) + Utility.addThe(leads_to.get(dir).getRoom_id()) + ".";
            }
        }
        return info;
    }

    public String getMoveInfo(Engine eng)
    {
        String info = "";

        info += getDescription();

        if (!items.isEmpty())
        {
            for (String item_id : items.keySet())
            {
                info += "\nThere " +
                        (Utility.isSingular(item_id, eng.getParser().getPipeline()) ?
                                "is " + Utility.addAorAn(item_id):
                                "are " + item_id) +
                        " here.";
                    //eng.findItem(item_id).listContents(eng, "");
            }
        }
        return info;
    }

    public ArrayList<String> listAllItems(Engine eng)
    {
        ArrayList<String> allItems = new ArrayList<>();
        allItems.addAll(items.keySet());
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
