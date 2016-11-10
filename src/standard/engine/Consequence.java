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
            case    "wait": type = ConsType.wait;                  break;
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

    // invokes the consequence
    public Effect invoke(Engine eng)
    {
        Effect effect = Effect.procede;
        Player player = eng.getPlayer();
        Room room, roomfrom, roomto;
        Item item;
        String dirfrom, dirto;
        switch (type)
        {
            case teleport:
                room = eng.findRoom(args.get(0));
                player.moveTo(room);
                break;
            case add_item_to_inv:
                item = eng.findItem(args.get(0));
                if(item.getLocationFlag() == Item.flag.room)
                {
                    room = item.getLocation();
                    room.removeItem(item);
                    item.setLocation(Item.flag.inv);
                    player.giveItem(item);
                }
                else if(item.getLocationFlag() == Item.flag.prod)
                {
                    item.setLocation(Item.flag.inv);
                    player.giveItem(item);
                }
                break;
            case remove_item_from_inv:
                item = eng.findItem(args.get(0));
                if(player.hasItem(item))
                {
                    room = player.getLocation();
                    item.setLocation(room);
                    item.setLocation(Item.flag.room);
                    player.removeItem(item);
                }
                break;
            case kill:
                effect = Effect.kill;
                break;
            case win:
                effect = Effect.win;
                break;
            case add_item_to_room:
                item = eng.findItem(args.get(0));
                roomto = eng.findRoom(args.get(1));
                roomfrom = item.getLocation();
                if(item.getLocationFlag() == Item.flag.room
                    && roomfrom != roomto)
                {
                    roomto.addItem(item);
                    roomfrom.removeItem(item);
                    item.setLocation(roomto);
                }
                else if(item.getLocationFlag() == Item.flag.prod)
                {
                    item.setLocation(Item.flag.room);
                    item.setLocation(roomto);
                }
                else if(item.getLocationFlag() == Item.flag.inv)
                {
                    item.setLocation(Item.flag.room);
                    item.setLocation(roomto);
                    player.removeItem(item);
                    roomto.addItem(item);
                }
                break;
            case remove_item_from_room:
                item = eng.findItem(args.get(0));
                room = eng.findRoom(args.get(1));
                if(item.getLocationFlag() == Item.flag.room)
                {
                    room.removeItem(item);
                    item.setLocation(Item.flag.prod);
                }
                break;
            case add_connector:
                roomfrom = eng.findRoom(args.get(0));
                dirfrom  = args.get(1);
                roomto   = eng.findRoom(args.get(2));
                dirto    = args.get(3);
                Room.createPath(roomfrom, dirfrom, roomto, dirto);
                break;
            case remove_connector:
                roomfrom = eng.findRoom(args.get(0));
                dirfrom  = args.get(1);
                roomto   = eng.findRoom(args.get(2));
                dirto    = args.get(3);
                Room.removePath(roomfrom, dirfrom, roomto, dirto);
                break;
            case wait:
                eng.waitTime(Integer.parseInt(args.get(0)));
                break;
        }
        return effect;
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
        add_item_to_room      - additr [item_id] [room_id]                             – adds [item_id] to [room_id]
        remove_item_from_room - rmitfr [item_id] [room_id]                             – removes [item_id] from [room_id]
        add_connector         - addcon [room_id1] [direction1] [room_id2] [direction2] – adds connector between rooms
        remove_connector      - rmcon  [room_id1] [direction1] [room_id2] [direction2] – removes connector between rooms if the connector exists

    */

    public enum ConsType
    {
        none, teleport, add_item_to_inv, remove_item_from_inv, kill, win, add_item_to_room, remove_item_from_room, add_connector, remove_connector, wait
    }
    public enum Effect
    {
        procede, win, kill
    }
}
