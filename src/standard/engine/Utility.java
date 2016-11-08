package standard.engine;

import java.util.ArrayList;

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
}