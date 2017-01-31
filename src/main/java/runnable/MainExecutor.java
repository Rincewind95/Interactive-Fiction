package runnable;

import jline.console.ConsoleReader;
import jline.console.completer.Completer;
import standard.engine.Engine;
import standard.engine.FinalCompleter;
import standard.engine.Utility;
import story.compiler.StoryCompiler;

import javax.rmi.CORBA.Util;
import java.io.*;
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
            Writer transwriter, logwriter = null;
            if(args.length <= 3)
            {
                out.println("java -jar InteractiveFiction.jar [enhanced/standard/alternate] [story file location] [transcript location] [logfile location]|[nolog]");
                out.flush();
                return;
            }
            // repeat until a game is successfully loaded or exit has been input
            String test = "", story_location = "", transcript = "", log = "";
            try
            {
                story_location = args[1]; //"C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Comparative Study\\study_story.txt";
                transcript = args[2];     //"C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Comparative Study\\study_transcript.txt";
                log = args[3];            //"C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Comparative Study\\study_log.txt";
                out.println("Attempting to load story file...");
                out.flush();
                transwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(transcript), "utf-8"));
                if(log.equals("nolog"))
                    logwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(log), "utf-8"));
                new Scanner(new File(story_location)).next(); // test if the file is there
            } catch (IOException e)
            {
                out.println("The file could not be found...\nTerminating...");
                out.flush();
                return;
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
            out.flush();
            // --------------------------------------------------------------------------------------
            while(true)
            {
                eng.setLogging(!args[3].equals("nolog"));
                eng.setLogger(logwriter);
                Engine.response resp = eng.start(args[0].equals("enhanced"), args[0].equals("alternate"), reader, out, transwriter);

                if (resp == Engine.response.exit)
                {
                    transwriter.close();
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
