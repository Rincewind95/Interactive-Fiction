package standard.engine;

import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.Tag;
import edu.stanford.nlp.ling.tokensregex.ComplexNodePattern;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import input.parser.NLPparser;
import jline.console.ConsoleReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.*;

/**
 * Created by Milos on 07/11/2016.
 */
public class Utility
{
    private static String[] special_chars = {"\\(", "\\)", "\\[", "\\]", "\\{", "\\}", "\\\"", ";"};

    public static final HashSet<String> theAlls;

    public static final String helpMessage =
            "[Tab]         - autocomplete, cycles through suggestions when pressed again\n" +
            "[Shift]+[Tab] - autocomplete, returns to previous suggestion when pressed\n" +
            "[Up]/[Down]   - navigates through previous responses\n" +
            "use     <item>             - uses an item\n" +
            "use     <item> on   <item> - uses an item on another item\n" +
            "combine <item> with <item> - combines two items (ordering is irrelevant)\n" +
            "put     <item> in   <item> - adds an item to a container\n" +
            "remove  <item> from <item> - removes an item from a container\n" +
            "remove  all    from <item> - removes all of the containers contents\n" +
            "take    <item>             - adds the item to your inventory\n" +
            "take    all                - adds all items in the room to your inventory\n" +
            "drop    <item>             - removes the item from your inventory\n" +
            "drop    all                - removes all items from your inventory\n" +
            "examine <item>             - gives the items description and contents\n" +
            "examine all                - examines all items in current room\n" +
            "move    <direction>        - moves the player north/east/south/west\n" +
            "<special command>          - exact string of event triggering characters\n" +
            "inventory - lists the items stored in your inventory\n" +
            "look      - gives a rooms short description, its contents and its exits\n" +
            "wait      - waits a unit of time\n" +
            "hint      - gives useful tips with respect to current progress\n" +
            "help      - prints the general help message\n" +
            "brief     - prints a room's introductory message\n" +
            "history   - presents a list of all previous successful user commands\n" +
            "restart   - [CAUTION] restarts the game, and all progress is lost\n" +
            "quit      - [CAUTION] exits the game, and all progress is lost\n" +
            "N.B. The list of responses given above is nothing more than a suggestion. " +
            "You can be creative with synonyms, but there is no guarantee that all synonym options will work.";

    public static final String tipMessage ="------------- Tip: Type 'help' for a list of response suggestions -------------";

    private static final HashSet<Character> vowels;
    public static final HashMap<String, String> exitMap;
    public static final ArrayList<String> commands_list;
    public static final ArrayList<String> connectors_list;

    static
    {
        theAlls = new HashSet<>();
        theAlls.add("all");
        theAlls.add("everything");

        exitMap = new HashMap<>();
        exitMap.put("n", "The northern exit leads to ");
        exitMap.put("e", "The eastern exit leads to ");
        exitMap.put("s", "The southern exit leads to ");
        exitMap.put("w", "The western exit leads to ");
        vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        commands_list = new ArrayList<>(
                Arrays.asList("use", "combine", "put", "remove",
                        "take", "drop", "examine", "move",
                        "look", "brief", "wait", "history", "inventory", "hint", "help"));
        connectors_list = new ArrayList<>(
                Arrays.asList("with", "in", "on", "from",
                        "north", "east", "south", "west"));
    }

    public static String removeWhiteSpace(String input)
    {
        String noSpaces = input.replaceAll("\\s+", " ");
        if (noSpaces != null && noSpaces.startsWith(" "))
            noSpaces = noSpaces.replaceFirst("\\s+", "");
        if (noSpaces.endsWith(" "))
            noSpaces = noSpaces.substring(0, noSpaces.length() - 1);
        return noSpaces;
    }

    public static String pre_tokenise(String input)
    {
        String moded = input;
        for (String spec : special_chars)
        {
            moded = moded.replaceAll("\\s*" + spec + "\\s*", " " + spec + " ");
        }
        moded = removeWhiteSpace(moded);
        return moded;
    }

    public static String strip_special_chars(String input)
    {
        String res = input.replace("[", "");
        res = res.replace("]", "");
        res = res.replace("(", "");
        res = res.replace(")", "");
        res = res.replace("_", "");
        return res;
    }

    public static String strip_quotes(String input)
    {
        String res = input.replace("\"", "");
        return res;
    }

    public static String addThe(String input)
    {
        if (!input.startsWith("the ")
                && !input.startsWith("a ")
                && !input.startsWith("an "))
        {
            input = "the " + input;
        }
        return input;
    }


    public static String addAorAn(String input)
    {
        if (!input.startsWith("the ")
                && !input.startsWith("a ")
                && !input.startsWith("an ")
                && input.length() > 0)
        {
            if (vowels.contains(input.charAt(0)))
                input = "an " + input;
            else
                input = "a " + input;
        }
        return input;
    }

    public static Boolean isSingular(String input, StanfordCoreNLP pipeline)
    {
        Annotation annotation = new Annotation(input);
        boolean result = true;
        pipeline.annotate(annotation);
        String[] words = input.split(" ");
        List<CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);

        int i = 0;
        // Iterate over all tokens in a sentence
        for (CoreLabel token : sentences.get(0).get(CoreAnnotations.TokensAnnotation.class))
        {
            // Retrieve and add the lemma for each word into the list of lemmas
            String lemma = token.get(CoreAnnotations.LemmaAnnotation.class);
            String posTag = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            if(posTag.contains("VB"))
            {
                // we ignore all verbs
                i++;
                continue;
            }
            result = result && lemma.equals(words[i]);
            i++;
        }
        return result;//input.equals(lemmas);
    }

    public static String isAre(String input, StanfordCoreNLP pipeline)
    {
        return (Utility.isSingular(input, pipeline) ? "is" : "are");
    }

    public static String capitalise(String input)
    {
        String res = "";
        if (97 <= input.charAt(0) && input.charAt(0) <= 122)
            res += (char) ((int) input.charAt(0) - 97 + 65);
        return res + input.substring(1);
    }

    public static String dashedLine()
    {
        return "-------------------------------------------------------------------------------";
    }

    public static String volumeChangeMessage(Item item, Item.Temperature finaltmp)
    {
        String out = "";
        if (finaltmp != item.getTemperature())
        {
            out += ".\nThe volume of " + Utility.addThe(item.getItem_id());
            if (finaltmp.ordinal() > item.getTemperature().ordinal())
                out += " has increased to ";
            else
                out += " has decreased to ";
            switch (finaltmp)
            {
                case hot:
                    out += "120% its normal size";
                    break;
                case warm:
                    out += "110% its normal size";
                    break;
                case cold:
                    out += "90% its normal size";
                    break;
                case frozen:
                    out += "80% its normal size";
                    break;
            }
        }
        return out;
    }

    public static ArrayList<String> joinArrays(ArrayList<String> array1, HashSet<String> array2)
    {
        ArrayList<String> res = new ArrayList<>();
        res.addAll(array1);
        res.addAll(array2);
        return res;
    }

    public static void write(PrintWriter writer, String out, Writer transwriter)
    {
        try
        {
            transwriter.write(out);
            transwriter.flush();
        } catch (Exception e) {}
        writer.println(out);
        writer.flush();
    }

    public static String readLn(ConsoleReader reader, Writer transwriter) throws IOException
    {
        String out = reader.readLine();
        try
        {
            transwriter.write("\r\n> " + out + "\r\n");
            transwriter.flush();
        } catch (Exception e) {}
        return out;
    }

}
