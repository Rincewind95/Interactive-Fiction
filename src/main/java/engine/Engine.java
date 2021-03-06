package engine;

import engine.utility.FinalCompleter;
import engine.utility.Pair;
import engine.utility.Utility;
import input.parser.NLPparser;
import jline.console.ConsoleReader;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.*;

public class Engine
{
    private String start_id;                                 // the identifier of the first, necessarily satisfied story step (where to begin the story)
    private String start_location_id;                        // the starting location id of the player
    private Message welcome;                                 // the welcome message played at the start
    private Player player;                                   // the star of the show
    private HashMap<String, Room> findroom;                  // a map of the rooms in the game on all levels
    private HashMap<String, Item> finditem;                  // a map of all possible items in the game
    private HashSet<String> findspecial;                     // a map of all possible special commands
    private HashMap<String, Message> findmsg;                // used during engine creation to link the messages
    private HashMap<String, StoryStep> findstep;             // a map of all possible steps in the game
    private int time;                                        // the current time step of the game
    private ArrayList<Pair<Command, Integer>> prev_commands; // a list of all previous player commands
    private Command lastCommand;                             // the last command that was received
    private ArrayList<StoryStep> prev_steps;                 // a list of all previously satisfied steps
    private NLPparser parser;                                // the NLP parser which will parse user input

    private boolean enhanced;                                // true if the engine is in advanced mode
    private boolean alternate;                               // true if the engine should alternate responses
    private boolean doEvaluation;                            // true if the engine should request evaluation
    private boolean askForEvaluation;                        // true if the current step will ask the player for evaluation
    private ArrayList<Long> thinkTimes;                   // the array of all the think times between engine and response

    private ConsoleReader reader;

    private PrintWriter writer;
    private Writer transcriptWriter;

    private Writer logWriter;
    private FinalCompleter completer;
    private HashSet<String> item_suggestions;

    public Engine()
    {
        // empty game initialisation
        start_id = null;
        start_location_id = null;
        welcome = null;
        player = null;

        findroom = new HashMap<>();
        finditem = new HashMap<>();
        findspecial = new HashSet<>();
        findmsg = new HashMap<>();
        findstep = new HashMap<>();

        time = 1;
        prev_commands = new ArrayList<>();
        prev_steps = new ArrayList<>();

        enhanced = true;
        alternate = false;

        reader = null;
        writer = null;
        completer = null;

        item_suggestions = new HashSet<>();

        thinkTimes = new ArrayList<>();
    }

    public void setLogging(boolean log)
    {
        doEvaluation = log;
    }

    public void setLogger(Writer logger)
    {
        logWriter = logger;
    }

