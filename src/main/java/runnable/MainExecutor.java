package runnable;

import standard.engine.Engine;
import standard.engine.Utility;
import story.compiler.StoryCompiler;

import javax.rmi.CORBA.Util;
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
        String test = "", story_location = "";
        try
        {
            story_location = args[1];//"C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Comparative Study\\study_story.txt";
            System.out.println("Attempting to load story file...");
            new Scanner(new File(story_location)).next(); // test if the file is there
        } catch (IOException e)
        {
            System.out.println("The file could not be found...\nTerminating...");
        }

        Engine eng = null;
        while(eng == null)
        {
            // repeatedly compile the story until the engine is non null
            eng = StoryCompiler.complieStory(story_location);
            if(eng == null)
            {
                System.out.println("To recompile the story file press enter or type \"abort\" to quit.\n" +
                                   Utility.dashedLine());
                String procede = scanner.nextLine();
                if(procede.equals("abort"))
                    return;
            }
        }
        System.out.println("Story file successfully loaded...\n" +
                Utility.dashedLine());
        // --------------------------------------------------------------------------------------
        while(true)
        {
            Engine.response resp = eng.start(args.length > 0 ? args[0].equals("enhanced") : true);
            if(resp == Engine.response.exit)
            {
                break;
            }
            else if (resp == Engine.response.restart)
            {
                // recompile the story from zero
                eng = StoryCompiler.complieStory(story_location);
            }
        }
    }
}
