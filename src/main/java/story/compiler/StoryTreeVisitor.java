package story.compiler;

import engine.*;
import engine.utility.ItemLocation;
import engine.utility.Pair;
import engine.utility.Utility;
import story.parser.StoryGrammarBaseVisitor;
import story.parser.StoryGrammarParser;

import java.util.*;

/**
 * Creates an engine from a parse tree
 */
public class StoryTreeVisitor extends StoryGrammarBaseVisitor<Void>
{
    private Engine eng;

    public String errorOut;

    public StoryTreeVisitor()
    {
        eng = new Engine();
        errorOut = "";
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
        return ctx == null ? null : Utility.strip_special_chars(ctx.getText().toLowerCase());
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
        ItemLocation location = null;

        if (ctx.location().INVENTORY() != null)
        {
            flag = Item.flag.valueOf(Utility.strip_special_chars(ctx.location().INVENTORY().toString()));
        }
        else if (ctx.location().PRODUCED() != null)
        {
            flag = Item.flag.valueOf(Utility.strip_special_chars(ctx.location().PRODUCED().toString()));
        }
        else if (ctx.location().IN_CONTAINER() != null)
        {
            flag = Item.flag.valueOf(Utility.strip_special_chars(ctx.location().IN_CONTAINER().toString()));
            location = new Item(parseItem_id(ctx.location().item_id()));
        }
        else
        {
            flag = Item.flag.inroom;
            location = new Room(parseRoom_id(ctx.location().room_id()));
        }

        // retrieve the parameter_fields if they exist, otherwise default to standard values
        Boolean isContainer = false;
        Item.HoldingType holdingType = Item.HoldingType.min;
        int holdingMass = 0;
        int volume = 0;
        int mass = 0;
        boolean surpress = true;
        Boolean fixedTemp = true;
        Item.Temperature temp = Item.Temperature.normal;
        HashMap<Item.Temperature, Item.State> tmpToState = new HashMap<>();
        boolean stateChanges = false;
        tmpToState.put(Item.Temperature.frozen, Item.State.solid);
        tmpToState.put(Item.Temperature.cold, Item.State.solid);
        tmpToState.put(Item.Temperature.normal, Item.State.solid);
        tmpToState.put(Item.Temperature.warm, Item.State.solid);
        tmpToState.put(Item.Temperature.hot, Item.State.solid);

        if(ctx.parameter_fields() != null)
        {
            // retrieve the item_type field
            if(ctx.parameter_fields().itemtype() != null)
            {
                if (ctx.parameter_fields().itemtype().IS_CONTAINER() != null)
                {
                    isContainer = true;
                    holdingType = Item.HoldingType.valueOf(Utility.strip_special_chars(ctx.parameter_fields().itemtype().holding_type().getText()));
                    holdingMass = Integer.parseInt(Utility.strip_special_chars(ctx.parameter_fields().itemtype().holding_mass().VALUE().getText()));
                }
                else
                {
                    isContainer = false;
                }
            }

            // retrieve volume field parameters
            if (ctx.parameter_fields().volume_field() != null)
                volume = Integer.parseInt(ctx.parameter_fields().volume_field().VALUE().getText());

            // retrieve mass_field parameters
            if(ctx.parameter_fields().mass_field() != null)
            {
                mass = Integer.parseInt(Utility.strip_special_chars(ctx.parameter_fields().mass_field().VALUE().getText()));
                surpress = ctx.parameter_fields().mass_field().SURPRESS() != null;
            }

            // retrieve temp_field parameters
            if(ctx.parameter_fields().temp_field() != null)
            {
                temp = Item.Temperature.valueOf(Utility.strip_special_chars(ctx.parameter_fields().temp_field().temp_level().getText()));
                String variability = Utility.strip_special_chars(ctx.parameter_fields().temp_field().temp_variability().getText());
                switch (variability)
                {
                    case "constant":
                        fixedTemp = true;
                        break;
                    default:
                        fixedTemp = false;
                        break;
                }
            }

            // retrieve state data
            if(ctx.parameter_fields().state_field() != null)
            {
                ArrayList<Pair<Item.Temperature, Item.State>> tmpToStateArray = new ArrayList<>();
                for(StoryGrammarParser.Scale_fieldContext sctx : ctx.parameter_fields().state_field().scale_field())
                {
                    // iterate through the scale fields and collect them
                    Item.State state = Item.State.valueOf(Utility.strip_special_chars(sctx.state_level().getText()));
                    Item.Temperature temperature = Item.Temperature.valueOf(Utility.strip_special_chars(sctx.temp_level().getText()));
                    for(Pair<Item.Temperature, Item.State> keyVal : tmpToStateArray)
                    {
                        if(keyVal.getKey() == temperature)
                        {
                            errorOut += "Duplicate temperature in item [" + item_id + "]," +
                                        "state field <" + state.toString() + ", " + temperature.toString() + ">\r\n";
                        }
                    }
                    if(errorOut.equals(""))
                        tmpToStateArray.add(new Pair<>(temperature, state));
                }
                if(errorOut.equals(""))
                {
                    // if we succeeded, we continue
                    tmpToState = new HashMap<>();
                    Collections.sort(tmpToStateArray, (pair1, pair2) -> pair1.getKey().compareTo(pair2.getKey()));
                    for (int i = 1; i < tmpToStateArray.size(); i++)
                    {
                        // test for correct state ordering
                        Item.State state0 = tmpToStateArray.get(i-1).getValue();
                        Item.State state1 = tmpToStateArray.get(i).getValue();
                        if(state0.compareTo(state1) >= 0)
                        {
                            errorOut += "Invalid state ordering [" + item_id + "], " +
                                        "state fields <" + tmpToStateArray.get(i-1).getKey().toString() +", " + state0.toString() +  "> and" +
                                        "<" +  tmpToStateArray.get(i).getKey().toString() + ", " + state1.toString() + ">\r\n";
                        }
                    }
                    for(Pair<Item.Temperature, Item.State> keyVal : tmpToStateArray)
                    {
                        // explaination:
                        // assuming that the drawing belos is the temperature scale (frozen at top, hot at bottom)
                        // then the solid/liquid/gaseous scale as follows: (-+ <=> ->)
                        // +
                        // |
                        // * solid
                        //
                        // +
                        // |
                        // * liquid
                        // |
                        // +
                        //
                        // * gaseous
                        // |
                        // +

                        switch (keyVal.getValue())
                        {
                            case solid:
                                for(int i = 0; i <= keyVal.getKey().ordinal(); i++)
                                {
                                    tmpToState.put(Item.Temperature.values()[i], keyVal.getValue());
                                }
                                break;
                            case liquid:
                                for(int i = 0; i < Item.Temperature.values().length; i++)
                                {
                                    if(!tmpToState.containsKey(Item.Temperature.values()[i]))
                                        tmpToState.put(Item.Temperature.values()[i], keyVal.getValue());
                                }
                                break;
                            case gaseous:
                                for(int i = 4; i >= keyVal.getKey().ordinal(); i--)
                                {
                                    tmpToState.put(Item.Temperature.values()[i], keyVal.getValue());
                                }
                                break;
                        }
                    }

                    // more error testing
                    if(tmpToState.size() != 5)
                    {
                        errorOut += "Missing <temperature, state> mapping in [" + item_id + "], " +
                                "mapping does not cover temperature interval [frozen,hot]\r\n";
                    }

                    // finally test if the state changes at all
                    Item.State st = tmpToState.get(Item.Temperature.frozen);
                    for(Item.Temperature tmp : tmpToState.keySet())
                    {
                        Item.State curr = tmpToState.get(tmp);
                        if(curr != st)
                        {
                            stateChanges = true;
                            break;
                        }
                    }
                }
            }
        }

        Message description = parseDescription(ctx.description());
        eng.addItem(item_id, new Item(item_id,takeable, flag, location,
                                      volume, isContainer, holdingType, holdingMass,
                                      mass, surpress,
                                      temp, fixedTemp,
                                      tmpToState, stateChanges,
                                      description));
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
        if (ctx.gate_type().ANDING() != null)
        {
            ander = true;
        }
        Message msg = parseDescription(ctx.description());

        StoryStep step = new StoryStep(step_id, msg, ander);

        parseRequiredSteps(step, ctx.required_steps());
        parseConditions(step, ctx.conditions());
        parseConsequences(step, ctx.consequences());

        if (ctx.hint() != null)
        {
            //set the hint if one exists
            step.setHint(parseDescription(ctx.hint().description()));
        }
        else
        {
            step.setHint(null);
        }

        eng.addStep(step_id, step);
        return null;
    }

