package runnable;

import standard.engine.Command;
import standard.engine.Engine;
import story.interpreter.StoryInterpreter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Milos on 09/11/2016.
 */
public class MainExecutor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // repeat until a game is successfully loaded or exit has been input
        System.out.println("Please input the location of the story file to be loaded...");
        String test = "", story_location = "";
        boolean badLocation = true;
        while(badLocation)
        {
            try
            {
                story_location = scanner.nextLine();
                if(story_location.equals("abort"))
                    return;
                System.out.println("Attempting to load story file...");
                new Scanner(new File(story_location)).next(); // test if the file is there
                badLocation = false;
            } catch (IOException e)
            {
                System.out.println("The file could not be found, please input a different location or input \"abort\"...");
            }
        }

        Engine eng = null;
        while(eng == null)
        {
            // repeatedly interpret the story until the engine is
            StoryInterpreter interpreter = new StoryInterpreter(story_location);
            eng = interpreter.getEngine();
            if(eng == null)
            {
                System.out.println("The story file is corrupt!\nTo reinterpret the story file press enter or type \"abort\" to quit.\n" +
                        "--------------------------------------------------------------------");
                String procede = scanner.nextLine();
                if(procede.equals("abort"))
                    return;
            }
        }
        // --------------------------------------------------------------------------------------

        eng.start();
    }
}
