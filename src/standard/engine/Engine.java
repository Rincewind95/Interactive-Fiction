package standard.engine;

import story.interpreter.StoryInterpreter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Standard engine
 */
public class Engine
{
    private String start_id;
    private StoryStep start;                     // the initial story step, true from the start (the only one of the sort)
    private ArrayList<Room> rooms;               // list of the rooms in the game on all levels
    private ArrayList<Item> items;               // list of all possible items in the game
    private HashMap<String, Room> findroom;      // quick search for rooms via their id
    private HashMap<String, Item> finditem;      // quick search for items via their id

    private HashMap<String, Message> findmsg;    // used during engine creation to link the messages

    private HashSet<String> special;             // a map of all possible special commands
    private ArrayList<StoryStep> steps;          // a list of all possible story steps
    private HashMap<String, StoryStep> findstep; // quick search for steps via their id
    private Player player;                       // the star of the show

    private int time;                            // the current time step of the game
    private ArrayList<Command> prev_commands;    // a list of all previous player commands
    private ArrayList<StoryStep> prev_steps;     // a list of all previously satisfied steps

    public Engine()
    {
        // empty game initialisation
        time = 1;
        prev_commands = new ArrayList<>();
        prev_steps = new ArrayList<>();

        rooms = new ArrayList<>();
        items = new ArrayList<>();
        findroom = new HashMap<>();
        finditem = new HashMap<>();
        findmsg = new HashMap<>();

        special = new HashSet<>();
        steps = new ArrayList<>();

        start = null;
        player = null;
    }

    public void start()
    {
        Scanner scanner = new Scanner(System.in);

        // start the game once the engine is loaded
        boolean gameRunning = true;

        // main input loop
        while (gameRunning)
        {
            System.out.print("[" + time + "] ");
            String userInput = scanner.nextLine();

            // temporary input parsing (there will be an intermediate parser step here later)
            Command command = new Command(userInput);

            // modify the engines internal state with the command and determine the outcome
            response resp = executeCommand(command);
            // test the outcome

            // the command is valid so we add it to the list of previous commands
            if(resp != Engine.response.badinput)
                prev_commands.add(command);

            // now we determine what to do next
            if (resp == Engine.response.exit) break;
            else if (resp == Engine.response.badinput ||
                    resp == Engine.response.skip) continue;

            // we advance time, check constraints and potentially generate another response
            advanceTime();
            gameRunning = checkConstraints();
        }

        scanner.close();
    }

    //------------------Parser-Related-Bit----------------------
    public void addMessage(String message_id, Message msg)
    {
        findmsg.put(message_id, msg);
    }

    // links the various ids in the engine together
    public boolean link()
    {
        // TODO link engine
        return true;
    }
    //----------------------------------------------------------