    public response start(boolean enhance, boolean alternating, ConsoleReader reader, PrintWriter writer, Writer transwriter)
    {
        try
        {
            enhanced = enhance;
            alternate = alternating;
            this.reader = reader;
            this.writer = writer;
            this.transcriptWriter = transwriter;
            this.completer = new FinalCompleter(new ArrayList<>());
            reader.addCompleter(completer);
            reader.setPrompt("> ");

            // reset the think times
            thinkTimes = new ArrayList<>();
            if(doEvaluation)
            {
                // log the tipe of engine and current date
                logWriter.write("ENGINE: " + (enhanced ? "ENHANCED" : "STANDARD") + "\r\n");
                logWriter.write("DATE: [" + Utility.currDate() + "]\r\n");
                logWriter.write("ENGINE INIT TIME: [" + Utility.currTime() + "]\r\n");
                logWriter.write(Utility.charLineOfLength("-", 40));
                logWriter.flush();
                // this is just for logging
                thinkTimes.add(System.currentTimeMillis());
                // reset the important commands
                Utility.resetImportantCommandTriggers();
            }

            // start the game once the engine is loaded
            boolean gameRunning = true;

            Utility.write(writer, Utility.getTipMessage(), transcriptWriter);

            Utility.write(writer, "\r\n"
                                  + welcome.getMsg() + "\r\n"
                                  + player.getLocation().getBrief() + "\r\n", transcriptWriter);

            // set the initial logoutput
            String logoutput = "";

            askForEvaluation = false;
            findroom.get(start_location_id).visit();
            // main input loop
            while (gameRunning)
            {
                // save the original timestamp
                int origtime = time;

                // update the enhanced/unenhanced engine state
                if (alternate)
                {
                    // randomly select which response will be returned
                    Random rnd = new Random();
                    int value = rnd.nextInt(2);

                    if (value == 0)
                        enhanced = true;
                    else
                        enhanced = false;
                }

                // update the request for evaluation
                boolean evaluationPending = askForEvaluation;
                askForEvaluation = false;

                updateItemSuggestions();
                // if new items were added, update the completer
                completer.updateObjectSuggestions(new ArrayList<>(item_suggestions));

                //reader.setPrompt("[" + time + "] ");
                String userInput = Utility.readLn(reader, transcriptWriter, Integer.toString(origtime));

                if(doEvaluation)
                {
                    // this is just for logging (to determine the total think time later)
                    thinkTimes.add(System.currentTimeMillis());
                }

                // input parsing
                Command command = parser.parseInput(userInput);

                // modify the engines internal state with the command and determine the outcome
                Pair<response, String> out = executeCommand(command);
                response resp = out.getKey();
                String out_to_user = out.getValue();

                if(doEvaluation && evaluationPending)
                {
                    // first test if the command is the special invalidation command for the previous evaluation
                    if (resp == response.invalidateprevious)
                    {
                        if(!logoutput.equals(""))
                        {
                            Utility.write(this.writer, Utility.invalidationSuccessful + "\r\n", transcriptWriter);
                            logoutput = "";
                        }
                        else
                        {
                            Utility.write(this.writer, Utility.invalidationFailed + "\r\n", transcriptWriter);
                        }
                        continue;
                    }
                    else
                    {
                        logWriter.write(logoutput);
                        logWriter.flush();
                        logoutput = "";
                    }
                }

                // the command is valid so we add it to the list of previous commands
                if (resp != Engine.response.badinput)
                {
                    prev_commands.add(new Pair<>(command, time));
                    lastCommand = command;
                }

                String final_out_to_user = out_to_user;

                // now we determine what to do next
                if (resp == Engine.response.exit)
                {
                    out_to_user = "\r\n" + out_to_user + "\r\n";
                    Utility.write(writer, out_to_user, transcriptWriter);
                    break;
                }
                else if (resp == response.restart)
                {
                    out_to_user = "\r\n" + out_to_user + "\r\n";
                    Utility.write(writer, out_to_user, transcriptWriter);
                    final_write();
                    reader.removeCompleter(completer);
                    return resp;
                }
                else if (resp == Engine.response.badinput ||
                        resp == Engine.response.skip)
                {
                    out_to_user = "\r\n" + out_to_user + "\r\n";
                    Utility.write(writer, out_to_user, transcriptWriter);
                    continue;
                }
                else if(resp == response.dropall ||
                        resp == response.takeall ||
                        resp == response.removeall ||
                        resp == response.examineall||
                        resp == response.examineinventory)
                {
                    Command.Type type;
                    Set<String> contents;
                    switch (resp)
                    {
                        case takeall:
                        default:
                            type = Command.Type.take;
                            contents = new HashSet<>(player.getLocation().getItemKeySet());
                            break;
                        case dropall:
                            type = Command.Type.drop;
                            contents = new HashSet<>(player.getInventoryKeySet());
                            break;
                        case removeall:
                            type = Command.Type.remove;
                            Set<String> keyset = findItem(command.getArgs().get(1)).getContainedKeySet();
                            contents = new HashSet<>(keyset);
                            for(String cont : keyset)
                            {
                                if(!findItem(cont).isTakeable())
                                    contents.remove(cont);
                            }
                            break;
                        case examineall:
                            type = Command.Type.examine;
                            contents = new HashSet<>(player.getLocation().getItemKeySet());
                            break;
                        case examineinventory:
                            type = Command.Type.examine;
                            contents = new HashSet<>(player.getInventoryKeySet());
                            break;
                    }

                    for(String item : contents)
                    {
                        // create the temp command
                        ArrayList<String> args = new ArrayList<>();
                        args.add(item);
                        if(resp == response.removeall)
                            args.add(command.getArgs().get(1));
                        Command curr = new Command(type, args);
                        lastCommand = curr;
                        // modify the engines internal state with the command and determine the outcome
                        if(!final_out_to_user.equals(""))
                            final_out_to_user += "\r\n";
                        if(type == Command.Type.examine)
                        {
                            if(!final_out_to_user.equals(""))
                                final_out_to_user += "\r\n";
                            final_out_to_user += "-- " + findItem(item).getFullID(enhanced) + ":\r\n";
                        }
                        String needsCentering = executeCommand(curr).getValue();

                        // we advance time, check constraints and potentially generate another response
                        advanceTime();
                        Pair<Consequence.Effect, String> final_out = checkConstraints();
                        Consequence.Effect eff = final_out.getKey();

                        needsCentering += final_out.getValue();
                        final_out_to_user += Utility.fixCentering(needsCentering);
                        switch (eff)
                        {
                            case kill:
                            case win:
                                askForEvaluation = false;
                                gameRunning = false;
                                break;
                        }
                        if(!final_out.getValue().equals(""))
                        {
                            // an event triggered during batch operation, so we interrupt it
                            final_out_to_user += "\r\n" + Utility.padBothSidesWithChar("remainder_of_batch_suspended_due_to_event", "_");
                            break;
                        }
                        if(!gameRunning)
                            break;
                    }
                }
                else
                {
                    // we advance time, check constraints and potentially generate another response
                    advanceTime();
                    Pair<Consequence.Effect, String> final_out = checkConstraints();
                    Consequence.Effect eff = final_out.getKey();
                    final_out_to_user += final_out.getValue();
                    switch (eff)
                    {
                        case kill:
                        case win:
                            askForEvaluation = false;
                            gameRunning = false;
                            break;
                    }
                }

                if (final_out_to_user.equals(""))
                {
                    if(enhanced)
                        final_out_to_user = "Nothing happens.";
                    else
                        final_out_to_user = "I don't understand your input.";
                }

                final_out_to_user = Utility.fixCentering(final_out_to_user);
                final_out_to_user = "\r\n" + final_out_to_user + "\r\n";
                Utility.write(writer, final_out_to_user, transcriptWriter);

                // do an evaluation if needed
                if(askForEvaluation && doEvaluation)
                {
                    int idx = Utility.wasImportant(command, this);
                    if(idx >= 0)
                    {
                        // always ask for opinion on the first instance of the important commands
                        // and then let it behave like the rest
                        Utility.importantCommands.get(idx).trigger();
                    }
                    else
                    {
                        Random rnd = new Random();
                        int prob = rnd.nextInt(100);
                        if (prob >= Utility.percentageThreshold)
                        {
                            // only ask for evaluation in 15% of normal cases
                            askForEvaluation = false;
                            logoutput = "";
                        }
                    }

                    if(askForEvaluation)
                    {
                        // obtain evaluation
                        Utility.write(writer, Utility.evaluationQuestion, transcriptWriter);
                        String evaluation = Utility.readLn(reader, transcriptWriter, Integer.toString(origtime));
                        while(!Utility.evaluationOptions.contains(evaluation))
                        {
                            Utility.write(writer, Utility.invalidOptionReply, transcriptWriter);
                            evaluation = Utility.readLn(reader, transcriptWriter, Integer.toString(origtime));
                        }
                        Utility.write(writer, Utility.successfulOptionReply + "\r\n", transcriptWriter);

                        // save the logging message
                        if(alternating)
                            logoutput = "\r\nENGINE TYPE_:" + (enhanced ? "ENHANCED" : "STANDARD");
                        logoutput +=    "\r\nTIMESTAMP: [" + Utility.currTime() + ", " + origtime +"]";
                        logoutput +=    "\r\nEVALUATION RESPONSE: " + evaluation;
                        switch(Integer.parseInt(evaluation))
                        {
                            case 1: logoutput += " - Strongly disagree"; break;
                            case 2: logoutput += " - Disagree"; break;
                            case 3: logoutput += " - Neither agree nor disagree"; break;
                            case 4: logoutput += " - Agree"; break;
                            case 5: logoutput += " - Strongly agree"; break;
                        }
                        logoutput += "\r\nUSER INPUT:";
                        logoutput += "\r\n> " + command.getOriginal() +
                                     "\r\n\r\nCOMMAND INTERPRETATION:" +
                                     "\r\n(" + command.getType().toString() + ")";
                        for(String arg : command.getArgs())
                        {
                            logoutput += " [" + arg + "]";
                        }
                        logoutput += "\r\n\r\nENGINE RESPONSE:" + Utility.formatText(final_out_to_user);

                        logoutput += "\r\nRELEVANT ENGINE STATE:";
                        logoutput += "\r\nPLAYER LOCATION: [" + player.getLocation().getRoom_id() + "]";

                        String items = "";
                        for(String arg : command.getArgs())
                        {
                            if(Utility.theAlls.contains(arg) || arg.equals("inventory"))
                            {
                                // we skip this case because we generaly do not care about state here
                                continue;
                            }
                            if(items.equals(""))
                                items = "\r\n\r\nITEMS:";
                            items += "\r\n\r\n[" + arg + "]";
                            Item it = findItem(arg);
                            items += it.getState(this);
                        }
                        logoutput += items;

                        logoutput += "\r\n" + Utility.charLineOfLength("-", 40) + "\r\n";
                    }
                }
            }

            final_write();
            reader.removeCompleter(completer);
            return response.exit;
        } catch (Throwable t)
        {
            t.printStackTrace();
        }

        final_write();
        reader.removeCompleter(completer);
        return  response.exit;
    }

