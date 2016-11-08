package standard.engine;

import java.util.ArrayList;

/**
 * Created by Milos on 06/11/2016.
 */
public class Consequence
{
    private ConsType type;          // the type of the condition
    private ArrayList<String> args; // a list of the arguments the condition has

    // input creator
    public Consequence(String str_type) throws BadConsequenceException
    {
        switch (str_type)
        {
            case    "none": type = ConsType.none;                  break;
            case     "jmp": type = ConsType.teleport;              break;
            case "additin": type = ConsType.add_item_to_inv;       break;
            case "rmitinv": type = ConsType.remove_item_from_inv;  break;
            case    "kill": type = ConsType.kill;                  break;
            case     "win": type = ConsType.win;                   break;
            case  "additr": type = ConsType.add_item_to_room;      break;
            case  "rmitfr": type = ConsType.remove_item_from_room; break;
            case  "addcon": type = ConsType.add_connector;         break;
            case   "rmcon": type = ConsType.remove_connector;      break;
            default: throw new BadConsequenceException("bad consequence type: " + str_type);
        }
        args = new ArrayList<>();
    }

    public Consequence(String str_type, String arg1, String arg2, String arg3, String arg4) throws BadConsequenceException
    {
        this(str_type);
        args.add(arg1);
        args.add(arg2);
        args.add(arg3);
        args.add(arg4);
    }

    // evaluates the correctness of the condition on a given engine
    public void invoke(Engine eng)
    {
        switch (type)
        {
            case none:
                break;
            case teleport:
                break;
            case add_item_to_inv:
                break;
            case remove_item_from_inv:
                break;
            case kill:
                break;
            case win:
                break;
            case add_item_to_room:
                break;
            case remove_item_from_room:
                break;
            case add_connector:
                break;
            case remove_connector:
                break;
        }
    }

    public void printCons()
    {
        System.out.print(type);
        if (args != null)
            for (String arg : args)
            {
                System.out.print(" [" + arg + "]");
            }
        System.out.print("\n");
    }

    /*
    Empty
        none                  - none
    Player
        teleport              - jmp [room_id]      – teleport player to [room_id]
        add_item_to_inv       - additinv [item_id] – adds [item_id] to inventory
        remove_item_from_inv  - rmitinv [item_id]  – removes [item_id] from inventory
        kill                  - kill               - kills the player and the game terminates
        win                   - win                - player wins and the game terminates
    Room
        add_item_to_room      - additr [item_id]                                       – adds [item_id] to room
        remove_item_from_room - rmitfr [item_id]                                       – removes [item_id] from room
        add_connector         - addcon [room_id1] [direction1] [room_id2] [direction2] – adds connector between rooms
        remove_connector      - rmcon  [room_id1] [direction1] [room_id2] [direction2] – removes connector between rooms if the connector exists

    */

    public enum ConsType
    {
        none, teleport, add_item_to_inv, remove_item_from_inv, kill, win, add_item_to_room, remove_item_from_room, add_connector, remove_connector
    }
}
