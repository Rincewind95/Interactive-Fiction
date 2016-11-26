package standard.engine;

import java.util.ArrayList;

/**
 * Created by Milos on 06/11/2016.
 */
public class Consequence implements Comparable
{
    private ConsType type;          // the type of the condition
    private ArrayList<String> args; // a list of the arguments the condition has

    // input creator
    public Consequence(String str_type, ArrayList<String> args)
    {
        type = ConsType.valueOf(str_type);
        this.args = args;
    }

    @Override
    public int compareTo(Object o)
    {
        if(o instanceof Consequence)
        {
            Consequence cnd = (Consequence) o;
            if(type.toString().compareTo(cnd.type.toString()) == 0)
            {
                int i = 0;
                for(; i < args.size() && i < cnd.args.size(); i++)
                {
                    if(args.get(i).compareTo(cnd.args.get(i)) != 0)
                    {
                        return args.get(i).compareTo(cnd.args.get(i));
                    }
                }
                if(i < args.size())
                    return 1;
                else if(i < cnd.args.size())
                    return 0;
            }
            else
            {
                return type.toString().compareTo(cnd.type.toString());
            }
        }
        return -1;
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
            case jmp:
                room = eng.findRoom(args.get(0));
                player.moveTo(room);
                break;
            case additinv:
                item = eng.findItem(args.get(0));
                if(item.getLocationFlag() == Item.flag.room)
                {
                    room = item.getLocation();
                    room.removeItem(item);
                    item.setLocationFlag(Item.flag.inv);
                    player.giveItem(item);
                }
                else if(item.getLocationFlag() == Item.flag.prod)
                {
                    item.setLocationFlag(Item.flag.inv);
                    player.giveItem(item);
                }
                break;
            case rmitinv:
                item = eng.findItem(args.get(0));
                if(player.hasItem(item))
                {
                    room = player.getLocation();
                    item.setLocation(room);
                    item.setLocationFlag(Item.flag.room);
                    player.removeItem(item);
                }
                break;
            case kill:
                effect = Effect.kill;
                break;
            case win:
                effect = Effect.win;
                break;
            case additr:
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
                    item.setLocationFlag(Item.flag.room);
                    item.setLocation(roomto);
                }
                else if(item.getLocationFlag() == Item.flag.inv)
                {
                    item.setLocationFlag(Item.flag.room);
                    item.setLocation(roomto);
                    player.removeItem(item);
                    roomto.addItem(item);
                }
                break;
            case rmitfr:
                item = eng.findItem(args.get(0));
                room = eng.findRoom(args.get(1));
                if(item.getLocationFlag() == Item.flag.room)
                {
                    room.removeItem(item);
                    item.setLocationFlag(Item.flag.prod);
                }
                break;
            case addcon:
                roomfrom = eng.findRoom(args.get(0));
                dirfrom  = args.get(1);
                roomto   = eng.findRoom(args.get(2));
                dirto    = args.get(3);
                Room.createPath(roomfrom, dirfrom, roomto, dirto);
                break;
            case rmcon:
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

    public ArrayList<String> getArgs()
    {
        return args;
    }

    public ConsType getType()
    {
        return type;
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
        jmp                   - jmp [room_id]      – jmp player to [room_id]
        additinv              - additinv [item_id] – adds [item_id] to inventory
        rmitinv               - rmitinv [item_id]  – removes [item_id] from inventory
        kill                  - kill               - kills the player and the game terminates
        win                   - win                - player wins and the game terminates
    Room
        additr                - additr [item_id] [room_id]                             – adds [item_id] to [room_id]
        rmitfr                - rmitfr [item_id] [room_id]                             – removes [item_id] from [room_id]
        addcon                - addcon [room_id1] [direction1] [room_id2] [direction2] – adds connector between rooms
        rmcon                 - rmcon  [room_id1] [direction1] [room_id2] [direction2] – removes connector between rooms if the connector exists

    */

    public enum ConsType
    {
        none, jmp, additinv, rmitinv, kill, win, additr, rmitfr, addcon, rmcon, wait
    }

    public enum Effect
    {
        procede, win, kill
    }
}