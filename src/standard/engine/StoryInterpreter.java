package standard.engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Milos on 07/11/2016.
 */
public class StoryInterpreter
{
    private Engine eng;       // the engine to be created
    private String story_loc; // the location of the story file

    public StoryInterpreter(String story)
    {
        
    }

    public Engine getEngine()
    {
        return eng;
    }
}
// C:\Users\Milos\Dropbox\Part II project Interactive Fiction\Testing\simple_story.txt