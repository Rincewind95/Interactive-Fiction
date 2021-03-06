package engine;

import engine.utility.Utility;

import java.util.ArrayList;

/**
 * Command issues by user on the command line
 */
public class Command implements Comparable
{
    private Type type;
    private ArrayList<String> args;
    private String original;
    private String originalVerb;

    private String originalConnector; // not null only int the case the command has 2 arguments

    public Command(Type type)
    {
        this.type = type;
        args = new ArrayList<>();
    }

    public Command(Type type, String original, String originalVerb)
    {
        this.type = type;
        args = new ArrayList<>();
        this.original = original;
        this.originalVerb = originalVerb;
        this.originalConnector = "";
    }

    public Command(Type type, ArrayList<String> args, String original, String originalVerb)
    {
        this.type = type;
        this.args = args;
        this.original = original;
        this.originalVerb = originalVerb;
        this.originalConnector = "";
    }

    public Command(Type type, ArrayList<String> args, String original, String originalVerb, String originalConnector)
    {
        this.type = type;
        this.args = args;
        this.original = original;
        this.originalVerb = originalVerb;
        this.originalConnector = originalConnector;
    }

    public Command(Type type, ArrayList<String> args)
    {
        this.type = type;
        this.args = args;
        this.original = "";
        this.originalVerb = type.toString();
        this.originalConnector = "";
    }

    public Command(String input)
    {
        // extract the separate words (ignoring all whitespace and lowercasing the input beforehand)
        String noSpaces = Utility.removeWhiteSpace(input.toLowerCase());
        String[] tokens = noSpaces.split("\\s");

        // save a space-corrected version of the original
        original = String.join(" ", tokens);

        if(tokens.length == 0)
        {
            // the input was empty
            type = Type.empty;
            args = null;
            return;
        }
        // determine the type of action from the initial token
        switch (tokens[0])
        {
            case      "take": type = Type.take;      args = new ArrayList<>(); break;
            case      "drop": type = Type.drop;      args = new ArrayList<>(); break;
            case       "use": type = Type.use;       args = new ArrayList<>(); break; // use and useon
            case   "combine": type = Type.combine;   args = new ArrayList<>(); break;
            case   "examine": type = Type.examine;   args = new ArrayList<>(); break;
            case      "move": type = Type.move;      args = new ArrayList<>(); break;
            case      "load": type = Type.load;      args = new ArrayList<>(); break;
            case      "save": type = Type.save;      args = new ArrayList<>(); break;
            case "inventory": type = Type.inventory; args = null; break;
            case      "look": type = Type.look;      args = null; break;
            case     "brief": type = Type.brief;     args = null; break;
            case      "wait": type = Type.wait;      args = null; break;
            case   "history": type = Type.history;   args = null; break;
            case   "restart": type = Type.restart;   args = null; break;
            case      "exit": type = Type.exit;      args = null; break;

            default:
                // special commands return entire texts with reduced spaces as arguments
                type = Type.special;
                args = new ArrayList<>();
                args.add(String.join(" ", tokens));
                break;
        }

        // add the remaining arguments assuming no structure
        switch (type)
        {
            case use:
                // we need to test if it is a use or use on statement
                if(tokens.length >= 2)
                {
                    args.add(tokens[1]);
                    for(int i = 2; i < tokens.length; i++)
                    {
                        if (tokens[i].equals("on"))
                        {
                            // take this as sign of useon
                            type = Type.useon;
                            if (tokens.length > i + 1)
                            {
                                // add the second argument if one such exists
                                String result = tokens[i+1];
                                for(int j = i+2; j < tokens.length; j++)
                                    result += " " + tokens[j];
                                args.add(result);
                                break;
                            }
                            else
                            {
                                // the command was invalid
                                type = Type.badcomm;
                                args = null;
                                break;
                            }
                        }
                        else
                        {
                            args.set(0, args.get(0) + " " + tokens[i]);
                        }
                    }
                } else
                {
                    // the command was invalid
                    type = Type.badcomm;
                    args = null;
                    break;
                }
                break;

            case combine:
                // we need to take two arguments
                boolean success = false;
                if(tokens.length >= 4)
                {
                    args.add(tokens[1]);
                    for(int i = 2; i < tokens.length; i++)
                    {
                        if (tokens[i].equals("with"))
                        {
                            if (tokens.length > i + 1)
                            {
                                // add the second argument if one such exists
                                String result = tokens[i+1];
                                for(int j = i+2; j < tokens.length; j++)
                                    result += " " + tokens[j];
                                args.add(result);
                                success = true;
                                break;
                            }
                        }
                        else
                        {
                            args.set(0, args.get(0) + " " + tokens[i]);
                        }
                    }
                }
                if(!success)
                {
                    // the command was invalid
                    type = Type.badcomm;
                    args = null;
                }
                break;

            case take:case drop:case examine:
                // we concat the remaining tokens, assuming they are part of the expected item arguments name
                if(tokens.length >= 2)
                {
                    String result = tokens[1];
                    for(int i = 2; i < tokens.length; i++)
                        result += " " + tokens[i];
                    args.add(result);
                } else
                {
                    // the command was invalid
                    type = Type.badcomm;
                    args = null;
                }
                break;

            case move:case load: case save:
                // we only expect a single other token (either a cardinal direction, or load/save file location)
                if(tokens.length == 2)
                    args.add(tokens[1]);
                else
                {
                    // the command was invalid
                    type = Type.badcomm;
                    args = null;
                }
                break;
        }

    }

    public Type getType()
    {
        return type;
    }

    public String getOriginalVerb()
    {
        return originalVerb;
    }

    public String getOriginalConnector()
    {
        return originalConnector;
    }

    public enum Type
    {
        take, drop, use, useon, putin, remove, combine, inventory, examine, move, look, brief, wait, save, load, history, restart, exit, special, empty, badcomm, hint, help, invalidate
    }

    public String cmdToString()
    {
        String res = "";
        res += type;
        if(args != null)
            for (String arg:args)
            {
                res += " [" + arg + "]";
            }
        return res;
    }

    public String getOriginal()
    {
        return original;
    }

    public ArrayList<String> getArgs()
    {
        return args;
    }

    @Override
    public int compareTo(Object o)
    {
        Command other = (Command) o;
        if(!type.equals(other.type))
        {
            return type.compareTo(other.type);
        }
        int i;
        for(i = 0; i < args.size() && i < other.args.size(); i++)
        {
            if(!(args.get(i).equals(other.args.get(i))))
                return args.get(i).compareTo(other.args.get(i));
        }
        if(i < args.size())
            return 1;
        if(i < other.args.size())
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.compareTo(obj) == 0;
    }
}