    private response executeCommand(Command command)
    {
        Command.Type type = command.getType();
        ArrayList<String> args = command.getArgs();

        response resp = response.good;

        switch (type)
        {
            case take:
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {
                    Item toTake = finditem.get(args.get(0));
                    if(!player.hasItem(toTake) &&
                        toTake.getLocationFlag() == Item.flag.room &&
                        toTake.getLocation() == player.getLocation())
                    {
                        // if the player is in the same room as the item, and does not have the item he can take it
                        System.out.println(toTake.getItem_id() + " picked up.");
                        // move the item to the players inventory
                        player.giveItem(toTake);
                        toTake.setLocation(Item.flag.inv);
                        // remove the item from its room
                        toTake.getLocation().removeItem(toTake);
                    }
                    else
                    {
                        // the conditions were not satisfied, so we print that nothing can be done
                        resp = response.badinput;
                    }
                }
                else resp = response.badinput;
                break;
            case drop:
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {
                    Item toDrop = finditem.get(args.get(0));
                    if(player.hasItem(toDrop))
                    {
                        // if the player has the item
                        System.out.println(toDrop.getItem_id() + " dropped.");
                        // remove the item from the players inventory
                        player.removeItem(toDrop);
                        // add the item to the room the player is in
                        toDrop.setLocation(Item.flag.room);
                        toDrop.setLocation(player.getLocation());
                        player.getLocation().addItem(toDrop);
                    }
                    else
                    {
                        // the conditions were not satisfied, so we print that nothing can be done
                        resp = response.badinput;
                    }
                }
                else resp = response.badinput;
                break;
            case use:
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {
                    Item toUse = finditem.get(args.get(0));
                    if(!player.hasItem(toUse) && !player.getLocation().containsItem(toUse))
                    {
                        // the player does not have the item and it is not in the room, so we print that nothing can be done
                        resp = response.badinput;
                    }
                }
                else resp = response.badinput;
                break;
            case useon:
                // first test for input validity
                if (finditem.containsKey(args.get(0)) && finditem.containsKey(args.get(1)))
                {
                    Item useItem = finditem.get(args.get(0));
                    Item onItem = finditem.get(args.get(0));
                    if(!player.hasItem(useItem) || !player.getLocation().containsItem(onItem))
                    {
                        // conditions were not met so fail
                        resp = response.badinput;
                    }
                }
                else resp = response.badinput;
                break;
            case combine:
                // first test for input validity
                if (finditem.containsKey(args.get(0)) && finditem.containsKey(args.get(1)))
                {
                    Item fir = finditem.get(args.get(0));
                    Item sec = finditem.get(args.get(0));
                    if(!player.hasItem(fir) || !player.hasItem(sec))
                    {
                        // conditions were not met so fail
                        resp = response.badinput;
                    }
                }
                else resp = response.badinput;
                break;
            case examine:
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {
                    Item toExamine = finditem.get(args.get(0));
                    if(!player.hasItem(toExamine) && !player.getLocation().containsItem(toExamine))
                    {
                        // the player does not have the item and it is not in the room, so we print that nothing can be done
                        resp = response.badinput;
                    }
                }
                else resp = response.badinput;
                break;
            case move:
                // first test for input validity
                if (args.get(0) == "N" ||
                    args.get(0) == "E" ||
                    args.get(0) == "S" ||
                    args.get(0) == "W")
                {
                    String dir = args.get(0);
                    Room cur = player.getLocation();
                    if(cur.hasPathInDir(dir))
                    {
                        Room room = cur.getPathInDir(dir);
                        player.moveTo(room);
                        if(room.wasVisited())
                            System.out.println(room.getBrief());
                        else
                        {
                            room.visit();
                            System.out.println(room.getDescription());
                        }
                    }
                    else if(cur.hasDeadEndInDir(dir))
                    {
                        // write the dead end message if there is one
                        System.out.println(cur.getDeadEndInDir(dir));
                    }
                    else
                    {
                        // write the default message if nothing else works
                        System.out.println("You cannot go there.");
                    }
                }
                else resp = response.badinput;
                break;
            case special:
                if(!special.contains(args.get(0)))
                {
                    // the command is not special
                    resp = response.badinput;
                }
                break;
            case load:
                // TODO implement load, save and restart mechanics
                resp = response.skip;
                break;
            case save:
                resp = response.skip;
                break;
            case restart:
                resp = response.skip;
                break;
            case history:
                System.out.println(getHistory());
                resp = response.skip;
                break;
            case inventory:
                System.out.println(player.listInventory());
                resp = response.skip;
                break;
            case look:
                System.out.println(player.getLocation().getLookInfo());
                resp = response.skip;
                break;
            case brief:
                System.out.println(player.getLocation().getBrief());
                resp = response.skip;
                break;
            case wait:
                System.out.println("Time passes.");
                break;

            case empty:
                resp = response.badinput;
                break;
            case exit:
                System.out.println("Game terminating...");
                resp = response.exit;
                break;
            case badcomm:
                resp = response.badinput;
                break;
        }

        // write responses if the command was bad
        if(resp == response.badinput)
            System.out.println("I don't understand...");
        return resp;
    }

    private boolean checkConstraints()
    {
        return true;
    }

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
        if(!prev_commands.isEmpty())
        {
            hist += "The previous commands have been:";
            int t = 1;
            for(Command com : prev_commands)
            {
                hist += "\n[" + t + "]: " + com.getOriginal();
            }
        }
        else
        {
            hist += "There is no history.";
        }
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

    public Command getPrevCommand()
    {
        if(prev_commands.size() == 0)
            return null;
        return prev_commands.get(prev_commands.size()-1);
    }

    public void waitTime(int t)
    {
        time += t;
    }

    // enumerates the possible response types which can be generated when processing user commands
    private enum response
    {
        good, skip, badinput, load, save, restart, exit
    }
}
