package standard.engine;

import java.util.ArrayList;

/**
 * Created by Milos on 06/11/2016.
 */
public class Condition implements Comparable
{
    private CondType type;          // the type of the condition
    private ArrayList<String> args; // a list of the arguments the condition has

    // input creator
    public Condition(String str_type, ArrayList<String> args)
    {
        type = CondType.valueOf(str_type);
        this.args = args;
    }

    @Override
    public int compareTo(Object o)
    {
        if(o instanceof Condition)
        {
            Condition cnd = (Condition) o;
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
            case plir:
                resp = player.getLocation() == eng.findRoom(args.get(0));
                break;
            case plnir:
                resp = player.getLocation() != eng.findRoom(args.get(0));
                break;
            case plilv:
                resp = player.getLocation().getLevel_id().equals(args.get(0));
                break;
            case itir:
                item = eng.findItem(args.get(0));
                room = eng.findRoom(args.get(1));
                resp = room.containsItem(item);
                break;
            case itnir:
                item = eng.findItem(args.get(0));
                room = eng.findRoom(args.get(1));
                resp = !room.containsItem(item);
                break;
            case itinv:
                item = eng.findItem(args.get(0));
                resp = player.hasItem(item);
                break;
            case itninv:
                item = eng.findItem(args.get(0));
                resp = !player.hasItem(item);
                break;
            case iticon:
                item1 = eng.findItem(args.get(0));
                item2 = eng.findItem(args.get(1));
                resp = item2.contains(item1);
                break;
            case itnicon:
                item1 = eng.findItem(args.get(0));
                item2 = eng.findItem(args.get(1));
                resp = !item2.contains(item1);
                break;
            case combine:
                resp = com != null
                        && com.getType() == Command.Type.combine
                        && com.getArgs().get(0).equals(args.get(0))
                        && com.getArgs().get(1).equals(args.get(1));
                break;
            case examine:
                resp = com != null
                        && com.getType() == Command.Type.examine
                        && com.getArgs().get(0).equals(args.get(0));
                break;
            case use:
                resp = com != null
                        && com.getType() == Command.Type.use
                        && com.getArgs().get(0).equals(args.get(0));
                break;
            case useon:
                resp = com != null
                        && com.getType() == Command.Type.useon
                        && com.getArgs().get(0).equals(args.get(0))
                        && com.getArgs().get(1).equals(args.get(1));
                break;
            case move:
                resp = com != null
                        && com.getType() == Command.Type.move
                        && com.getArgs().get(0).equals(args.get(0));
                break;
            case special:
                resp = com != null
                        && com.getType() == Command.Type.special
                        && com.getArgs().get(0).equals(args.get(0));
                break;
        }

        return resp;
    }

    public ArrayList<String> getArgs()
    {
        return args;
    }

    public CondType getType()
    {
        return type;
    }

    public void printCond()
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
        Locational:
            plir    - plir [room_id]              – player in [room_id]
            plnir   - plnir [room_id]             – player not in [room_id]
            plilv   - plilv [level_id]            – player on [level_id]
            itir    - itir ([item_id],[room_id])  – [item_id] in [room_id]
            itnir   - itnir ([item_id],[room_id]) – [item_id] not in [room_id]
            itinv   - itinv [item_id]             – [item_id] in inv
            itninv  - itninv [item_id]            – [item_id] not in inv

        Previous command:
            combine - combine([item_id1], [item_id2])
            examine - examine [item_id]
            use     - use [item_id]
            useon   - useon ([item_id1], [item_id2])
            move    - move [direction]
            special - [special_id]
    */

    public enum CondType
    {
        plir, plnir, plilv, itir, itnir, itinv, itninv, iticon, itnicon, combine, examine, use, useon, move, special
    }
}
