package story.interpreter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import standard.engine.Engine;
import story.parser.StoryGrammarLexer;
import story.parser.StoryGrammarParser;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * Created by Milos on 07/11/2016.
 */
public class StoryInterpreter
{
    private Engine eng; // the engine to be created
    private String story_loc;  // the location of the story file

    public StoryInterpreter(String story_loc)
    {
        try
        {
            System.out.println(story_loc);
            eng = null;
            this.story_loc = story_loc;
            ANTLRInputStream in = new ANTLRInputStream(new FileInputStream(story_loc));
            StoryGrammarLexer lexer = new StoryGrammarLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            StoryGrammarParser parser = new StoryGrammarParser(tokens);

            ParseTree tree = parser.story_elements();
            StoryTreeVisitor visitor = new StoryTreeVisitor();

            // evaluate the tree
            visitor.visit(tree);

            eng = visitor.extractEngine();
        }
        catch (IOException error)
        {
            System.out.println("fail!");
            eng = null;
        }
    }

    public Engine getEngine()
    {
        return eng;
    }
}
// C:\Users\Milos\Dropbox\Part II project Interactive Fiction\Testing\simple_story.txt