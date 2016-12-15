package input.parser;

import com.google.common.io.Files;

import standard.engine.Command;
import standard.engine.Engine;
import standard.engine.Item;
import standard.engine.Message;

import java.io.File;
import java.io.IOException;
import java.io.SyncFailedException;
import java.nio.charset.Charset;

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
        eng.addItem("laser", new Item("laser", true, Item.flag.inv, null, null));
        eng.addItem("beam", new Item("beam", true, Item.flag.inv, null, null));
        eng.addItem("laser beam", new Item("laser beam", true, Item.flag.inv, null, null));
        NLPparser parser = new NLPparser(eng);
        String[] sentences = text.split("\r\n");
        String[] expectedResult = expected.split("\r\n");
        for(int i = 0; i < sentences.length; i++)
        {
            Command com = parser.parseInput(sentences[i]);
            String res = com.cmdToString();
            System.out.println("User input ~ " + sentences[i]);
            if(res.equals(expectedResult[i]))
            {
                System.out.print("Success    ~ ");
                System.out.println(res);
            }
            else
            {
                System.out.print("Failure    ~ ");
                System.out.println(res);
                System.out.println("Expected   ~ " + expectedResult[i]);
            }
            System.out.println("----------");
        }
    }

}