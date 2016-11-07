package standard.engine;

import java.util.ArrayList;

/**
 * Created by Milos on 06/11/2016.
 */
public class Condition
{
    private CondType type;          // the type of the condition
    private ArrayList<String> args; // a list of the arguments the condition has

    // parses the condition and inputs it
    public Condition(String unparsed)
    {

    }

    // evaluates the correctness of the condition on a given engine
    public boolean evaluate(Engine eng)
    {
        boolean resp = false;
        Player player = eng.getPlayer();
        Item item, item1, item2;
        Room room;
        Command com = eng.getPrevCommand();
        switch (type)
        {
            case player_in_room:
                resp = player.getLocation() == eng.findRoom(args.get(0));
                break;
            case player_not_in_room:
                resp = player.getLocation() != eng.findRoom(args.get(0));
                break;
            case player_on_level:
                resp = player.getLocation().getLevel_id().equals(args.get(0));
                break;
            case item_in_room:
                item = eng.findItem(args.get(0));
                room = eng.findRoom(args.get(1));
                resp = room.containsItem(item);
                break;
            case item_not_in_room:
                item = eng.findItem(args.get(0));
                room = eng.findRoom(args.get(1));
                resp = !room.containsItem(item);
                break;
            case item_in_inventory:
                item = eng.findItem(args.get(0));
                resp = player.hasItem(item);
                break;
            case item_not_in_inventory:
                item = eng.findItem(args.get(0));
                resp = !player.hasItem(item);
                break;
            case con_combine:
                resp = com != null
                        && com.getType() == Command.Type.combine
                        && com.getArgs().get(0).equals(args.get(0))
                        && com.getArgs().get(1).equals(args.get(1));
                break;
            case con_examine:
                resp = com != null
                        && com.getType() == Command.Type.examine
                        && com.getArgs().get(0).equals(args.get(0));
                break;
            case con_use:
                resp = com != null
                        && com.getType() == Command.Type.use
                        && com.getArgs().get(0).equals(args.get(0));
                break;
            case con_useon:
                resp = com != null
                    && com.getType() == Command.Type.useon
                    && com.getArgs().get(0).equals(args.get(0))
                    && com.getArgs().get(1).equals(args.get(1));
                break;
            case con_move:
                resp = com != null
                        && com.getType() == Command.Type.move
                        && com.getArgs().get(0).equals(args.get(0));
                break;
            case con_special:
                resp = com != null
                        && com.getType() == Command.Type.special
                        && com.getArgs().get(0).equals(args.get(0));
                break;
        }

        return resp;
    }

    /*
        Locational:
            player_in_room        - plir [room_id]              – player in [room_id]
            player_not_in_room    - plnir [room_id]             – player not in [room_id]
            player_on_level       - plilv [level_id]            – player on [level_id]
            item_in_room          - itir ([item_id],[room_id])  – [item_id] in [room_id]
            item_not_in_room      - itnir ([item_id],[room_id]) – [item_id] not in [room_id]
            item_in_inventory     - itinv [item_id]             – [item_id] in inv
            item_not_in_inventory - itninv [item_id]            – [item_id] not in inv

        Previous command:
            con_combine - combine([item_id1], [item_id2])
            con_examine - examine [item_id]
            con_use     - use [item_id]
            con_useon   - useon ([item_id1], [item_id2])
            con_move    - move [direction]
            con_special - [special_id]
    */

    public enum CondType
    {
        player_in_room, player_not_in_room, player_on_level, item_in_room, item_not_in_room, item_in_inventory, item_not_in_inventory, con_combine, con_examine, con_use, con_useon, con_move, con_special
    }
}
