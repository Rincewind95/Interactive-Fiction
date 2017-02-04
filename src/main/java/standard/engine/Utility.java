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
import javafx.util.Pair;
import jline.Terminal;
import jline.console.ConsoleReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Milos on 07/11/2016.
 */
public class Utility
{
    public static final HashSet<String> theAlls;
    private static ConsoleReader reader;

    private static String[] special_chars = {"\\(", "\\)", "\\[", "\\]", "\\{", "\\}", "\\\"", ";"};
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
    public static final String helpMessageAddition;

    public static final ArrayList<ImportantCommand> importantCommands;
    public static final int percentageThreshold;

    public static final String helpMessage;

    public static ArrayList<String> orderedTwoArgumentSynonyms;               // the ordered list of all the synonyms for two argument commands
    public static HashMap<String, String> twoArgumentsynonyms;                // the map of all the synonyms for two argument commands
    public static HashMap<String, ArrayList<String>> twoArgumentConnectors;   // the set of connectors expected by the two Argument words
    public static HashMap<String, ArrayList<NLPparser.argType>> twoArguments; // a map of their respective argument types
    public static HashMap<String, String> oneArgumentsynonyms;                // the map of all the synonyms for one argument commands
    public static HashMap<String, NLPparser.argType> oneArguments;            // a map of their respective argument types
    public static HashMap<String, String> zeroArgumentsynonyms;               // the map of all the synonyms for zero argument commands
    public static HashMap<String, String> dirMapping;                         // all the possible direction mappings we take

    public static HashMap<String, Pair<Integer, String>> conditionsWithSynonyms;
    public static HashMap<String, HashSet<Condition>> extraSynonymOriginConditions;
    public static HashMap<String, String> twoArgumentMasterSynonyms;                // the map of all the engine specified synonyms for two argument commands
    public static HashMap<String, String> oneArgumentMasterSynonyms;                // the map of all the engine specified synonyms for one argument commands
    public static HashMap<String, String> zeroArgumentMasterSynonyms;               // the map of all the engine specified synonyms for zero argument commands

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

        evaluationQuestion = "*I feel this response helps me advance the game.                                                         *" +
                         "\r\n*(1 - Strongly disagree) (2 - Disagree) (3 - Neither agree nor disagree) (4 - Agree) (5 - Strongly agree)*";
        invalidOptionReply = "*Invalid entry. Please select a number from the options below:                                           *" +
                         "\r\n*(1 - Strongly disagree) (2 - Disagree) (3 - Neither agree nor disagree) (4 - Agree) (5 - Strongly agree)*";
        successfulOptionReply =  "*Entry recorded. Continuing...*";
        invalidationSuccessful = "*Previous entry successfully invalidated. Continuing...*";
        invalidationFailed =     "*Invalidation failed. Previous entry was already invalidated or does not exist. Continuing...*";

        helpMessage  =
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
        helpMessageAddition =
                "invalidate ----------------- [CAUTION] irreversibly invalidates only the last entry\r\n" +
                "Question format:\r\n"
                + evaluationQuestion;

        percentageThreshold = 15; // in percent
        importantCommands = new ArrayList<>();
        importantCommands.add(new ImportantCommand(new Command(Command.Type.putin, new ArrayList<>(Arrays.asList("book", "wide bookshelf slot"))),
                                                   new HashSet<>(Arrays.asList(
                                                   new Condition("isnotfrozen", new ArrayList<>(Arrays.asList("book")))
                                                   ))
                                                   ));

        twoArgumentMasterSynonyms = new HashMap<>();
        twoArgumentMasterSynonyms.put("use", "use");
        twoArgumentMasterSynonyms.put("utilize", "use");
        twoArgumentMasterSynonyms.put("utilise", "use");
        twoArgumentMasterSynonyms.put("apply", "use");
        twoArgumentMasterSynonyms.put("employ", "use");
        twoArgumentMasterSynonyms.put("combine", "combine");
        twoArgumentMasterSynonyms.put("merge", "combine");
        twoArgumentMasterSynonyms.put("mix", "combine");
        twoArgumentMasterSynonyms.put("fuse", "combine");
        twoArgumentMasterSynonyms.put("meld", "combine");
        twoArgumentMasterSynonyms.put("compound", "combine");
        twoArgumentMasterSynonyms.put("put", "put");
        twoArgumentMasterSynonyms.put("insert", "put");
        twoArgumentMasterSynonyms.put("place", "put");
        twoArgumentMasterSynonyms.put("position", "put");
        twoArgumentMasterSynonyms.put("remove", "remove");
        twoArgumentMasterSynonyms.put("take", "remove");
        twoArgumentMasterSynonyms.put("collect", "remove");
        twoArgumentMasterSynonyms.put("acquire", "remove");
        twoArgumentMasterSynonyms.put("obtain", "remove");
        twoArgumentMasterSynonyms.put("claim", "remove");
        twoArgumentMasterSynonyms.put("pick", "remove");
        twoArgumentMasterSynonyms.put("get", "remove");
        twoArgumentsynonyms = new HashMap<>();
        twoArgumentsynonyms.putAll(twoArgumentMasterSynonyms);

