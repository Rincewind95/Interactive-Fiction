package story.compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import standard.engine.Engine;
import standard.engine.Message;
import standard.engine.Utility;
import story.parser.StoryGrammarBaseVisitor;
import story.parser.StoryGrammarParser;

/**
 * Creates an engine from a parse tree
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
            Boolean childResult = c.accept(this);
            if (childResult != null)
                result = result && childResult;
        }

        return result;
    }

    //----------------------Welcome-related----------------------------
    @Override
    public Boolean visitWelcome(StoryGrammarParser.WelcomeContext ctx)
    {
        String step_id = parseStep_id(ctx.step_id());
        String room_id = parseRoom_id(ctx.room_id());
        Message desc = parseDescription(ctx.description());
        eng.setWelcome(step_id, room_id, desc);
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

    public String parseLevel_id(StoryGrammarParser.Level_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    @Override
    public Boolean visitRoom(StoryGrammarParser.RoomContext ctx)
    {
        String room_id = parseRoom_id(ctx.room_id());
        String level_ = parseLevel_id(ctx.level_id());

        return true;
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
    //----------------------Error---related----------------------------
    //-----------------------------------------------------------------
}
