package runnable;

import jline.console.ConsoleReader;
import engine.Engine;
import engine.utility.Utility;
import story.compiler.StoryCompiler;

import java.io.*;
import java.util.ArrayList;

public class ExperimentExecutor
{
    public static void main(String[] args)
    {
        try
        {
            String username = "";
            Boolean startEnhanced = false;
            String test = "";
            String story_location = "final_story.game";
            String transcript_suffix = "_playthrough.transcript";
            String log_suffix = "_playthrough.feedback";
            String transcript;
            String log;

            ConsoleReader reader = new ConsoleReader();
            Utility.setReader(reader);
            reader.setPrompt("~ ");

            String line;
            PrintWriter writer = new PrintWriter(reader.getOutput());
            Writer transwriter, logwriter = null;
            if (args.length < 2)
            {
                writer.println("java -jar IFExperiment.jar [s/e] [username]");
                writer.flush();
                return;
            }

            switch (args[0])
            {
                // s for standard e for enhanced (starting engine type)
                case "s":
                    startEnhanced = false;
                    break;
                case "e":
                    startEnhanced = true;
                    break;
                default:
                    writer.println("Invalid argument [" + args[0] + "]!\nExpecting: [s] or [e]");
                    writer.flush();
                    return;
            }

            username = args[1];

            Engine eng = null;

            writer.println("Attempting to load story file...");
            writer.flush();
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            InputStream story_stream = classLoader.getResourceAsStream(story_location);
            if(story_stream == null)
            {
                writer.println("The file could not be found...\nTerminating...");
                writer.flush();
                return;
            }
            eng = StoryCompiler.complieStory(story_stream);
            if (eng == null)
            {
                writer.println("Compilation failed!\nTerminating..." +
                        Utility.dashedLine());
                writer.flush();
                return;
            }
            writer.println("Story file successfully loaded...\n" + Utility.dashedLine());
            writer.flush();
            // --------------------------------------------------------------------------------------

            ArrayList<String> playthroughs = new ArrayList<>();
            playthroughs.add("first");
            playthroughs.add("second");

            for(String playthrough_id : playthroughs)
            {
                writer.println("Preparing your " + playthrough_id + " playthrough...");
                writer.flush();

                transcript = username + "_" + playthrough_id + transcript_suffix;
                log = username + "_" + playthrough_id + log_suffix;
                try
                {
                    transwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(transcript), "utf-8"));
                    logwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(log), "utf-8"));
                    eng.setLogging(true);
                    eng.setLogger(logwriter);
                } catch (IOException e)
                {
                    writer.println("Transcript and log files could not be initialised...\nTerminating...");
                    writer.flush();
                    return;
                }

                writer.println("Preparation complete...");
                writer.flush();

                String testUsername = "";
                writer.write("Once instructed, please validate your username to start your " + playthrough_id + " playthrough:\n");
                writer.flush();
                testUsername = reader.readLine();
                while (!testUsername.equals(username))
                {
                    writer.write("Username incorrect, please enter '"+username+"' to continue:\n");
                    writer.flush();
                    testUsername = reader.readLine();
                }
                writer.println("Starting your "+playthrough_id+" playthrough...\n");
                writer.flush();

                // first playthrough
                while (true)
                {
                    eng.setLogging(true);
                    eng.setLogger(logwriter);
                    Engine.response resp = eng.start(startEnhanced, false, reader, writer, transwriter);

                    if (resp == Engine.response.exit)
                    {
                        transwriter.close();
                        break;
                    }
                    else if (resp == Engine.response.restart)
                    {
                        // recompile the story from zero
                        story_stream = classLoader.getResourceAsStream(story_location);
                        eng = StoryCompiler.complieStory(story_stream);
                    }
                }
                reader.setPrompt("~ ");
                writer.println(Utility.capitalise(playthrough_id) + " playthrough complete...\n");
                writer.println(Utility.centerToScreenWidth("Please fill out:\n\\center\r\n" +
                        "\u001B[32;1mInteractive Fiction Comparative Study - Questionnaire ("+playthrough_id+" play-through)\u001B[0m" +
                        "\r\n\\endcenter\nbefore continuing..."));
                writer.flush();
                startEnhanced = !startEnhanced;
                // recompile the story from zero
                story_stream = classLoader.getResourceAsStream(story_location);
                eng = StoryCompiler.complieStory(story_stream);
            }
            String exit = "";
            writer.write("Playthrough part complete. Please type 'exit' to finish:\n");
            writer.flush();
            exit = reader.readLine();
            while (!exit.equals("exit"))
            {
                writer.write("Please type 'exit' to finish:\n");
                writer.flush();
                exit = reader.readLine();
            }

        } catch (Throwable t)
        {
            t.printStackTrace();
        }
    }
}
