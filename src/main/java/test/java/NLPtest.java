package test.java;

import com.google.common.io.Files;

import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent.S;
import input.parser.NLPparser;
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
        eng.addItem("laser", new Item("laser"));
        eng.addItem("beam", new Item("beam"));
        eng.addItem("laser beam", new Item("laser beam"));
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