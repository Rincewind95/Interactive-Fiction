package test.java;

import com.google.common.io.Files;

import engine.*;
import engine.utility.Utility;
import input.parser.NLPparser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * A simple corenlp example ripped directly from the Stanford CoreNLP website using text from wikinews.
 */
public class NLPtest
{

    public static void main(String[] args) throws IOException
    {
        // read some text from the file..
        File inputFile = new File("C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Testing\\NLPparser test\\sample_input.txt");
        File outputFile = new File("C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Testing\\NLPparser test\\sample_output.txt");
        String text = Files.toString(inputFile, Charset.forName("UTF-8"));
        String expected = Files.toString(outputFile, Charset.forName("UTF-8"));
        text = text.toLowerCase();
        Engine eng = new Engine();
        Room testroom = new Room("test", "first");
        Item laser = new Item("laser");
        Item beam = new Item("beam");
        Item laser_beam = new Item("laser beam");

        HashMap<String, ArrayList<String>> synonyms = new HashMap<>();
        synonyms.put("open", new ArrayList<>(Arrays.asList("use", "with")));
        Condition testcond = new Condition("useon", synonyms, new ArrayList<>(Arrays.asList("laser", "beam")), null);
        Utility.addSynonym("open", testcond);

        testroom.addItem(laser);
        testroom.addItem(beam);
        testroom.addItem(laser_beam);
        eng.addRoom("test", testroom);
        eng.addItem("laser", laser);
        eng.addItem("beam", beam);
        eng.addItem("laser beam", laser_beam);
        eng.makePlayer(testroom);
        eng.setEnhanced(false);
        Utility.setOrderedTwoArgumentSynonyms();

        NLPparser parser = new NLPparser(eng);
        String[] sentences = text.split("\r\n");
        String[] expectedResult = expected.split("\r\n");
        String out = "";
        int errorcnt = 0;
        for(int i = 0; i < sentences.length; i++)
        {
            Command com = parser.parseInput(sentences[i]);
            String res = com.cmdToString();
            boolean doOut = false;
            out = "";
            out += "User input ~ " + sentences[i] + "\n";
            if(res.equals(expectedResult[i]))
            {
                out += "Success    ~ " + res + "\n";
            }
            else
            {
                doOut = true;
                errorcnt++;
                out += "Failure    ~ " + res + "\n" + "Expected   ~ " + expectedResult[i] + "\n";
            }
            out += "----------\n";
            if(doOut)
                System.out.print(out);
        }
        System.out.println("Test completed with " + errorcnt + " errors!");
    }

}