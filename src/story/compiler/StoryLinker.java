package story.compiler;

import standard.engine.*;

import java.util.Set;

/**
 * Links an unlinked engine
 */
public class StoryLinker
{
    private int error_cnt;
    private String error_report;

    public StoryLinker()
    {
        error_cnt = 0;
        error_report = "";
    }

    public Engine linkEngine(Engine eng)
    {
        // first create the player
        eng.makePlayer(linkRoom(new Room(eng.getStartLocation()), "player", eng));

        // first link up the rooms
        Set<String> roomKeySet = eng.getRoomKeySet();
        for (String room_id: roomKeySet)
        {
            Room cur_room = eng.findRoom(room_id);
            // messages bit:
            cur_room.setBrief(linkMessage(cur_room.getBriefMsg(), cur_room.getRoom_id(), eng));
            cur_room.setDescription(linkMessage(cur_room.getDescriptionMsg(), cur_room.getRoom_id(), eng));

            // sort out the direct room connections
            Set<String> leadsToKeySet = cur_room.getLeadsToKeySet();
            for(String dir: leadsToKeySet)
            {
                cur_room.addPathTo(dir, linkRoom(cur_room.getPathInDir(dir), room_id, eng));
            }

            // sort out the dead ends
            Set<String> deadEndKeySet = cur_room.getDeadEndKeySet();
            for(String dir: deadEndKeySet)
            {
                cur_room.addDeadEnd(dir, linkMessage(cur_room.getDeadEndInDirMsg(dir), room_id, eng));
            }
        }

        Set<String> itemKeySet = eng.getItemKeySet();
        for(String item_id : itemKeySet)
        {
            Item curr_item = eng.findItem(item_id);
            // link the description
            curr_item.setDescription(linkMessage(curr_item.getDescriptionMsg(), item_id, eng));

            // add the items to their rooms and the player inventory
            switch (curr_item.getLocationFlag())
            {
                case room:
                    curr_item.setLocation(linkRoom(curr_item.getLocation(), item_id, eng));
                    break;
                case inv:
                    eng.getPlayer().giveItem(curr_item);
                    break;
            }
        }

        Set<String> stepKeySet = eng.getStepKeySet();
        for(String step_id : stepKeySet)
        {
            StoryStep curr_step = eng.findStep(step_id);
    
        }

        if(error_cnt == 0)
            return eng;

        // report the errors and empty the linker error state
        System.err.println(error_report + "Linking failed!\nNumber of errors: " + error_cnt);
        error_cnt = 0;
        error_report = "";
        return null;
    }

    private Message linkMessage(Message msg, String parent_id, Engine eng)
    {
        if(msg.getMsg() != null)
        {
            return msg;
        }
        else
        {
            if(!eng.hasMessage(msg.getMsg_id()))
            {
                recordLinkerError(msg.getMsg_id(), parent_id);
                return null;
            }
            return eng.findMessage(msg.getMsg_id());
        }
    }

    private Room linkRoom(Room r, String parent_id, Engine eng)
    {
        if(!eng.hasRoom(r.getRoom_id()))
        {
            recordLinkerError(r.getRoom_id(), parent_id);
            return null;
        }
        return eng.findRoom(r.getRoom_id());
    }

    private void recordLinkerError(String child, String parent)
    {
        error_report += "Dangling reference [" + child + "] in object [" + parent + "]\n";
        error_cnt++;
    }
}
