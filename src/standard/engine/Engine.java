package standard.engine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Standard engine
 */
public class Engine
{
    private int time; // the current time step of the game
    private String start_message;  // the message to be displayed when the game is intially loaded
    private ArrayList<Room> rooms; // list of the rooms in the game on all levels
    private ArrayList<Item> items; // list of all possible items in the game

    private ArrayList<Command> prev_commands; // a list of all previous player commands
    private ArrayList<String> prev_steps;     // a list of all previously satisfied steps

    private ArrayList<StoryStep> steps; // a list of all possible story steps

    public Engine(String story_loc)
    {
        // game initialisation
        time = 1;
        prev_commands = new ArrayList<>();
        prev_steps = new ArrayList<>();
        prev_steps.add("start");

        rooms = new ArrayList<>();
        items = new ArrayList<>();

        // TODO load story from the story_loc

        start_message = "Welcome to the test game!";
        System.out.println(start_message);

    }

    private boolean executeCommand(Command command)
    {
        if(command.getType() == Command.Type.exit)
        {
            return false;
        }

        return true;
    }

    private boolean checkConstraints()
    {
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the location of the story file to be loaded...");
        String story_location = scanner.nextLine();

        System.out.println("Game initialising...\n");
        Engine eng = new Engine(story_location);
        boolean gameRunning = true;

        // main input loop
        while (gameRunning)
        {
            System.out.print("[" + eng.getTime() + "] ");
            String userInput = scanner.nextLine();

            // temporary input parsing (there will be an intermediate parser step here later)
            Command command = new Command(userInput);

            // modify the engines internal state with the command
            gameRunning = eng.executeCommand(command);

            // check constraints and generate response
            gameRunning = eng.checkConstraints();
        }

        scanner.close();
    }

    public int getTime()
    {
        return time;
    }

    public void setTime(int newTime)
    {
        time = newTime;
    }

    public void advanceTime()
    {
        time++;
    }
}
