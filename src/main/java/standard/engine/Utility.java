package standard.engine;

/**
 * Created by Milos on 07/11/2016.
 */
public class Utility
{
    private static String[] special_chars = {"\\(", "\\)", "\\[", "\\]", "\\{", "\\}", "\\\"", ";"};

    public static String removeWhiteSpace(String input)
    {
        String noSpaces = input.replaceAll("\\s+", " ");
        if(noSpaces != null && noSpaces.startsWith(" "))
            noSpaces = noSpaces.replaceFirst("\\s+", "");
        if(noSpaces.endsWith(" "))
            noSpaces = noSpaces.substring(0, noSpaces.length()-1);
        return noSpaces;
    }

    public static String pre_tokenise(String input)
    {
        String moded = input;
        for (String spec: special_chars)
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
        if(!input.startsWith("the ")
                && !input.startsWith("a ")
                && !input.startsWith("an "))
        {
            input = "the " + input;
        }
        return input;
    }
}