        twoArgumentConnectors = new HashMap<>();
        twoArgumentConnectors.put("use", new ArrayList<>(Arrays.asList("with", "on", "and")));
        twoArgumentConnectors.put("utilize", new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("utilise", new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("apply", new ArrayList<>(Arrays.asList("to")));
        twoArgumentConnectors.put("employ", new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("combine", new ArrayList<>(Arrays.asList("with", "and")));
        twoArgumentConnectors.put("merge", new ArrayList<>(Arrays.asList("with", "and")));
        twoArgumentConnectors.put("mix", new ArrayList<>(Arrays.asList("with", "and")));
        twoArgumentConnectors.put("fuse", new ArrayList<>(Arrays.asList("with", "and")));
        twoArgumentConnectors.put("meld", new ArrayList<>(Arrays.asList("with", "and")));
        twoArgumentConnectors.put("compound", new ArrayList<>(Arrays.asList("with", "and")));
        twoArgumentConnectors.put("put", new ArrayList<>(Arrays.asList("in", "into")));
        twoArgumentConnectors.put("place", new ArrayList<>(Arrays.asList("in", "into")));
        twoArgumentConnectors.put("position", new ArrayList<>(Arrays.asList("in")));
        twoArgumentConnectors.put("remove", new ArrayList<>(Arrays.asList("from")));

        twoArguments = new HashMap<>();
        twoArguments.put("use", new ArrayList<>(Arrays.asList(NLPparser.argType.item, NLPparser.argType.item)));
        twoArguments.put("combine", new ArrayList<>(Arrays.asList(NLPparser.argType.item, NLPparser.argType.item)));
        twoArguments.put("put", new ArrayList<>(Arrays.asList(NLPparser.argType.item, NLPparser.argType.item)));
        twoArguments.put("remove", new ArrayList<>(Arrays.asList(NLPparser.argType.item, NLPparser.argType.item)));

        oneArgumentMasterSynonyms = new HashMap<>();
        oneArgumentMasterSynonyms.put("drop", "drop");
        oneArgumentMasterSynonyms.put("leave", "drop");
        oneArgumentMasterSynonyms.put("examine", "examine");
        oneArgumentMasterSynonyms.put("analyze", "examine");
        oneArgumentMasterSynonyms.put("analyse", "examine");
        oneArgumentMasterSynonyms.put("inspect", "examine");
        oneArgumentMasterSynonyms.put("observe", "examine");
        oneArgumentMasterSynonyms.put("investigate", "examine");
        oneArgumentMasterSynonyms.put("look", "examine");
        oneArgumentMasterSynonyms.put("move", "move");
        oneArgumentMasterSynonyms.put("go", "move");
        oneArgumentMasterSynonyms.put("proceed", "move");
        oneArgumentMasterSynonyms.put("advance", "move");
        oneArgumentMasterSynonyms.put("travel", "move");
        oneArgumentsynonyms = new HashMap<>();
        oneArgumentsynonyms.putAll(oneArgumentMasterSynonyms);

        oneArguments = new HashMap<>();
        oneArguments.put("drop", NLPparser.argType.item);
        oneArguments.put("examine", NLPparser.argType.item);
        oneArguments.put("move", NLPparser.argType.dir);

        zeroArgumentMasterSynonyms = new HashMap<>();
        zeroArgumentMasterSynonyms.put("brief", "brief");
        zeroArgumentMasterSynonyms.put("wait", "wait");
        zeroArgumentMasterSynonyms.put("history", "history");
        zeroArgumentMasterSynonyms.put("quit", "exit");
        zeroArgumentMasterSynonyms.put("inventory", "inventory");
        zeroArgumentMasterSynonyms.put("restart", "restart");
        zeroArgumentMasterSynonyms.put("hint", "hint");
        zeroArgumentMasterSynonyms.put("help", "help");
        zeroArgumentMasterSynonyms.put("invalidate", "invalidate");
        zeroArgumentsynonyms = new HashMap<>();
        zeroArgumentsynonyms.putAll(zeroArgumentMasterSynonyms);

        dirMapping = new HashMap<>();
        dirMapping.put("north", "n");
        dirMapping.put("east", "e");
        dirMapping.put("south", "s");
        dirMapping.put("west", "w");

        // also gives the mapping to the number of arguments and to what is the synonym of
        conditionsWithSynonyms = new HashMap<>();
        conditionsWithSynonyms.put("use", new Pair<>(2, "use"));
        conditionsWithSynonyms.put("useon", new Pair<>(2, "use"));
        conditionsWithSynonyms.put("combine", new Pair<>(2, "combine"));

        extraSynonymOriginConditions = new HashMap<>();
    }

    public static void setOrderedTwoArgumentSynonyms()
    {
        orderedTwoArgumentSynonyms = new ArrayList<>();
        orderedTwoArgumentSynonyms.addAll(extraSynonymOriginConditions.keySet());
        orderedTwoArgumentSynonyms.addAll(twoArgumentMasterSynonyms.keySet());
    }

    public static void addSynonym(String synonym, Condition cond)
    {
        rememberExtraSynonymConditionLink(synonym, cond);
        Pair<Integer, String> val = conditionsWithSynonyms.get(cond.getType().toString());
        switch (val.getKey())
        {
            case 0: zeroArgumentsynonyms.put(synonym, val.getValue());
                    break;
            case 1: oneArgumentsynonyms.put(synonym, val.getValue());
                    break;
            case 2: twoArgumentsynonyms.put(synonym, val.getValue());
                    // in the case of two arguments, add all the connectors
                    ArrayList<String> connectors = cond.getConnectors(synonym);
                    if(!twoArgumentConnectors.containsKey(synonym))
                    {
                        twoArgumentConnectors.put(synonym, connectors);
                    }
                    else
                    {
                        twoArgumentConnectors.get(synonym).addAll(connectors);
                    }
                    //System.out.println(twoArgumentConnectors);
                    break;
        }
    }

    public static void rememberExtraSynonymConditionLink(String synonym, Condition cond)
    {
        if(!extraSynonymOriginConditions.containsKey(synonym))
        {
            extraSynonymOriginConditions.put(synonym, new HashSet<>());
        }
        extraSynonymOriginConditions.get(synonym).add(cond);
    }

    public static boolean commandUsesSynonymCorrectly(Command command)
    {
        String verb = command.getOriginalVerb();
        String type = command.getType().toString();
        ArrayList<String> args = command.getArgs();
        //System.out.println("command: ["+type+"] " + args);
        // first test if the command is not an extra synonym at all
        if(twoArgumentMasterSynonyms.containsKey(verb) ||
            oneArgumentMasterSynonyms.containsKey(verb) ||
            zeroArgumentMasterSynonyms.containsKey(verb))
        {
            return true;
        }

        if(!conditionsWithSynonyms.containsKey(type))
        {
            // if no this command is not supposed to have extra synonyms
            //System.out.println("not supposed to have");
            return false;
        }
        else
        {
            if (extraSynonymOriginConditions.containsKey(verb))
            {
                // retrieve the set of conditions which may contain the synonym
                HashSet<Condition> options = extraSynonymOriginConditions.get(verb);
                for (Condition condition : options)
                {
                    String conditionType = condition.getType().toString();
                    ArrayList<String> conditionArgs = condition.getArgs();
                    // test if the command matches the one requested in the condition
                    if (conditionType.equals(type) &&
                        conditionArgs.size() == args.size())
                    {
                        boolean success = true;
                        for (int i = 0; i < args.size(); i++)
                        {
                            if (!conditionArgs.get(i).equals(args.get(i)))
                            {
                                success = false;
                                break;
                            }
                        }

                        // test for the special case of a custom two argument command
                        if(args.size() == 2)
                        {
                            // if its a double argument condition, we need to check the connectors as well
                            String connector = command.getOriginalConnector();
                            ArrayList<String> connOptions = condition.getConnectors(verb);
                            //System.out.print("options: " );
                            boolean worked = false;
                            for (String con : connOptions)
                            {
                                //System.out.print(" <" + con + ">");
                                if (connector.equals(con))
                                {
                                    worked = true;
                                }
                            }
                            success &= worked;
                            //System.out.println();
                            //System.out.println("connector: <" + connector + ">");
                        }
                        //System.out.print("worked: " + success);
                        if (success)
                        {
                            //System.out.print("return true");
                            return true;
                        }
                    }
                }
            }
            //System.out.print("return false");
            return false;
        }
    }

    public static int wasImportant(Command command, Engine eng)
    {
        int index = 0;
        for(; index < importantCommands.size(); index++)
        {
            ImportantCommand curr = importantCommands.get(index);
            if(curr.wasExecuted(command, eng) && !curr.wasTriggered())
            {
                return index;
            }
        }
        return -1;
    }

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
        String res = input;
        res = res.replace("<", "");
        res = res.replace(">", "");
        res = res.replace("[", "");
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

    public static String currTime()
    {

        long timeNow = System.currentTimeMillis();
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss.SSS");
        String date = DATE_FORMAT.format(timeNow);

        return date;
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
            transwriter.write("\r\n[" + currTime() + ", " + time + "]-> " + out + "\r\n");
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
