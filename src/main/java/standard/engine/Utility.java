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
import jline.Terminal;
import jline.console.ConsoleReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.*;

/**
 * Created by Milos on 07/11/2016.
 */
public class Utility
{
    private static String[] special_chars = {"\\(", "\\)", "\\[", "\\]", "\\{", "\\}", "\\\"", ";"};

    public static final HashSet<String> theAlls;

    private static ConsoleReader reader;

    public static final String helpMessage =
            "\r\n[Tab] ---------------------- autocomplete, cycles suggestions on repress\r\n" +
            "[Shift]+[Tab] -------------- returns to previous suggestion when pressed\r\n" +
            "[Up]/[Down] ---------------- navigates through previous responses\r\n" +
            "use     <item> ------------- uses an item\r\n" +
            "use     <item> on   <item> - uses an item on another item\r\n" +
            "combine <item> with <item> - combines two items (ordering is irrelevant)\r\n" +
            "put     <item> in   <item> - adds an item to a container\r\n" +
            "remove  <item> from <item> - removes an item from a container\r\n" +
            "remove  all    from <item> - removes all of the containers contents\r\n" +
            "take    <item> ------------- adds the item to your inventory\r\n" +
            "take    all ---------------- adds all items in the room to your inventory\r\n" +
            "drop    <item> ------------- removes the item from your inventory\r\n" +
            "drop    all ---------------- removes all items from your inventory\r\n" +
            "examine <item> ------------- gives the items description and contents\r\n" +
            "examine all ---------------- examines all items in current room\r\n" +
            "examine inventory ---------- examines all items in your inventory\r\n" +
            "move    <direction> -------- moves the player north/east/south/west\r\n" +
            "<special command> ---------- exact string of event triggering characters\r\n" +
            "inventory ------------------ lists the items stored in your inventory\r\n" +
            "look ----------------------- gives a rooms short description, its contents and its exits\r\n" +
            "wait ----------------------- waits a unit of time\r\n" +
            "hint ----------------------- gives useful tips with respect to current progress\r\n" +
            "help ----------------------- prints the general help message\r\n" +
            "brief ---------------------- prints a room's introductory message\r\n" +
            "history -------------------- presents a list of all previous successful user commands\r\n" +
            "restart -------------------- [CAUTION] restarts the game, and all progress is lost\r\n" +
            "quit ----------------------- [CAUTION] exits the game, and all progress is lost\r\n" +
            "N.B. The list of responses given above is nothing more than a suggestion. " +
            "You can be creative with synonyms, but there is no guarantee that all synonym options will work.";

    public static final String helpMessageAddition =
            "invalidate ----------------- [CAUTION] irreversibly invalidates only the last estimation\r\n" +
            "Response usefulness options:\r\n" +
            "(1 - Very Poor) (2 - Poor) (3 - Fair) (4 - Good) (5 - Very Good)";

    public static String getHelpMessage(boolean doEvaluation)
    {
        String res = padBothSidesWithChar("gameplay mechanics", "_") + "\r\n" + helpMessage;
        if(doEvaluation)
            res += "\r\n" + padBothSidesWithChar("estimation mechanics", "_") + helpMessageAddition;
        return res;
    }

    public static String getTipMessage()
    {
        return padBothSidesWithChar(" Tip: Type 'help' for a list of response suggestions ", "-");
    }

