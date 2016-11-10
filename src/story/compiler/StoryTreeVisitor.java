package story.compiler;

import com.sun.deploy.security.ruleset.RuleId;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.tool.Rule;
import standard.engine.*;
import story.parser.StoryGrammarBaseVisitor;
import story.parser.StoryGrammarParser;

import java.util.ArrayList;
import java.util.List;

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
        if (ctx == null)
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
        for (StoryGrammarParser.ExitContext ex : ctx.exits().exit())
            addExitTo(r, ex);

        eng.addRoom(room_id, r);
        return null;
    }

    public void addExitTo(Room r, StoryGrammarParser.ExitContext ctx)
    {
        String dir = parseDirection(ctx.direction());

        String room_id = parseRoom_id(ctx.room_id());
        Message msg = parseDescription(ctx.description());

        if (room_id != null)
        {
            // add a placeholder room
            r.addPathTo(dir, new Room(room_id));
        }
        else
        {
            // add a placeholder for the message
            r.addDeadEnd(dir, msg);
        }
    }

    public String parseDirection(StoryGrammarParser.DirectionContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    //----------------------Item----related----------------------------
    public String parseItem_id(StoryGrammarParser.Item_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    @Override
    public Void visitItem(StoryGrammarParser.ItemContext ctx)
    {
        String item_id = parseItem_id(ctx.item_id());
        String mobility = Utility.strip_special_chars(ctx.mobility().getText());
        Boolean takeable = false;
        switch (mobility)
        {
            case "takeable":
                takeable = true;
                break;
            default:
                takeable = false;
                break;
        }
        Item.flag flag;
        Room location = null;
        if(ctx.location().INVENTORY() != null)
        {
            flag = Item.flag.valueOf(Utility.strip_special_chars(ctx.location().INVENTORY().toString()));
        }else if(ctx.location().PRODUCED() != null)
        {
            flag = Item.flag.valueOf(Utility.strip_special_chars(ctx.location().PRODUCED().toString()));
        }
        else
        {
            flag = Item.flag.room;
            location = new Room(parseRoom_id(ctx.location().room_id()));
        }

        Message description = parseDescription(ctx.description());
        eng.addItem(item_id, new Item(item_id, takeable, flag, location, description));
        return null;
    }

    //----------------------special-related----------------------------
    public String parseSpecial_id(StoryGrammarParser.Special_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    @Override
    public Void visitSpecial(StoryGrammarParser.SpecialContext ctx)
    {
        String special_id = parseSpecial_id(ctx.special_id());
        eng.addSpecial(special_id);
        return null;
    }

    //----------------------Step----related----------------------------
    public String parseStep_id(StoryGrammarParser.Step_idContext ctx)
    {
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText());
    }

    @Override
    public Void visitStep(StoryGrammarParser.StepContext ctx)
    {
        String step_id = parseStep_id(ctx.step_id());
        Boolean ander = false;
        if(ctx.gate_type().ANDING() == null)
        {
            ander = true;
        }
        Message msg = parseDescription(ctx.description());

        StoryStep step = new StoryStep(step_id, msg, ander);

        parseRequiredSteps(step, ctx.required_steps());
        parseConditions(step, ctx.conditions());
        parseConsequences(step, ctx.consequences());

        eng.addStep(step_id, step);
        return null;
    }

    public void parseRequiredSteps(StoryStep step, StoryGrammarParser.Required_stepsContext ctx)
    {
        for(StoryGrammarParser.Step_beforeContext st : ctx.step_before())
        {
            String step_id = parseStep_id(st.step_id());
            step.addParent(new StoryStep(step_id));
        }
    }

    public void parseConditions(StoryStep step, StoryGrammarParser.ConditionsContext ctx)
    {
        for(StoryGrammarParser.ConditionContext cnd : ctx.condition())
        {
            String type = null;
            ArrayList<String> args = new ArrayList<>();
            if(cnd.single_arg_cnd() != null)
            {
                StoryGrammarParser.Single_arg_cndContext cmd_ctx = cnd.single_arg_cnd();
                type = Utility.strip_special_chars(cmd_ctx.single_arg_cnd_type().getText());
                args.add(parseItem_id(cmd_ctx.item_id()));
            }
            else if(cnd.double_arg_cnd() != null)
            {
                StoryGrammarParser.Double_arg_cndContext cmd_ctx = cnd.double_arg_cnd();
                type = Utility.strip_special_chars(cmd_ctx.double_arg_cnd_type().getText());
                args.add(parseItem_id(cmd_ctx.item_id()));
                args.add(parseRoom_id(cmd_ctx.room_id()));
            }
            else
            {
                // move case
                type = Utility.strip_special_chars(cnd.CON_MOVE().getText());
                args.add(Utility.strip_special_chars(cnd.CON_MOVE().getText()));
            }
            step.addCondition(new Condition(type, args));
        }
    }

    public void parseConsequences(StoryStep step, StoryGrammarParser.ConsequencesContext ctx)
    {
        for(StoryGrammarParser.ConsequenceContext cns : ctx.consequence())
        {
            String type = null;
            ArrayList<String> args = new ArrayList<>();
            if (cns.no_arg_cons() != null)
            {
                type = Utility.strip_special_chars(cns.no_arg_cons().getText());
            }
            else if(cns.single_arg_cons() != null)
            {
                StoryGrammarParser.Single_arg_consContext cmd_ctx = cns.single_arg_cons();
                type = Utility.strip_special_chars(cmd_ctx.single_arg_cons_type().getText());
                args.add(parseItem_id(cmd_ctx.item_id()));
            }
            else if(cns.double_arg_cons() != null)
            {
                StoryGrammarParser.Double_arg_consContext cmd_ctx = cns.double_arg_cons();
                type = Utility.strip_special_chars(cmd_ctx.double_arg_cons_type().getText());
                args.add(parseItem_id(cmd_ctx.item_id()));
                args.add(parseRoom_id(cmd_ctx.room_id()));
            }
            else if(cns.four_arg_cons() != null)
            {
                StoryGrammarParser.Four_arg_consContext cmd_ctx = cns.four_arg_cons();
                type = Utility.strip_special_chars(cmd_ctx.four_arg_cons_type().getText());
                List<StoryGrammarParser.DirectionContext> dirs = cmd_ctx.direction();
                List<StoryGrammarParser.Room_idContext> rooms = cmd_ctx.room_id();
                args.add(parseRoom_id(rooms.get(0)));
                args.add(parseDirection(dirs.get(0)));
                args.add(parseRoom_id(rooms.get(1)));
                args.add(parseDirection(dirs.get(1)));
            }
            else
            {
                // time case
                type = Utility.strip_special_chars(cns.WAIT().getText());
                args.add(Utility.strip_special_chars(cns.TIME().getText()));
            }
            step.addConsequence(new Consequence(type, args));
        }
    }

    //-----------------------------------------------------------------
}