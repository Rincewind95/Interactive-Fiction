package story.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import standard.engine.Engine;
import story.parser.StoryGrammarLexer;
import story.parser.StoryGrammarParser;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Compiles a story from a given file
 */
public class StoryCompiler
{
    public static Engine complieStory(String story_loc)
    {
        Engine eng = null;
        try
        {
            ANTLRInputStream in = new ANTLRInputStream(new FileInputStream(story_loc));
            StoryGrammarLexer lexer = new StoryGrammarLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            StoryGrammarParser parser = new StoryGrammarParser(tokens);

            ParseTree tree = parser.story_elements();
            StoryTreeVisitor visitor = new StoryTreeVisitor();

            // evaluate the tree
            if(visitor.visit(tree))
                eng = visitor.extractEngine();
            else
            {
                return null;
            }

            eng = StoryLinker.linkEngine(eng);
        }
        catch (IOException error)
        {
            return null;
        }
        return eng;
    }
}
// C:\Users\Milos\Dropbox\Part II project Interactive Fiction\Testing\simple_story.txt