    private static final HashSet<Character> vowels;
    public static final HashMap<String, String> exitMap;
    public static final ArrayList<String> commands_list;
    public static final ArrayList<String> connectors_list;
    public static final HashSet<String> evaluationOptions;
    public static final String invalidOptionReply;
    public static final String evaluationQuestion;
    public static final String successfulOptionReply;
    public static final String invalidationSuccessful;
    public static final String invalidationFailed;

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
                        "look", "brief", "wait", "history", "hint", "help"));
        connectors_list = new ArrayList<>(
                Arrays.asList("north", "east", "south", "west", "inventory"));

        evaluationOptions = new HashSet<>();
        evaluationOptions.add("1");
        evaluationOptions.add("2");
        evaluationOptions.add("3");
        evaluationOptions.add("4");
        evaluationOptions.add("5");

        evaluationQuestion = "*Please estimate the usefulness of this response. Options:       *" +
                           "\r\n*(1 - Very Poor) (2 - Poor) (3 - Fair) (4 - Good) (5 - Very Good)*";
        invalidOptionReply = "*Invalid estimation. Please select a number from the options below: *" +
                           "\r\n*(1 - Very Poor) (2 - Poor) (3 - Fair) (4 - Good) (5 - Very Good)   *";
        successfulOptionReply = "*Estimation recorded. Continuing...*";
        invalidationSuccessful = "*Previous estimation successfully invalidated. Continuing...*";
        invalidationFailed =     "*Invalidation failed. Previous estimation was already invalidated or does not exist. Continuing...*";

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
        res = res.replace("{", "");
        res = res.replace("}", "");
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

    public static int getTerminalWidth()
    {
        return reader.getTerminal().getWidth();
    }

    public static String dashedLine()
    {
        return charLineOfLength("-", getTerminalWidth());
    }

    public static String charLineOfLength(String ch, int len)
    {
        String res = "";
        for(int i = 0; i < len; i++)
            res += ch;
        return res;
    }

    public static String padBothSidesWithChar(String toWrap, String ch)
    {
        String res = "";
        int lenTotal = getTerminalWidth();
        int lenFir = (lenTotal-toWrap.length())/2;
        int lenSec = lenFir >= 0 ? lenTotal - lenFir - toWrap.length() : 0;
        for(int i = 0; i < lenFir; i++) res += ch;
        res += toWrap;
        for(int i = 0; i < lenSec; i++) res += ch;
        return res;
    }

    public static String[] getAllLines(String str)
    {
        // remove the extra carriage returns
        String tmp = str.replace("\r\n", "\n");
        return tmp.split("\\n", -1);
    }

    public static int lastIndexBefore(String str, char search, int maxLen)
    {
        int res = 0;

        if(maxLen >= str.length())
            maxLen = str.length() - 1;
        else if(maxLen < 0)
            return -1;

        for(res = maxLen; res >= 0; res--)
        {
            if(str.charAt(res) == search)
            {
                break;
            }
        }

        return res;
    }

    public static String chopToTerminalWidth(String str)
    {
        return chopToFitWidth(str, getTerminalWidth());
    }

    public static String chopToFitWidth(String str, int width)
    {
        String[] allLines = getAllLines(str);
        String res = "";
        boolean firstIteration = true;
        for(String line : allLines)
        {
            if(line.length() > width)
            {
                String chopped = "";
                boolean notDone = true;
                while(notDone)
                {
                    if(line.length() < width)
                    {
                        // nothing left to chop, write whats left to result
                        chopped += line;
                        notDone = false;
                    }
                    else
                    {
                        int endIdx = 0;
                        if(line.charAt(width) == ' ')
                        {
                            endIdx = width;
                        }
                        else
                        {
                            endIdx = lastIndexBefore(line, ' ', width);
                        }

                        if(endIdx == -1)
                        {
                            // the line is either a single word or does not conatain " ", so we cannot chop the string correctly
                            return str;
                        }

                        String prefix = line.substring(0, endIdx);
                        chopped += prefix + "\r\n";
                        int startIdx = endIdx+1;
                        if(line.startsWith(" ", startIdx))
                        {
                            for(; startIdx < line.length() && line.charAt(startIdx) == ' '; startIdx++);
                        }
                        if(startIdx < line.length())
                            line = line.substring(startIdx);
                        else
                        {
                            // there is only whitespace left in the string, so we ignore it
                            notDone = false;
                        }

                    }
                }
                line = chopped;
            }
            if(!firstIteration)
                res += "\r\n";
            else
                firstIteration = false;
            res += line;
        }
        return res;
    }

    public static String volumeChangeMessage(Item item, Item.Temperature finaltmp)
    {
        String out = "";
        if (finaltmp != item.getTemperature())
        {
            out += ".\r\nThe volume of " + Utility.addThe(item.getItem_id());
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
        writer.println(chopToTerminalWidth(out));
        writer.flush();
    }

    public static String readLn(ConsoleReader reader, Writer transwriter, String time) throws IOException
    {
        String out = reader.readLine();
        try
        {
            transwriter.write("\r\n-[" + time + "]-> " + out + "\r\n");
            transwriter.flush();
        } catch (Exception e) {}
        return out;
    }


    public static boolean hasWord(String input, String text)
    {
        String[] words = text.split(" ");
        for(String word : words)
        {
            if(word.equals(input))
                return true;
        }
        return false;
    }

    public static void setReader(ConsoleReader read)
    {
        reader = read;
    }
}
