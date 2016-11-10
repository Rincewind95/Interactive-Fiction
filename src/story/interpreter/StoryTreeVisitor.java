package story.interpreter;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
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
            if (childResult != null)
                result = result && childResult;
        }

        return result;
    }

    //----------------------Welcome-related----------------------------
    @Override
    public Boolean visitWelcome(StoryGrammarParser.WelcomeContext ctx)
    {
        Message desc = parseDescription(ctx.description());
        return true;
    }

    //----------------------Message-related----------------------------
    @Override
    public Boolean visitMessage(StoryGrammarParser.MessageContext ctx)
    {
        // create the message
        String id = parseMessage_id(ctx.message_id());
        String text = parseMessage_text(ctx.message_text());
        Message msg = new Message(id, text);

        // and save it for the linking
        eng.addMessage(id, msg);
        return true;
    }

    public Message parseBrief(StoryGrammarParser.BriefContext ctx)
    {
        // create a placeholder message and return it
        String id = parseMessage_id(ctx.message_id());
        String text = parseMessage_text(ctx.message_text());
        return new Message(id, text);
    }

    public Message parseDescription(StoryGrammarParser.DescriptionContext ctx)
    {
        // create a placeholder message and return it
        String id = parseMessage_id(ctx.message_id());
        String text = parseMessage_text(ctx.message_text());
        return new Message(id, text);
    }

    public String parseMessage_id(StoryGrammarParser.Message_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    public String parseMessage_text(StoryGrammarParser.Message_textContext ctx)
    {
        return ctx == null ? null : Utility.strip_quotes(ctx.getText());
    }

    //----------------------Room----related----------------------------
    public String parseRoom_id(StoryGrammarParser.Room_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    //----------------------Item----related----------------------------
    public String parseItem_id(StoryGrammarParser.Item_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    @Override
    public Boolean visitItem(StoryGrammarParser.ItemContext ctx)
    {
        return true;
    }

    //----------------------Special-related----------------------------
    public String parseSpecial_id(StoryGrammarParser.Special_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    //----------------------Step----related----------------------------
    public String parseStep_id(StoryGrammarParser.Step_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }
    //-----------------------------------------------------------------
}
