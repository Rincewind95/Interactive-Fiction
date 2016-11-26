package story.compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
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
            System.setErr(System.out); // reroute err to out, to get lexer and parser errors
            ANTLRInputStream in = new ANTLRInputStream(new FileInputStream(story_loc));
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
            // evaluate the tree
            visitor.visit(tree);
            eng = visitor.extractEngine();

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