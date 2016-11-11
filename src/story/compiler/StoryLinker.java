package story.compiler;

import standard.engine.Engine;
import standard.engine.Message;
import standard.engine.Room;

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
        for (String room_id: eng.getRoomKeySet())
        {
            Room cur_room = eng.findRoom(room_id);
            // messages bit:
            cur_room.setBrief(linkMessage(cur_room.getBriefMsg(), cur_room.getRoom_id(), eng));
            cur_room.setDescription(linkMessage(cur_room.getBriefMsg(), cur_room.getRoom_id(), eng));


        }

        if(error_cnt == 0)
            return eng;

        System.err.println(error_report + "Linking failed!\nNumber of errors: " + error_cnt);
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

    private void recordLinkerError(String child, String parent)
    {
        error_report += "Dangling reference [" + child + "] in object [" + parent + "]\n";
        error_cnt++;
    }
}
