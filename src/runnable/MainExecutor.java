package runnable;

import standard.engine.Engine;
import story.compiler.StoryCompiler;

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
                story_location = "C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Testing\\simple_story.txt";//scanner.nextLine();
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
            // repeatedly compile the story until the engine is non null
            eng = StoryCompiler.complieStory(story_location);
            if(eng == null)
            {
                System.out.println("To recompile the story file press enter or type \"abort\" to quit.\n" +
                                   "---------------------------------------------------------------");
                String procede = scanner.nextLine();
                if(procede.equals("abort"))
                    return;
            }
        }
        // --------------------------------------------------------------------------------------

        eng.start();
    }
}
