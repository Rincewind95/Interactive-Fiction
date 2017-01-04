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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Milos on 07/11/2016.
 */
public class Utility
{
    private static String[] special_chars = {"\\(", "\\)", "\\[", "\\]", "\\{", "\\}", "\\\"", ";"};

    private static final HashSet<Character> vowels;
    public static final HashMap<String, String> exitMap;
    static
    {
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
            if(vowels.contains(input.charAt(0)))
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
            result = result && lemma.equals(words[i]);
            i++;
        }
        return result;//input.equals(lemmas);
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
        return "--------------------------------------------------------------------------------";
    }

    public static String volumeChangeMessage(Item item, Item.Temperature finaltmp)
    {
        String out = "";
        if(finaltmp != item.getTemperature())
        {
            out += ".\nThe volume of " + Utility.addThe(item.getItem_id());
            if (finaltmp.ordinal() > item.getTemperature().ordinal())
                out += " has increased to ";
            else
                out += " has decreased to ";
            switch (finaltmp)
            {
                case burning: out += "120% its normal size"; break;
                case hot:     out += "110% its normal size"; break;
                case cold:    out += "90% its normal size"; break;
                case frozen:  out += "80% its normal size"; break;
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
}
