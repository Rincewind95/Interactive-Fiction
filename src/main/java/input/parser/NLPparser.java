package input.parser;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import engine.Command;
import engine.Engine;
import engine.Room;
import engine.utility.Utility;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;

public class NLPparser
{
    private ArrayList<String> item_compounds;
    private HashMap<String, String> item_originals;
    private Engine eng;

    public enum argType
    {
        item, dir, saveloc
    } // the possible argument types


    private Properties props;
    private StanfordCoreNLP pipeline;

    public NLPparser(Engine eng)
    {
        item_compounds = new ArrayList<>(eng.getItemKeySet());
        item_originals = new HashMap<>();
        // item_compounds = new ArrayList<>(Arrays.asList("laser", "beam", "laser beam"));
        // sort the item compounds so that we first consider the longest entries
        this.eng = eng;

        // make output of the error stream silent for a moment
        PrintStream err = System.err;
        System.setErr(new PrintStream(new OutputStream()
        {
            public void write(int b)
            {
            }
        }));

        // creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution
        props = new Properties();
        props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
        pipeline = new StanfordCoreNLP(props);

        // set the error stream back to its original state
        System.setErr(err);
    }

    public StanfordCoreNLP getPipeline()
    {
        return pipeline;
    }

    // here we only let the correct commands pass through
    public Command parseInput(String input)
    {
        try
        {
            Command com = parseWithLessCare(input);
            if (Utility.commandUsesSynonymCorrectly(com))
                return com;
            return new Command(Command.Type.badcomm);
        }
        catch (Exception e)
        {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);

            Utility.write(eng.getWriter(), "\u001B[31;1mAn irreversible error has occurred while parsing your input. Pease request assistance immediately!\r\n"
                    + sw.toString()
                    + "\u001B[0m", eng.getTranscriptWriter());
            return new Command(Command.Type.badcomm);
        }
    }

    // here we parse with less care, not paying attention if the user defined synonyms are correctly used
    private Command parseWithLessCare(String input)
    {
        if (input == null || input.length() == 0)
        {
            // if there was no input return a bad command
            return new Command(Command.Type.badcomm);
        }

        // remove all the extra spaces
        input = Utility.removeWhiteSpace(input);
        String original = input;
        // now test for special commands before any NLP is done
        if (eng.hasSpecial(input))
            return new Command(Command.Type.special, new ArrayList<>(Arrays.asList(input)), original, original);

        // find all the occurrences of items in the sentence and map them to "item1", "item2" etc.
        HashMap<String, String> itemMapping = new HashMap<>();
        int curr_mapping = 1;

        updateItemCompounds();
        for (String item : item_compounds)
        {
            if (input.contains(item))
            {
                itemMapping.put("item" + curr_mapping, item_originals.get(item));
                input = input.replace(item, "item" + curr_mapping);
                curr_mapping++;
            }
        }

        if (Utility.hasWord("dont",  input) ||
            Utility.hasWord("don't", input) ||
            input.contains("n't") ||
            Utility.hasWord("not",   input) ||
            Utility.hasWord("never", input))
        {
            // negation is applied somewhere within the command
            // reject all such inputs
            return new Command(Command.Type.badcomm);
        }

        // create an empty Annotation just with the given text
        Annotation line = new Annotation(input);

        // run all Annotators on this input line
        pipeline.annotate(line);

        // get all the sentences from the input and use only the first one
        List<CoreMap> sentences = line.get(CoreAnnotations.SentencesAnnotation.class);
        CoreMap sentence = sentences.get(0);
        Command res = null;

        // this is the Stanford dependency graph of the current sentence
        SemanticGraph dependencies = sentence.get(SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation.class);
        // process the sentence and retrieve the command

        // first search for longer commands which take two arguments (useon and combine)
        for (String word : Utility.orderedTwoArgumentSynonyms)
        {
            String keyword = Utility.twoArgumentsynonyms.get(word); // the identifying word from the synonyms set
            IndexedWord verb = findIndexedWord(dependencies, word);
            if (verb == null)
                continue;

            TreeSet<IndexedWord> all = new TreeSet<>();
            TreeSet<IndexedWord> parents = getParents(dependencies, verb);
            TreeSet<IndexedWord> siblings = getSiblings(dependencies, verb);
            TreeSet<IndexedWord> children = getChildren(dependencies, verb);
            for(IndexedWord sibling : siblings)
            {
                // add all the children of the siblings as well
                children.addAll(getChildren(dependencies, sibling));
            }
            for (IndexedWord child : children)
            {
                // as well as all the possible grandchildren
                all.addAll(getChildren(dependencies, child));
            }

            all.addAll(parents);
            all.addAll(siblings);
            all.addAll(children);
            // retrieve the arguments
            int curr_arg = 0;
            String originalConnector = "";
            ArrayList<String> args = new ArrayList<>();
            for (IndexedWord arg : all)
            {
                String lemma = arg.get(CoreAnnotations.LemmaAnnotation.class);
                if(curr_arg >= 2)
                {
                    // no more arguments are expected at this point, so we just test if the word matches any of the
                    // arguments, in which case this is a bad command
                    for(argType twoArgType : Utility.twoArguments.get(keyword))
                    {
                        if (twoArgType == argType.item)
                        {
                            if (itemMapping.containsKey(lemma))
                            {
                                // the breaking case
                                return new Command(Command.Type.badcomm);
                            }
                        }
                    }
                }
                else
                {
                    switch (Utility.twoArguments.get(keyword).get(curr_arg))
                    {
                        case item:
                            if (itemMapping.containsKey(lemma))
                            {
                                if (curr_arg == 1)
                                {
                                    boolean works = false;
                                    if (Utility.twoArgumentConnectors.get(word) == null)
                                    {
                                        // it is a special case (probably use) so we fail it as a bad command
                                        return new Command(Command.Type.badcomm);
                                    }
                                    for (String connector : Utility.twoArgumentConnectors.get(word))
                                    {
                                        IndexedWord curr_child = findIndexedWord(dependencies, connector);
                                        if (curr_child == null)
                                            continue;
                                        originalConnector = connector;
                                        works = true;
                                        break;
                                    }
                                    if (works)
                                    {
                                        args.add(itemMapping.get(lemma));
                                        curr_arg++;
                                    }
                                }
                                else
                                {
                                    args.add(itemMapping.get(lemma));
                                    curr_arg++;
                                }
                            }
                            break;
                    }
                }
            }
            if (curr_arg == 0)
            {
                // we have a bad command
                return new Command(Command.Type.badcomm);
            }

            if (curr_arg == 1)
            {
                // if there is only one argument to the two argument command
                if(keyword.equals("use"))
                {
                    // this means we in fact have use and not useon
                    return new Command(Command.Type.use, args, original, word);
                }
                 else if(keyword.equals("remove"))
                {
                    //we in fact have a take command
                    return new Command(Command.Type.take, args, original, word);
                }
                else
                {
                    // we have a bad command
                    return new Command(Command.Type.badcomm);
                }
            }


            // otherwise we have useon
            if (keyword.equals("use"))
                keyword = "useon";
            if (keyword.equals("put"))
                keyword = "putin";
            //System.out.println(word + " " + args);
            return new Command(Command.Type.valueOf(keyword), args, original, word, originalConnector);
        }

        for (String word : Utility.oneArgumentsynonyms.keySet())
        {
            String keyword = Utility.oneArgumentsynonyms.get(word);
            IndexedWord verb = findIndexedWord(dependencies, word);
            if (verb == null)
                continue;

            TreeSet<IndexedWord> parents = getParents(dependencies, verb);
            TreeSet<IndexedWord> children = getChildren(dependencies, verb);

            TreeSet<IndexedWord> all = new TreeSet<>();
            all.addAll(parents);
            all.addAll(children);

            // retrieve the arguments
            ArrayList<String> args = new ArrayList<>();
            int curr_arg = 0;
            for (IndexedWord arg : all)
            {
                String lemma = arg.get(CoreAnnotations.LemmaAnnotation.class);
                switch (Utility.oneArguments.get(keyword))
                {
                    case item:
                        if (itemMapping.containsKey(lemma))
                        {
                            if (curr_arg == 1)
                                return new Command(Command.Type.badcomm);
                            args.add(itemMapping.get(lemma));
                            curr_arg++;
                        }
                        else if(keyword.equals("examine") && lemma.equals("inventory"))
                        {
                            // special case, when examine inventory is performed
                            if (curr_arg == 1)
                                return new Command(Command.Type.badcomm);
                            args.add(lemma);
                            curr_arg++;
                        }
                        break;
                    case dir:
                        if (Utility.dirMapping.containsKey(lemma))
                        {
                            if (curr_arg == 1)
                                return new Command(Command.Type.badcomm);
                            args.add(Utility.dirMapping.get(lemma));
                            curr_arg++;
                        }
                        break;
                }
            }
            if (curr_arg == 0)
            {
                if(keyword.equals("examine") && word.equals("look"))
                {
                    // it is in fact a look type response
                    return new Command(Command.Type.look, args, original, word);
                }
                else
                {
                    return new Command(Command.Type.badcomm);
                }
            }

            //System.out.println(word + " " + args);
            return new Command(Command.Type.valueOf(keyword), args, original, word);

        }

        // test for zero argument commands
        for (String word : Utility.zeroArgumentsynonyms.keySet())
        {
            String keyword = Utility.zeroArgumentsynonyms.get(word);
            IndexedWord verb = findIndexedWord(dependencies, word);
            if (verb == null)
                continue;
            //System.out.println(word);
            return new Command(Command.Type.valueOf(keyword), original, word);
        }

        return new Command(Command.Type.badcomm);
    }

    private TreeSet<IndexedWord> getParents(SemanticGraph graph, IndexedWord word)
    {
        TreeSet<IndexedWord> parents = new TreeSet<>();
        if (graph.getParent(word) != null)
        {
            parents = new TreeSet<>();
            parents.add(graph.getParent(word));
            parents.addAll(graph.getSiblings(graph.getParent(word)));
        }
        return parents;
    }

    private TreeSet<IndexedWord> getSiblings(SemanticGraph graph, IndexedWord word)
    {
        TreeSet<IndexedWord> siblings = new TreeSet<>();
        siblings.addAll(graph.getSiblings(word));
        return siblings;
    }

    private TreeSet<IndexedWord> getChildren(SemanticGraph graph, IndexedWord word)
    {
        TreeSet<IndexedWord> children = new TreeSet<>();
        children.addAll(graph.getChildren(word));
        return children;
    }

    // finds the indexedWord with the appropriate lemmatization
    private IndexedWord findIndexedWord(SemanticGraph graph, String word)
    {
        IndexedWord res = null;
        for (int i = 1; i <= graph.size(); i++)
        {
            res = graph.getNodeByIndex(i);
            if (res.get(CoreAnnotations.LemmaAnnotation.class).equals(word))
            {
                return res;
            }
        }
        return null;
    }

    // update the set of all accepted item names (with extras)
    private void updateItemCompounds()
    {
        Room current = eng.getPlayer().getLocation();
        item_compounds.clear();
        item_originals.clear();

        ArrayList<String> itemsPresent = current.listAllItems(eng);
        for(String itemId : itemsPresent)
        {
            item_compounds.add(itemId);
            item_originals.put(itemId, itemId);
        }

        ArrayList<String> itemsInv = eng.getPlayer().listAllItems(eng);
        for(String itemId : itemsInv)
        {
            item_compounds.add(itemId);
            item_originals.put(itemId, itemId);
        }

        ArrayList<String> extras = new ArrayList<>();
        for(String item : item_compounds)
        {
            HashSet<String> suffixes = new HashSet<>();
            String tmp = item;
            while (tmp.length() > 0 && tmp.contains(" "))
            {
                if (tmp.contains(" "))
                {
                    tmp = tmp.substring(tmp.indexOf(' ') + 1, tmp.length());
                    suffixes.add(tmp);
                }
                else
                    break;
            }
            for (String suffix : suffixes)
            {
                boolean shouldAdd = true;
                for (String curr : item_compounds)
                {
                    if (curr.endsWith(suffix) && !curr.equals(item))
                    {
                        shouldAdd = false;
                        break;
                    }
                }
                if (shouldAdd)
                {
                    extras.add(suffix);
                    item_originals.put(suffix, item);
                }
            }
        }
        item_compounds.addAll(extras);

        if(eng.isEnhanced())
        {
            for (String itemId : itemsPresent)
            {
                String item = eng.findItem(itemId).getFullID(eng.isEnhanced());
                item_compounds.add(item);
                item_originals.put(item, itemId);
            }
            for (String itemId : itemsInv)
            {
                String item = eng.findItem(itemId).getFullID(eng.isEnhanced());
                item_compounds.add(item);
                item_originals.put(item, itemId);
            }
        }

        // add all the versions starting with the or a/an
        ArrayList<String> current_compounds = new ArrayList<>(item_compounds);
        for(String compound : current_compounds)
        {
            String newCompoundThe = Utility.addThe(compound);
            String newCompoundAAn = Utility.addAorAn(compound);
            item_compounds.add(newCompoundThe);
            item_compounds.add(newCompoundAAn);
            item_originals.put(newCompoundThe, item_originals.get(compound));
            item_originals.put(newCompoundAAn, item_originals.get(compound));
        }

        // add the special command all at the end
        item_compounds.addAll(Utility.theAlls);
        for(String all : Utility.theAlls)
        {
            item_originals.put(all, "all");
        }

        item_compounds.sort((String s1, String s2) -> s1.length() == s2.length() ? s1.compareTo(s2) : s2.length() - s1.length());
    }
}

