package standard.engine;

import java.util.ArrayList;

/**
 * Command issues by user on the command line
 */
public class Command
{
    private Type type;
    private ArrayList<Argument> args;
    public Command(Type type, ArrayList<Argument> args)
    {
        this.type = type;
        this.args = args;
    }

    public Command(String input)
    {
        // extract the separate words (ignoring all whitespace)
        String noSpaces = input.replaceAll(" +", " ");
        if(noSpaces != null && noSpaces.startsWith(" "))
            noSpaces = noSpaces.replaceFirst(" +", "");
        String[] tokens = noSpaces.split("\\s");

        if(tokens.length == 0)
        {

        }
        switch (tokens[0])
        {
            // take
            case "take":
                type = Type.take;
                args = null;
                break;

            // drop
            case "drop":
                type = Type.drop;
                args = null;
                break;

            // use and useon
            case "use":
                type = Type.use;
                args = null;
                break;

            // combine
            case "combine":
                type = Type.combine;
                args = null;
                break;

            // examine
            case "examine":
                type = Type.examine;
                args = null;
                break;

            // move
            case "move":
                type = Type.move;
                args = null;
                break;


            case "load":
                type = Type.load;
                args = null;
                break;

            case "save":
                type = Type.save;
                args = null;
                break;

            case "inventory": type = Type.inventory; args = null; break;
            case      "look": type = Type.look;      args = null; break;
            case     "brief": type = Type.brief;     args = null; break;
            case      "wait": type = Type.wait;      args = null; break;
            case   "history": type = Type.history;   args = null; break;
            case   "restart": type = Type.restart;   args = null; break;
            case      "exit": type = Type.exit;      args = null; break;

            // TODO special

            default: type = Type.badcomm; args = null; break;
        }
    }

    public Type getType()
    {
        return type;
    }

    public static enum Type
    {
        take, drop, use, useon, combine, inventory, examine, move, look, brief, wait, save, load, history, restart, exit, special, badcomm
    }
}