    private void final_write()
    {
        if(doEvaluation)
        {
            try
            {
                logWriter.write(Utility.getThinkTimeAverage(thinkTimes));
                logWriter.flush();
            } catch (Exception e)
            {
            }
        }
    }

    private Pair<response, String> executeCommand(Command command)
    {
        Command.Type type = command.getType();
        ArrayList<String> args = command.getArgs();

        response resp = response.good;
        String out = "";

        String verb = command.getOriginalVerb();
        String connector = command.getOriginalConnector();

        switch (type)
        {
            case take:
                askForEvaluation = true;
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {
                    // we take the item and return the response
                    Item toTake = finditem.get(args.get(0));
                    Item.flag flag = toTake.getLocationFlag();
                    if(toTake.isTakeable() && flag == flag.inroom && (toTake.getLocation()) == player.getLocation())
                    {
                        // if the player is in the same room as the item, and does not have the item he can take it
                        out = "You take " + Utility.addThe(toTake.getFullID(enhanced)) + ".";
                        toTake.moveItem(flag.inv, null, this);
                    }
                    else if(toTake.isTakeable() && flag == flag.incont &&
                            (((Item)toTake.getLocation()).getLocation() == player.getLocation() ||
                                    player.hasItem((Item)toTake.getLocation())))
                    {
                        // if the player is in the same room as the items container, or has it, he can take the item
                        out = "You remove " + Utility.addThe(toTake.getFullID(enhanced)) + " from " + Utility.addThe(((Item)toTake.getLocation()).getFullID(enhanced)) + ".";
                        toTake.moveItem(flag.inv, null, this);
                    }
                    else if (!toTake.isTakeable())
                    {
                        out = "You cannot take " + Utility.addThe(toTake.getFullID(enhanced)) + ".";
                    }
                    else
                    {
                        // the conditions were not satisfied, so we print that nothing can be done
                        resp = response.badinput;
                    }
                }
                else if(args.get(0).equals("all"))
                {
                    // this is the special take all command - takes all the items in the room
                    resp = response.takeall;
                }
                else resp = response.badinput;
                break;
            case drop:
                askForEvaluation = true;
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {
                    Item toDrop = findItem(args.get(0));
                    if (player.hasItem(toDrop))
                    {
                        // if the player has the item
                        out = "You drop " + Utility.addThe(toDrop.getFullID(enhanced));
                        toDrop.moveItem(Item.flag.inroom, player.getLocation(), this);
                        // all rooms are at room temperature, so items dropped in them are set to room temperature
                        if (enhanced)
                        {
                            if(toDrop.getTemperature() != Item.Temperature.normal)
                                out += ", and this sets" +
                                        (Utility.isSingular(toDrop.getItem_id(), parser.getPipeline()) ? " its ":" their ")
                                        + "temperature to normal";
                        }
                        out += ".";
                        toDrop.setTemperature(Item.Temperature.normal);
                    }
                    else
                    {
                        // the conditions were not satisfied, so we print that nothing can be done
                        resp = response.badinput;
                    }
                }
                else if(args.get(0).equals("all"))
                {
                    // this is the special drop all command - takes all the items in the room
                    resp = response.dropall;
                }
                else resp = response.badinput;
                break;
            case use:
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {
                    Item toUse = finditem.get(args.get(0));
                    if (!player.hasItem(toUse) && !player.getLocation().containsItem(toUse))
                    {
                        // the player does not have the item and it is not in the room, so we print that nothing can be done
                        resp = response.badinput;
                    }
                }
                else resp = response.badinput;
                break;
            case useon:
            case combine:
                // first test for input validity
                if (finditem.containsKey(args.get(0)) && finditem.containsKey(args.get(1)))
                {
                    Item useItem = finditem.get(args.get(0));
                    Item onItem = finditem.get(args.get(1));
                    if ((!player.hasItem(useItem) && !player.getLocation().containsItem(useItem))
                     || (!player.hasItem(onItem) && !player.getLocation().containsItem(onItem)))
                    {
                        // conditions were not met so fail
                        resp = response.badinput;
                    }
                }
                else
                {
                    resp = response.badinput;
                }
                break;
            case putin:
                askForEvaluation = true;
                // first test for input validity
                if(finditem.containsKey(args.get(0)) && finditem.containsKey(args.get(1)))
                {
                    Item fir = finditem.get(args.get(0));
                    Item sec = finditem.get(args.get(1));
                    if(!player.hasItem(fir))
                    {
                        // require for us to have the first item in inventory
                        if(enhanced)
                        {
                            out = "You do not have " + Utility.addThe(fir.getFullID(enhanced)) +" in your inventory.";
                        }
                        else
                            resp = response.badinput;
                    }
                    else if(fir == sec)
                    {
                        if(enhanced)
                        {
                            out = "You cannot "+ verb + " " + Utility.addThe(fir.getFullID(enhanced)) + " " + connector + " itself.";
                        }
                        else
                        {
                            resp = response.badstandard;
                        }
                    }
                    else
                    {
                        if(sec.isContainer())
                        {
                            if (!fir.isTakeable())
                            {
                                out = "You cannot move " + Utility.addThe(fir.getFullID(enhanced)) + ".";
                            }
                            else
                            {
                                boolean fitsvol = true;
                                if (fir.getTotalVolume() > sec.getVolume(this))
                                {
                                    fitsvol = false;
                                    if (enhanced)
                                    {
                                        out += Utility.capitalise(Utility.addThe(fir.getFullID(enhanced))) + " " +
                                                (Utility.isSingular(fir.getItem_id(), parser.getPipeline()) ? "is" : "are") +
                                                " too big to fit " + connector + " " +
                                                Utility.addThe(sec.getFullID(enhanced)) + ".";
                                    }
                                    else
                                    {
                                        resp = response.badstandard;
                                    }
                                }

                                Pair<Boolean, String> canFitMass = sec.canAddItemsMass(fir, this);
                                boolean massfits = canFitMass.getKey();
                                String massOutput = canFitMass.getValue();

                                if(!massfits)
                                {
                                    if (enhanced)
                                    {
                                        if(!fitsvol)
                                            out += " It ";
                                        else
                                            out += "There is no point doing that, " + Utility.addThe(fir.getFullID(enhanced)) + " ";
                                        out += (Utility.isSingular(fir.getItem_id(), parser.getPipeline()) ? "is " : "are ") +
                                                massOutput;
                                        if(!fitsvol)
                                            out += " as well.";
                                        else
                                            out += ".";

                                               /* + "for you to " + verb + " " +
                                                (Utility.isSingular(fir.getItem_id(), parser.getPipeline()) ? "it" : "them")
                                                + " " + connector + " " +
                                                Utility.addThe(sec.getFullID(enhanced)) + ".";*/
                                    }
                                    else
                                    {
                                        resp = response.badstandard;
                                    }
                                }

                                if (((player.hasItem(sec) || player.getLocation().containsItem(sec))))
                                {
                                    if(fitsvol && massfits)
                                    {
                                        fir.moveItem(Item.flag.incont, sec, this);
                                        out = "You " + verb + " " + Utility.addThe(fir.getFullID(enhanced))
                                                + " " + connector + " " + Utility.addThe(sec.getFullID(enhanced));

                                        Item.State oldfir = fir.getTmpToState().get(fir.getTemperature());
                                        Item.State oldsec = fir.getTmpToState().get(sec.getTemperature());
                                        String result = Item.modifyTemperatures(fir, sec, parser.getPipeline());
                                        if (enhanced)
                                            out += result;
                                        out += ".";
                                        if(enhanced)
                                            out += fir.getStateChangeMessage(fir, oldfir, sec, oldsec);
                                    }
                                }
                                else
                                {
                                    if (enhanced)
                                    {
                                        out = "You can only interact with top-level items and their immediate content.";
                                        resp = response.good;
                                    }
                                    else
                                    {
                                        resp = response.badstandard;
                                    }
                                }
                            }
                        }
                        else
                        {
                            if (enhanced)
                            {
                                out = Utility.capitalise(Utility.addThe(sec.getFullID(enhanced))) + " is not a container.";
                                resp = response.good;
                            }
                            else
                            {
                                resp = response.badstandard;
                            }
                        }
                    }
                }
                else resp = response.badinput;
                break;
            case remove:
                askForEvaluation = true;
                // first test for input validity
                if(finditem.containsKey(args.get(0)) && finditem.containsKey(args.get(1)))
                {
                    Item fir = finditem.get(args.get(0));
                    Item sec = finditem.get(args.get(1));
                    if(fir.isTakeable() && sec.contains(fir) && (player.hasItem(sec) || player.getLocation().containsItem(sec)))
                    {
                        fir.moveItem(Item.flag.inv, null, this);
                        out = "You remove " + Utility.addThe(fir.getFullID(enhanced)) + " from " + Utility.addThe(sec.getFullID(enhanced)) + ".";
                    }
                }
                else if(args.get(0).equals("all") && finditem.containsKey(args.get(1)) &&
                        (player.hasItem(findItem(args.get(1))) ||
                        player.getLocation().containsItem(findItem(args.get(1)))))
                {
                    // the special remove all from command
                    resp = response.removeall;
                }
                else resp = response.badinput;
                break;
            case examine:
                askForEvaluation = true;
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {
                    Item toExamine = finditem.get(args.get(0));
                    if (!player.hasItem(toExamine) && !player.getLocation().containsItem(toExamine))
                    {
                        // the player does not have the item and it is not in the room, so we print that nothing can be done
                        resp = response.badinput;
                    }
                    else
                    {
                        out = toExamine.getExamination(this);
                    }
                }
                else if(args.get(0).equals("all"))
                {
                    // the special examine all command
                    resp = response.examineall;
                }
                else if(args.get(0).equals("inventory"))
                {
                    // the special examine inventory command
                    resp = response.examineinventory;
                }
                else resp = response.badinput;
                break;
            case move:
                // first test for input validity
                if (args.get(0).equals("n") ||
                        args.get(0).equals("e") ||
                        args.get(0).equals("s") ||
                        args.get(0).equals("w"))
                {
                    String dir = args.get(0);
                    Room cur = player.getLocation();
                    if (cur.hasPathInDir(dir))
                    {
                        Room room = cur.getPathInDir(dir);
                        player.moveTo(room);
                        if (!room.wasVisited())
                        {
                            room.visit();
                            out = room.getBrief();
                        }
                        else
                        {
                            out = room.getMoveInfo(this);
                        }
                    }
                    else if (cur.hasDeadEndInDir(dir))
                    {
                        // write the dead end message if there is one
                        out = cur.getDeadEndInDir(dir);
                    }
                    else
                    {
                        // write the default message if nothing else works
                        out = "You cannot go there.";
                    }
                }
                else resp = response.badinput;
                break;
            case special:
                if (!findspecial.contains(args.get(0)))
                {
                    // the command is not special
                    resp = response.badinput;
                }
                break;
            case load:
                // TODO implement load and save mechanics
                resp = response.skip;
                break;
            case save:
                resp = response.skip;
                break;
            case restart:
                out = "All unsaved progress is lost, game restarting...\r\n"
                +     Utility.dashedLine();
                resp = response.restart;
                break;
            case history:
                out = getHistory();
                resp = response.skip;
                break;
            case inventory:
                out = player.listInventory(this);
                resp = response.good;
                break;
            case look:
                out = player.getLocation().getLookInfo(this);
                resp = response.good;
                break;
            case brief:
                out = player.getLocation().getBrief();
                resp = response.skip;
                break;
            case wait:
                out = "Time passes.";
                break;
            case help:
                out = Utility.getHelpMessage(doEvaluation);
                resp = response.skip;
                break;
            case hint:
                // go through all the steps and isolate the ones that could be hinted
                ArrayList<StoryStep> candidates = new ArrayList<>();
                for (String step_id : findstep.keySet())
                {
                    if (step_id == start_id)
                        continue;
                    StoryStep curr_step = findStep(step_id);

                    if (curr_step.isHintCandidate() &&
                        curr_step.hasHint() &&
                        curr_step.playerIsInRigthRoom(this))
                    {
                        candidates.add(curr_step);
                    }
                }
                candidates.sort((StoryStep st1, StoryStep st2) ->
                                st1.lastParentSatisfactionTime(time) == st2.lastParentSatisfactionTime(time) ?
                                st1.satisfiedConditionCount(this)    - st2.satisfiedConditionCount(this) :
                                st1.lastParentSatisfactionTime(time) - st2.lastParentSatisfactionTime(time));

                if(candidates.isEmpty())
                {
                    out = "I cannot help you, no hints are available at this time.";
                }
                else
                {
                    out = candidates.get(0).getHint();
                }
                resp = response.skip;
                break;
            case empty:
                resp = response.badinput;
                break;
            case exit:
                out = "Game terminating...";
                resp = response.exit;
                break;
            case invalidate:
                if(doEvaluation)
                {
                    out = Utility.invalidationSuccessful + "\r\n";
                    resp = resp.invalidateprevious;
                }
                else
                {
                    resp = response.badinput;
                }
                break;
            case badcomm:
                resp = response.badinput;
                break;
        }

        // write responses if the command was bad
        if (resp == response.badinput)
            out = "I don't understand your input.";
        return new Pair<>(resp, out);
    }

