package runnable;

import jline.console.ConsoleReader;
import engine.Engine;
import engine.utility.Utility;
import story.compiler.StoryCompiler;

import java.io.*;
import java.util.Scanner;

public class DemoExecutor
{
    public static void main(String[] args)
    {
        try
        {
            ConsoleReader reader = new ConsoleReader();
            Utility.setReader(reader);
            reader.setPrompt("> ");

            PrintWriter out = new PrintWriter(reader.getOutput());
            Writer transwriter;
            if(args.length <= 2)
            {
                out.println("java -jar IFDemo.jar [enhanced/standard] [story file location] [transcript location]");
                out.flush();
                return;
            }
            // repeat until a game is successfully loaded or exit has been input
            String story_location = "", transcript = "";
            try
            {
                story_location = args[1]; //"C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Comparative Study\\study_story.txt";
                transcript = args[2];     //"C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Comparative Study\\study_transcript.txt";
                out.println("Attempting to load story file...");
                out.flush();
                transwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(transcript), "utf-8"));
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
                eng = StoryCompiler.complieStory(new FileInputStream(story_location));
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
                eng.setLogging(false);
                eng.setLogger(null);
                Engine.response resp = eng.start(args[0].equals("enhanced"), false, reader, out, transwriter);

                if (resp == Engine.response.exit)
                {
                    transwriter.close();
                    break;
                }
                else if (resp == Engine.response.restart)
                {
                    // recompile the story from zero
                    eng = StoryCompiler.complieStory(new FileInputStream(story_location));
                }
            }
        } catch (Throwable t)
        {
            t.printStackTrace();
        }
    }
}
