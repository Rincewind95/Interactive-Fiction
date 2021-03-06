package story.compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import engine.Engine;
import story.parser.StoryGrammarLexer;
import story.parser.StoryGrammarParser;

import java.io.IOException;
import java.io.InputStream;

/**
 * Compiles a story from a given file
 */
public class StoryCompiler
{
    public static Engine complieStory(InputStream story_loc)
    {
        Engine eng = null;
        try
        {
            System.setErr(System.out); // reroute err to out, to get lexer and parser errors
            ANTLRInputStream in = new ANTLRInputStream(story_loc);
            StoryGrammarLexer lexer = new StoryGrammarLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            StoryGrammarParser parser = new StoryGrammarParser(tokens);

            ParseTree tree = parser.story_elements();
            if(parser.getNumberOfSyntaxErrors() > 0)
            {
                // fail and report error count
                System.out.println("Parsing failed!\nNumber of syntax errors: " + parser.getNumberOfSyntaxErrors());
                return null;
            }

            StoryTreeVisitor visitor = new StoryTreeVisitor();
            visitor.errorOut = "";
            // evaluate the tree
            visitor.visit(tree);
            eng = visitor.extractEngine();

            if(!visitor.errorOut.equals(""))
            {
                // there was an error, so we fail
                System.out.println(visitor.errorOut);
                return null;
            }

            StoryLinker linker = new StoryLinker();
            eng = linker.linkEngine(eng);
            if(eng != null)
                eng.createParser();
        }
        catch (IOException error)
        {
            return null;
        }
        return eng;
    }
}
// C:\Users\Milos\Dropbox\Part II project Interactive Fiction\Testing\simple_story.txt
// C:\Users\Milos\Dropbox\Part II project Interactive Fiction\Comparative Study\study_story.txt