    private Pair<Consequence.Effect, String> checkConstraints()
    {
        // currently a primitive solution!
        // TODO upgrade complexity if needed
        // Go through all the steps and check if they are satisfied
        String out = "";
        for (String step_id : findstep.keySet())
        {
            if (step_id == start_id)
                continue;
            StoryStep curr_step = findStep(step_id);

            if (curr_step.canBeSatisfied(this))
            {
                curr_step.satisfy(time);
                out = curr_step.getMessage().getMsg();
                return new Pair<>(curr_step.invokeConsequences(this), out);
            }
        }
        return new Pair<>(Consequence.Effect.procede, out);
    }

    // adds new items to the item suggestions list
    private void updateItemSuggestions()
    {
        Room current = player.getLocation();
        item_suggestions.clear();

        ArrayList<String> itemsPresent = current.listAllItems(this);
        for(String itemId : itemsPresent)
        {
            item_suggestions.add(findItem(itemId).getFullID(enhanced));
        }

        ArrayList<String> itemsInv = player.listAllItems(this);
        for(String itemId : itemsInv)
        {
            item_suggestions.add(findItem(itemId).getFullID(enhanced));
        }

        ArrayList<String> extras = new ArrayList<>();
        for(String item : item_suggestions)
        {
            HashSet<String> suffixes = new HashSet<>();
            String tmp = item;
            while (tmp.length() > 0 && tmp.contains(" "))
            {
                if (tmp.contains(" "))
                {
                    tmp = tmp.substring(tmp.indexOf(' ') + 1, tmp.length());
                    suffixes.add(tmp);
                }
                else
                    break;
            }
            for (String suffix : suffixes)
            {
                boolean shouldAdd = true;
                for (String curr : item_suggestions)
                {
                    if (curr.endsWith(suffix) && !curr.equals(item))
                    {
                        shouldAdd = false;
                        break;
                    }
                }
                if (shouldAdd)
                {
                    extras.add(suffix);
                }
            }
        }
        item_suggestions.addAll(extras);
    }

