package runnable;

import jline.console.ConsoleReader;
import jline.console.completer.Completer;
import standard.engine.Engine;
import standard.engine.FinalCompleter;
import standard.engine.Utility;
import story.compiler.StoryCompiler;

import javax.rmi.CORBA.Util;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Milos on 09/11/2016.
 */
public class MainExecutor
{
    public static void main(String[] args)
    {
        try
        {
            Character mask = null;
            String trigger = null;
            boolean color = false;

            ConsoleReader reader = new ConsoleReader();
            reader.setPrompt("> ");

            String line;
            PrintWriter out = new PrintWriter(reader.getOutput());
            if(args.length <= 1)
            {
                out.println("java -jar InteractiveFiction.jar [enhanced/standard] [story file location]");
            }
            // repeat until a game is successfully loaded or exit has been input
            String test = "", story_location = "";
            try
            {
                story_location = args[1];//"C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Comparative Study\\study_story.txt";
                out.println("Attempting to load story file...");
                out.flush();

                new Scanner(new File(story_location)).next(); // test if the file is there
            } catch (IOException e)
            {
                out.println("The file could not be found...\nTerminating...");
                out.flush();
            }

            Engine eng = null;
            while(eng == null)
            {
                // repeatedly compile the story until the engine is non null
                eng = StoryCompiler.complieStory(story_location);
                if(eng == null)
                {
                    out.println("To recompile the story file press enter or type \"abort\" to quit.\n" +
                            Utility.dashedLine());
                    out.flush();
                    String procede = reader.readLine();
                    if(procede.equals("abort"))
                        return;
                }
            }
            out.println("Story file successfully loaded...\n" +
                    Utility.dashedLine());
            // --------------------------------------------------------------------------------------
            while(true)
            {
                Engine.response resp = eng.start(args.length > 0 ? args[0].equals("enhanced") : true, reader, out);
                if (resp == Engine.response.exit)
                {
                    break;
                }
                else if (resp == Engine.response.restart)
                {
                    // recompile the story from zero
                    eng = StoryCompiler.complieStory(story_location);
                }
            }
        } catch (Throwable t)
        {
            t.printStackTrace();
        }
    }
}
