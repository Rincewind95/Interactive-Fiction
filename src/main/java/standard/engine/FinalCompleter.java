package standard.engine;

import javafx.util.Pair;
import jline.console.ConsoleReader;
import jline.console.completer.Completer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FinalCompleter implements Completer
{
    private ArrayList<String> suggestions;

    private String prevVal;
    private String original;                                  // the original buffer string
    private int currValIdx;                                   // the index of the previous word suggested in completion
    private boolean inCompletionMode;                         // true if tab is pressed once, turns false when previous word of the current input does not match the previous suggestion
    private ArrayList<Pair<String, Integer>> currSuggestions; // the list of current suggestions and their offsets in the original string


    public FinalCompleter(ArrayList<String> suggestions)
    {
        currValIdx = 0;
        prevVal = "";
        original = "";
        inCompletionMode = false;
        updateSuggestions(suggestions);
    }

    public void updateSuggestions(ArrayList<String> newSuggestions)
    {
        suggestions = newSuggestions;
        sortSuggestions();
    }

    private void sortSuggestions()
    {
        suggestions.sort((p1, p2) -> p1.compareTo(p2));
    }

    @Override
    public int complete(final String buffer, final int cursor, final List<CharSequence> candidates)
    {
        if(inCompletionMode && !buffer.endsWith(prevVal) || !buffer.startsWith(original))
        {
            // the buffer does not end with the last match, so we reset the procedure
            inCompletionMode = false;
        }

        if(!inCompletionMode)
        {
            // extract the final word (or rather the part of it that was started
            String lastWord = "";
            if(buffer.contains(" "))
            {
                if(buffer.lastIndexOf(' ') + 1 < buffer.length())
                    lastWord = buffer.substring(buffer.lastIndexOf(' ') + 1, buffer.length());
            }
            else
                lastWord = buffer;

            // now we perform the matching process on the lastWord
            prevVal = lastWord;
            original = buffer;
            currValIdx = -1;
            // we fill up the potential suggestions
            currSuggestions = filterSuggestions(buffer);
            inCompletionMode = true;

            switch (currSuggestions.size())
            {
                case 0: // no suggestions can be made, so we fail
                    inCompletionMode = false;
                    return 0;
                case 1: // there is exactly one perfect match, so we put that
                    inCompletionMode = false;
                    break;
            }
        }

        // move the index to the next value
        currValIdx = (currValIdx + 1) % currSuggestions.size();

        // retrieve the current suggestion
        String currVal = currSuggestions.get(currValIdx).getKey();
        int currOffset = currSuggestions.get(currValIdx).getValue();

        // extract everything apart from the previous set value
        String output = buffer.substring(0, currOffset) + currVal;

        prevVal = currVal;
        candidates.add(0, output);
        return 0;
    }

    // add all the possible suggestions to the list
    private ArrayList<Pair<String, Integer>> filterSuggestions(String buffer)
    {
        ArrayList<String> prefixes = new ArrayList<>();
        String tmp = buffer;
        boolean addall = false;
        if(buffer.equals(""))
            addall = true;
        else while(tmp.length() > 0)
        {
            prefixes.add(tmp);
            if(tmp.contains(" "))
            {
                if(tmp.indexOf(' ') + 1 < tmp.length())
                    tmp = tmp.substring(tmp.indexOf(' ') + 1, tmp.length());
                else
                {
                    tmp = "";
                    addall = true;
                }
            }
            else
                tmp = "";
        }
        ArrayList<Pair<String, Integer>> sugs = new ArrayList<>();
        for(String elem : suggestions)
        {
            for(String prefix : prefixes)
            {
                if (elem.startsWith(prefix))
                {
                    sugs.add(new Pair<>(elem, new Integer(buffer.length() - prefix.length())));
                    break;
                }
            }
        }
        if(addall && sugs.size() == 0)
        {
            // if there were no other suggestions, suggest everything
            for(String elem : suggestions)
            {
                sugs.add(new Pair<>(elem, new Integer(buffer.length())));
            }
        }
        return sugs;
    }

    public static void setBuffer(final ConsoleReader reader, final CharSequence value, final int offset) throws
            IOException
    {
        while ((reader.getCursorBuffer().cursor > offset) && reader.backspace()) {
            // empty
        }

        reader.putString(value);
        reader.setCursorPosition(offset + value.length());
    }
}