    //------------------Parser-Related-Bit----------------------
    public void setWelcome(String start_id, String room_id, Message welcome)
    {
        this.start_id = start_id;
        start_location_id = room_id;
        this.welcome = welcome;
    }

    public Message getWelcomeMessage()
    {
        return  welcome;
    }

    public void setWelcomeMessage(Message welcome)
    {
        this.welcome = welcome;
    }

    public void addRoom(String room_id, Room room)
    {
        findroom.put(room_id, room);
    }

    public void addItem(String item_id, Item item)
    {
        finditem.put(item_id, item);
    }

    public void addSpecial(String special_id)
    {
        findspecial.add(special_id);
    }

    public void addMessage(String message_id, Message msg)
    {
        findmsg.put(message_id, msg);
    }

    public void addStep(String step_id, StoryStep step)
    {
        findstep.put(step_id, step);
    }

    public void createParser()
    {
        parser = new NLPparser(this);
    }
    //------------------Linker-Related-Bit----------------------
    public Set<String> getRoomKeySet()
    {
        return findroom.keySet();
    }

    public Set<String> getItemKeySet()
    {
        return finditem.keySet();
    }

    public Set<String> getStepKeySet()
    {
        return findstep.keySet();
    }

    public void makePlayer(Room initial)
    {
        player = new Player(initial);
    }

