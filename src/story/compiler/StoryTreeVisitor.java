package story.compiler;

import com.sun.deploy.security.ruleset.RuleId;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.tool.Rule;
import standard.engine.Engine;
import standard.engine.Message;
import standard.engine.Room;
import standard.engine.Utility;
import story.parser.StoryGrammarBaseVisitor;
import story.parser.StoryGrammarParser;

/**
 * Creates an engine from a parse tree
 */
public class StoryTreeVisitor extends StoryGrammarBaseVisitor<Void>
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

    //----------------------Welcome-related----------------------------
    @Override
    public Void visitWelcome(StoryGrammarParser.WelcomeContext ctx)
    {
        String step_id = parseStep_id(ctx.step_id());
        String room_id = parseRoom_id(ctx.room_id());
        Message desc = parseDescription(ctx.description());
        eng.setWelcome(step_id, room_id, desc);
        return null;
    }

    //----------------------Message-related----------------------------
    @Override
    public Void visitMessage(StoryGrammarParser.MessageContext ctx)
    {
        // create the message
        String id = parseMessage_id(ctx.message_id());
        String text = parseMessage_text(ctx.message_text());
        Message msg = new Message(id, text);

        // and save it for the linking
        eng.addMessage(id, msg);
        return null;
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
        if(ctx == null)
            return null;
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
    public Void visitRoom(StoryGrammarParser.RoomContext ctx)
    {
        String room_id = parseRoom_id(ctx.room_id());
        String level_id = parseLevel_id(ctx.level_id());
        Message brief = parseBrief(ctx.brief());
        Message description = parseDescription(ctx.description());
        Room r = new Room(room_id, level_id, brief, description);
        for(StoryGrammarParser.ExitContext ex : ctx.exits().exit())
            addExitTo(r, ex);

        return null;
    }

    public void addExitTo(Room r, StoryGrammarParser.ExitContext ctx)
    {
        String dir = Utility.strip_special_chars(ctx.direction().getText());

        String room_id = parseRoom_id(ctx.room_id());
        Message msg = parseDescription(ctx.description());

        if(room_id != null)
        {
            // add a placeholder room
            r.addPathTo(dir, new Room(room_id));
        }
        else
        {
            // add a placeholder for the message
            r.addDescription(msg);
        }
    }

    //----------------------Item----related----------------------------
    public String parseItem_id(StoryGrammarParser.Item_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    @Override
    public Void visitItem(StoryGrammarParser.ItemContext ctx)
    {
        return null;
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