    public void parseRequiredSteps(StoryStep step, StoryGrammarParser.Required_stepsContext ctx)
    {
        for(StoryGrammarParser.Step_beforeContext st : ctx.step_before())
        {
            String step_id = parseStep_id(st.step_id());

            step.addParent(step_id, new StoryStep(step_id));
            String time = Utility.strip_special_chars(st.TIME().getText());
            Integer i =  Integer.parseInt(time);
            step.addSatBefore(step_id, i);
        }
    }

    public void parseConditions(StoryStep step, StoryGrammarParser.ConditionsContext ctx)
    {
        for(StoryGrammarParser.ConditionContext cnd : ctx.condition())
        {
            String type = null;
            ArrayList<String> args = new ArrayList<>();
            HashMap<String, ArrayList<String>> synonyms = new HashMap<>();
            if(cnd.single_arg_cnd() != null)
            {
                StoryGrammarParser.Single_arg_cndContext cmd_ctx = cnd.single_arg_cnd();
                type = Utility.strip_special_chars(cmd_ctx.single_arg_cnd_type().getText());
                if(cnd.single_arg_cnd().extra_synonyms_single() != null)
                {
                    for(StoryGrammarParser.CommandContext cmd : cnd.single_arg_cnd().extra_synonyms_single().command())
                    {
                        synonyms.put(Utility.strip_special_chars(cmd.SYNONYM().getText()), null);
                    }
                }
                args.add(parseItem_id(cmd_ctx.item_id()));
            }
            else if(cnd.double_arg_cnd() != null)
            {
                StoryGrammarParser.Double_arg_cndContext cmd_ctx = cnd.double_arg_cnd();
                type = Utility.strip_special_chars(cmd_ctx.double_arg_cnd_type().getText());
                if(cnd.double_arg_cnd().extra_synonyms_double() != null)
                {
                    for(StoryGrammarParser.Double_commandContext cmd : cnd.double_arg_cnd().extra_synonyms_double().double_command())
                    {
                        String command = Utility.strip_special_chars(cmd.command().SYNONYM().getText());
                        ArrayList<String> connectors = new ArrayList<>();

                        // collect all the connectors and add them to the map
                        for(StoryGrammarParser.ConnectorContext con : cmd.connector())
                        {
                            connectors.add(Utility.strip_special_chars(con.getText()));
                        }
                        if(!synonyms.containsKey(command))
                        {
                            synonyms.put(command, connectors);
                        }
                        else
                        {
                            synonyms.get(command).addAll(connectors);
                        }
                    }
                }
                args.add(parseItem_id(cmd_ctx.item_id()));
                args.add(parseRoom_id(cmd_ctx.room_id()));
            }
            else
            {
                // move case
                type = Utility.strip_special_chars(cnd.CON_MOVE().getText());
                args.add(Utility.strip_special_chars(cnd.CON_MOVE().getText()));
            }

            step.addCondition(new Condition(type, synonyms, args, step));
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