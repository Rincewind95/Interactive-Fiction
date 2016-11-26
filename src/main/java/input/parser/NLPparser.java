package input.parser;

import standard.engine.Command;
import standard.engine.Engine;

import java.util.ArrayList;

/**
 * Created by Milos on 25/11/2016.
 */
public class NLPparser
{
    ArrayList<String> item_compounds;

    public NLPparser(Engine eng)
    {
        item_compounds = new ArrayList<>(eng.getItemKeySet());
    }

    public Command parseInput(String input)
    {
        // TODO do the parsing here
        return new Command(input);
    }
}
