package story.compiler;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import standard.engine.*;

import java.util.ArrayList;
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

        // and the initial step
        eng.addStep(eng.getStart_id(), new StoryStep(eng.getStart_id(), true));

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
                    curr_item.setLocation(linkRoomWithItem(curr_item.getLocation(), curr_item, eng));
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
            curr_step.setMessage(linkMessage(curr_step.getMessage(), curr_step.getStep_id(), eng));

            // sort out the parents of the current node (and add it as their child)
            Set<String> parentStepsKeySet = curr_step.getParentStepsKeySet();
            for(String parent_step : parentStepsKeySet)
            {
                curr_step.addParent(parent_step, linkStep(curr_step.getParent(parent_step), curr_step, eng));
            }

            for(Condition cond : curr_step.getConditions())
            {
                linkCondition(cond, step_id, eng);
            }

            for(Consequence cons : curr_step.getConsequences())
            {
                linkConsequence(cons, step_id, eng);
            }

            // TODO check links for all the conditions and consequences
            // TODO check story consistency
        }

        if(error_cnt == 0)
            return eng;

        // report the errors and empty the linker error state
        System.out.println(error_report + "Linking failed!\nNumber of errors: " + error_cnt);
        error_cnt = 0;
        error_report = "";
        return null;
    }

    private void linkConsequence(Consequence cons, String parent_id, Engine eng)
    {
        Consequence.ConsType type = cons.getType();
        String constype = type.toString();
        ArrayList<String> args = cons.getArgs();
        switch (type)
        {
            case jmp:
                linkStoryRoom(args.get(0), constype, parent_id, eng);
                break;
            case additinv:
            case rmitinv:
                linkStoryItem(args.get(0), constype, parent_id, eng);
                break;
            case additr:
            case rmitfr:
                linkStoryItem(args.get(0), constype, parent_id, eng);
                linkStoryRoom(args.get(1), constype, parent_id, eng);
                break;
            case addcon:
            case rmcon:
                linkStoryItem(args.get(0), constype, parent_id, eng);
                linkStoryRoom(args.get(1), constype, parent_id, eng);
                linkStoryItem(args.get(2), constype, parent_id, eng);
                linkStoryRoom(args.get(3), constype, parent_id, eng);
                break;
        }
    }


    private void linkCondition(Condition cond, String parent_id, Engine eng)
    {
        Condition.CondType type = cond.getType();
        String condtype = type.toString();
        ArrayList<String> args = cond.getArgs();
        switch (type)
        {
            case plir:
            case plnir:
                linkStoryRoom(args.get(0), condtype, parent_id, eng);
                break;
            case itinv:
            case itninv:
            case examine:
            case use:
                linkStoryItem(args.get(0), condtype, parent_id, eng);
                break;
            case special:
                linkStorySpecial(args.get(0), condtype, parent_id, eng);
                break;
            case itir:
            case itnir:
                linkStoryItem(args.get(0), condtype, parent_id, eng);
                linkStoryRoom(args.get(1), condtype, parent_id, eng);
                break;
            case combine:
            case useon:
                linkStoryItem(args.get(0), condtype, parent_id, eng);
                linkStoryItem(args.get(1), condtype, parent_id, eng);
                break;
        }
    }

    private void linkStoryItem(String item_id, String type, String parent_id, Engine eng)
    {
        if(!eng.hasItem(item_id))
        {
            recordStoryStepLinkerError(item_id, type, parent_id);
        }
    }

    private void linkStoryRoom(String room_id, String type, String parent_id, Engine eng)
    {
        if(!eng.hasRoom(room_id))
        {
            recordStoryStepLinkerError(room_id, type, parent_id);
        }
    }

    private void linkStorySpecial(String special_id, String type, String parent_id, Engine eng)
    {
        if(!eng.hasSpecial(special_id))
        {
            recordStoryStepLinkerError(special_id, type, parent_id);
        }
    }

    private void recordStoryStepLinkerError(String child, String type, String parent)
    {
        error_report += "Dangling reference [" + child + "] for function " + type + " in story step [" + parent + "]\n";
        error_cnt++;
    }

    private StoryStep linkStep(StoryStep parent, StoryStep child, Engine eng)
    {
        if(!eng.hasStep(parent.getStep_id()))
        {
            recordLinkerError(parent.getStep_id(), child.getStep_id());
            return null;
        }
        parent = eng.findStep(parent.getStep_id());
        parent.addChild(child.getStep_id(), child);
        return parent;

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

    private Room linkRoomWithItem(Room r, Item i, Engine eng)
    {
        if(!eng.hasRoom(r.getRoom_id()))
        {
            recordLinkerError(r.getRoom_id(), i.getItem_id());
            return null;
        }
        Room room = eng.findRoom(r.getRoom_id());
        room.addItem(i);
        return room;
    }

    private void recordLinkerError(String child, String parent)
    {
        error_report += "Dangling reference [" + child + "] in object [" + parent + "]\n";
        error_cnt++;
    }
}