    public String getStartLocation()
    {
        return start_location_id;
    }

    public String getStart_id()
    {
        return start_id;
    }
    //----------------------------------------------------------

    public int getTime()
    {
        return time;
    }

    public void advanceTime()
    {
        time++;
    }

    public Player getPlayer()
    {
        return player;
    }

    public String getHistory()
    {
        String hist = "";
        int dashcnt = 0;
        if (!prev_commands.isEmpty())
        {
            hist += "Command history:";
            for (Pair<Command, Integer> com : prev_commands)
            {
                hist += "\r\n> [" + com.getValue() + "] " + com.getKey().getOriginal();
                dashcnt = Math.max(dashcnt, 5 + com.getValue().toString().length() + com.getKey().getOriginal().length());
            }
        }
        else
        {
            hist += "Command history is empty.";
            dashcnt = 31;
        }
        hist += "\r\n";
        for(int i = 0; i < dashcnt; i++) hist += "-";
        return hist;
    }

    public Room findRoom(String room_id)
    {
        return findroom.get(room_id);
    }

    public Item findItem(String item_id)
    {
        return finditem.get(item_id);
    }

    public Message findMessage(String msg_id)
    {
        return findmsg.get(msg_id);
    }

    public StoryStep findStep(String step_id)
    {
        return findstep.get(step_id);
    }

