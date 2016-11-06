package standard.engine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Milos on 05/11/2016.
 */
public class Engine
{
    private int time; // the current time step of the game
    private String start_message;
    private Command prev_command;  // command previously input by the player
    private ArrayList<Room> rooms; // list of the rooms in the game on all levels
    private ArrayList<Item> items; // list of all possible items in the game


    public Engine(String story_loc)
    {
        // TODO load story from the story_loc


        // game initialisation
        time = 0;

    }

    private boolean executeCommand(Command command)
    {
        if(command.getType() == Command.Type.exit)
        {
            return false;
        }

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

            System.out.print("[" + eng.getTime() + "]: ");
            String userInput = scanner.nextLine();

            // temporary input parsing (there will be an intermediate parser step here later)
            Command command = new Command(userInput);

            gameRunning = eng.executeCommand(command);

            // response generation

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
