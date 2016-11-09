package story.interpreter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import standard.engine.Engine;
import standard.engine.Message;
import standard.engine.Utility;
import story.parser.StoryGrammarBaseVisitor;
import story.parser.StoryGrammarParser;

/**
 * Created by Milos on 09/11/2016.
 */
public class StoryTreeVisitor extends StoryGrammarBaseVisitor<Boolean>
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
    public Boolean visitStory_elements(StoryGrammarParser.Story_elementsContext ctx)
    {
        // test all the children nodes
        Boolean result = true;
        int n = ctx.getChildCount();

        for (int i = 0; i < n; i++)
        {
            ParseTree c = ctx.getChild(i);
            Boolean childResult = visit(c);
            if(childResult != null)
                result = result && childResult;
        }

        return result;
    }

    @Override
    public Boolean visitWelcome(StoryGrammarParser.WelcomeContext ctx)
    {
        System.out.println("Step id is: " + Utility.strip_block_paren(ctx.step_id().getText()));
        System.out.println("Message id is: " + ctx.description());
        parseMessage(ctx.description());
        return true;
    }

    @Override
    public Boolean visitItem(StoryGrammarParser.ItemContext ctx)
    {
        return true;
    }

    @Override
    public Boolean visitMessage(StoryGrammarParser.MessageContext ctx)
    {
        String id   = ctx.message_id().getText();
        String text = ctx.message_text().getText();
        Message msg = new Message(id, text);

        return true;
    }

    public Message parseMessage(StoryGrammarParser.DescriptionContext ctx)
    {
        return null;
    }
}
