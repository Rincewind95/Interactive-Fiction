package standard.engine;

import java.util.ArrayList;

/**
 * Command issues by user on the command line
 */
public class Command
{
    public static enum Type {take, drop, use, combine, inventory, examine, move, look, brief, wait, save, history, load, restart, exit, special}
    private Type type;
    private ArrayList<Argument> args;

    public Command(Type type, ArrayList<Argument> args)
    {
        this.type = type;
        this.args = args;
    }

    public Command(String input)
    {
        if ("exit".equals(input))
        {
            System.out.println("Game terminating...");
            type = Type.exit;
            args = null;
        }
        else
        {
            type = Type.load;
        }
    }

    public Type getType()
    {
        return type;
    }
}
