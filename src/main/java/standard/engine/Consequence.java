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
        Item item, container;
        String dirfrom, dirto;
        switch (type)
        {
            case jmp:
                // teleports the player to the given room
                room = eng.findRoom(args.get(0));
                player.moveTo(room);
                break;
            case additinv:
                // moves an item to the players inventory if it was not there already
                item = eng.findItem(args.get(0));
                item.moveItem(Item.flag.inv, null, eng);
                break;
            case rmit:
                // remove the item from the game by putting it to prod
                item = eng.findItem(args.get(0));
                item.moveItem(Item.flag.prod, null, eng);
                break;
            case kill:
                effect = Effect.kill;
                break;
            case win:
                effect = Effect.win;
                break;
            case additr:
                // moves the item to the given room (wherever the item was before)
                item = eng.findItem(args.get(0));
                roomto = eng.findRoom(args.get(1));
                item.moveItem(Item.flag.inroom, roomto, eng);
                break;
            case addcon:
                // adds a new "connector" between rooms
                roomfrom = eng.findRoom(args.get(0));
                dirfrom  = args.get(1);
                roomto   = eng.findRoom(args.get(2));
                dirto    = args.get(3);
                Room.createPath(roomfrom, dirfrom, roomto, dirto);
                break;
            case rmcon:
                // removes a "connector" which existed between two rooms
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
        rmit                  - rmit [item_id]     – removes [item_id] from game
        kill                  - kill               - kills the player and the game terminates
        win                   - win                - player wins and the game terminates
    Room
        additr                - additr [item_id] [room_id]                             – adds [item_id] to [room_id]
        addcon                - addcon [room_id1] [direction1] [room_id2] [direction2] – adds connector between rooms
        rmcon                 - rmcon  [room_id1] [direction1] [room_id2] [direction2] – removes connector between rooms if the connector exists

    */

    public enum ConsType
    {
        none, jmp, additinv, rmit, kill, win, additr, addcon, rmcon, wait
    }

    public enum Effect
    {
        procede, win, kill
    }
}
