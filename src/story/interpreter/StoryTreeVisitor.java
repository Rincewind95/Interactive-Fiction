package story.interpreter;

import org.antlr.v4.runtime.ParserRuleContext;
import standard.engine.Engine;
import standard.engine.Utility;
import story.parser.StoryGrammarBaseVisitor;
import story.parser.StoryGrammarParser;

/**
 * Created by Milos on 09/11/2016.
 */
public class StoryTreeVisitor extends StoryGrammarBaseVisitor<String>
{
    private Engine eng;

    public StoryTreeVisitor()
    {
        eng = new Engine();
    }

    public Engine extractEngine()
    {
        return eng;
    }

    @Override
    public String visitStory_elements(StoryGrammarParser.Story_elementsContext ctx) {
        System.out.println("Story elements found!");
        return super.visitStory_elements(ctx);
    }

    @Override
    public String visitWelcome(StoryGrammarParser.WelcomeContext ctx)
    {

        System.out.println("Step id is: " + Utility.strip_block_paren(ctx.step_id().getText()));
        System.out.println("Message id is: " + Utility.strip_block_paren(ctx.step_id().getText()));
        return null;
    }
}
