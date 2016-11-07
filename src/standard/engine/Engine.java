package standard.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Standard engine
 */
public class Engine
{
    private int time;                         // the current time step of the game
    private StoryStep start;                  // the initial story step, true from the start (the only one of the sort)
    private ArrayList<Room> rooms;            // list of the rooms in the game on all levels
    private ArrayList<Item> items;            // list of all possible items in the game
    private HashMap<String, Room> findroom;   // quicksearch for rooms via their id
    private HashMap<String, Item> finditem;   // quicksearch for items via their id

    private ArrayList<Command> prev_commands; // a list of all previous player commands
    private ArrayList<StoryStep> prev_steps;  // a list of all previously satisfied steps
    private HashSet<String> special;          // a map of all possible special commands
    private ArrayList<StoryStep> steps;       // a list of all possible story steps

    private Player player;                    // the star of the show

    public Engine(String story_loc)
    {
        // game initialisation
        time = 1;
        prev_commands = new ArrayList<>();
        prev_steps = new ArrayList<>();

        rooms = new ArrayList<>();
        items = new ArrayList<>();
        findroom = new HashMap<>();
        finditem = new HashMap<>();

        special = new HashSet<>();
        steps = new ArrayList<>();

        // TODO load story from the story_loc
        // for now the loading will be manual

        String start_message = "Welcome to the test game!";
        start = new StoryStep("start", start_message, true);
        System.out.println(start_message);
        steps.add(start);
        prev_steps.add(start);

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // may want to repeat this bit until a game is successfully loaded or exit has been input
        System.out.println("Please input the location of the story file to be loaded...");
        String story_location = scanner.nextLine();

        System.out.println("Attempting to load story file...\n");
        Engine eng = new Engine(story_location);
        // --------------------------------------------------------------------------------------

        // start the game once the engine is loaded
        boolean gameRunning = true;

        // main input loop
        while (gameRunning)
        {
            System.out.print("[" + eng.getTime() + "] ");
            String userInput = scanner.nextLine();

            // temporary input parsing (there will be an intermediate parser step here later)
            Command command = new Command(userInput);

            // modify the engines internal state with the command and determine the outcome
            response resp = eng.executeCommand(command);
            // test the outcome
            if (resp == response.exit) break;
            else if (resp == response.skip) continue;

            // check constraints and generate response
            gameRunning = eng.checkConstraints();
        }

        scanner.close();
    }

    private response executeCommand(Command command)
    {
        command.printCmd();
        Command.Type type = command.getType();
        ArrayList<String> args = command.getArgs();

        response resp = response.good;

        switch (type)
        {
            case take:
                // first test for input validity
                if (finditem.containsKey(args.get(0)))
                {

                }
                else resp = response.skip;
                break;
            case drop:
                break;
            case use:
                break;
            case combine:
                break;
            case examine:
                break;
            case move:
                break;
            case load:
                break;
            case save:
                break;
            case inventory:
                break;
            case look:
                break;
            case brief:
                break;
            case wait:
                break;
            case history:
                break;
            case restart:
                break;

            case empty:
                resp = response.skip;
                break;
            case exit:
                resp = response.exit;
                break;
            case badcomm:
                resp = response.skip;
                break;
        }

        // write responses if the command was bad
        switch (resp)
        {
            case skip:
                System.out.println("I don't understand...");
                break;
            case exit:
                System.out.println("Game terminating...");
        }
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

    // enumerates the possible response types which can be generated when processing user commands
    private enum response
    {
        good, skip, exit
    }
}
