package story.interpreter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;
import java.util.Optional;

/**
 * Created by Milos on 09/11/2016.
 */
public class StoryTreeErrorListener extends BaseErrorListener
{
    private Optional<String> error = Optional.empty();


    public void syntaxError(Recognizer<?,?> recognizer,
                                 Object offendingSymbol,
                                 int line,
                                 int charPositionInLine,
                                 String msg,
                                 RecognitionException e)
    {
        error = Optional.of(String.format("Failed to parse at line %d:%d due to %s", line, charPositionInLine + 1, msg));

    }
}