    public boolean hasRoom(String room_id)
    {
        return findroom.containsKey(room_id);
    }

    public boolean hasItem(String item_id)
    {
        return finditem.containsKey(item_id);
    }

    public boolean hasMessage(String msg_id)
    {
        return findmsg.containsKey(msg_id);
    }

    public boolean hasStep(String step_id)
    {
        return findstep.containsKey(step_id);
    }

    public boolean hasSpecial(String special_id)
    {
        return findspecial.contains(special_id);
    }

    public Command getLastCommand()
    {
        if (prev_commands.size() == 0)
            return null;
        return lastCommand;
    }

    public NLPparser getParser()
    {
        return parser;
    }

    public PrintWriter getWriter()
    {
        return writer;
    }

    public Writer getTranscriptWriter()
    {
        return transcriptWriter;
    }

    public Writer getLogWriter()
    {
        return logWriter;
    }

    public void waitTime(int t)
    {
        time += t;
    }

    // enumerates the possible response types which can be generated when processing user commands
    public enum response
    {
        good, skip, badinput, load, save, restart, exit, takeall, dropall, removeall, examineall, examineinventory, invalidateprevious, badstandard
    }

    public boolean isEnhanced()
    {
        return enhanced;
    }

    public void setEnhanced(boolean enhanced)
    {
        this.enhanced = enhanced;
    }
}
