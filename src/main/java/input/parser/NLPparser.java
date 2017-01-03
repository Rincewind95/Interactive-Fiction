package input.parser;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.CoreNLPProtos;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations;
import edu.stanford.nlp.trees.GrammaticalRelation;
import edu.stanford.nlp.util.CoreMap;
import standard.engine.Command;
import standard.engine.Engine;
import standard.engine.Utility;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.*;

/**
 * Created by Milos on 25/11/2016.
 */
public class NLPparser
{
    private ArrayList<String> item_compounds;
    private Engine eng;
    private static final ArrayList<String> twoArgumentWords;                       // the words which take two arguments
    private static final HashMap<String, ArrayList<argType>> twoArguments;         // a map of their respective argument types
    private static final HashMap<String, ArrayList<String>> twoArgumentConnectors; // the set of connectors expected by the two Argument words
    private static final HashMap<String, String> twoArgumentsynonyms;              // the map of all the synonyms for two argument commands
    private static final ArrayList<String> oneArgumentWords;                       // the words which take one argument
    private static final HashMap<String, argType> oneArguments;                    // a map of their respective argument types
    private static final HashMap<String, String> oneArgumentsynonyms;              // the map of all the synonyms for one argument commands
    private static final ArrayList<String> zeroArgumentWords;                      // the map of all the words with no arguments
    private static final HashMap<String, String> zeroArgumentsynonyms;             // the map of all the synonyms for zero argument commands
    private static final HashMap<String, String> dirMapping;                       // all the possible direction mappings we take

    private enum argType {item, dir, saveloc} // the possible argument types


    private Properties props;
    private StanfordCoreNLP pipeline;

    static
    {
        twoArgumentWords = new ArrayList<>(Arrays.asList("use", "combine", "put", "remove"));
        twoArgumentsynonyms = new HashMap<>();
        twoArgumentsynonyms.put("use"     , "use");
        twoArgumentsynonyms.put("utilize" , "use");
        twoArgumentsynonyms.put("utilise" , "use");
        twoArgumentsynonyms.put("apply"   , "use");
        twoArgumentsynonyms.put("employ"  , "use");
        twoArgumentsynonyms.put("combine" , "combine");
        twoArgumentsynonyms.put("merge"   , "combine");
        twoArgumentsynonyms.put("mix"     , "combine");
        twoArgumentsynonyms.put("fuse"    , "combine");
        twoArgumentsynonyms.put("meld"    , "combine");
        twoArgumentsynonyms.put("compound", "combine");
        twoArgumentsynonyms.put("put"     , "put");
        twoArgumentsynonyms.put("place"   , "put");
        twoArgumentsynonyms.put("position", "put");
        twoArgumentsynonyms.put("remove"  , "remove");

        twoArgumentConnectors = new HashMap<>();
        twoArgumentConnectors.put("use"     , new ArrayList<>(Arrays.asList("with", "on")));
        twoArgumentConnectors.put("utilize" , new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("utilise" , new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("apply"   , new ArrayList<>(Arrays.asList("to")));
        twoArgumentConnectors.put("employ"  , new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("combine" , new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("merge"   , new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("mix"     , new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("fuse"    , new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("meld"    , new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("compound", new ArrayList<>(Arrays.asList("with")));
        twoArgumentConnectors.put("put"     , new ArrayList<>(Arrays.asList("in", "into")));
        twoArgumentConnectors.put("place"   , new ArrayList<>(Arrays.asList("in", "into")));
        twoArgumentConnectors.put("position", new ArrayList<>(Arrays.asList("in")));
        twoArgumentConnectors.put("remove"  , new ArrayList<>(Arrays.asList("from")));

        twoArguments = new HashMap<>();
        twoArguments.put("use"    , new ArrayList<>(Arrays.asList(argType.item, argType.item)));
        twoArguments.put("combine", new ArrayList<>(Arrays.asList(argType.item, argType.item)));
        twoArguments.put("put"    , new ArrayList<>(Arrays.asList(argType.item, argType.item)));
        twoArguments.put("remove" , new ArrayList<>(Arrays.asList(argType.item, argType.item)));

        oneArgumentWords = new ArrayList<>(Arrays.asList("take", "drop", "examine", "move"));
        oneArgumentsynonyms = new HashMap<>();
        oneArgumentsynonyms.put("take"       , "take");
        oneArgumentsynonyms.put("collect"    , "take");
        oneArgumentsynonyms.put("acquire"    , "take");
        oneArgumentsynonyms.put("obtain"     , "take");
        oneArgumentsynonyms.put("claim"      , "take");
        oneArgumentsynonyms.put("get"        , "take");
        oneArgumentsynonyms.put("drop"       , "drop");
        oneArgumentsynonyms.put("leave"      , "drop");
        oneArgumentsynonyms.put("examine"    , "examine");
        oneArgumentsynonyms.put("analyze"    , "examine");
        oneArgumentsynonyms.put("analyse"    , "examine");
        oneArgumentsynonyms.put("inspect"    , "examine");
        oneArgumentsynonyms.put("move"       , "move");
        oneArgumentsynonyms.put("go"         , "move");
        oneArgumentsynonyms.put("proceed"    , "move");
        oneArgumentsynonyms.put("advance"    , "move");
        oneArgumentsynonyms.put("travel"     , "move");

        oneArguments = new HashMap<>();
        oneArguments.put("take"   , argType.item);
        oneArguments.put("drop"   , argType.item);
        oneArguments.put("examine", argType.item);
        oneArguments.put("move"   , argType.dir);

        zeroArgumentWords = new ArrayList<>(Arrays.asList("look", "brief", "wait", "history", "exit", "inventory", "restart"));

        zeroArgumentsynonyms = new HashMap<>();
        zeroArgumentsynonyms.put("look"       , "look");
        zeroArgumentsynonyms.put("investigate", "look");
        zeroArgumentsynonyms.put("brief"      , "brief");
        zeroArgumentsynonyms.put("wait"       , "wait");
        zeroArgumentsynonyms.put("history"    , "history");
        zeroArgumentsynonyms.put("exit"       , "exit");
        zeroArgumentsynonyms.put("quit"       , "exit");
        zeroArgumentsynonyms.put("inventory"  , "inventory");
        zeroArgumentsynonyms.put("restart"    , "restart");

        dirMapping = new HashMap<>();
        dirMapping.put("north", "n");
        dirMapping.put("east",  "e");
        dirMapping.put("south", "s");
        dirMapping.put("west",  "w");
        dirMapping.put("n", "n");
        dirMapping.put("e", "e");
        dirMapping.put("s", "s");
        dirMapping.put("w", "w");
    }

    public NLPparser(Engine eng)
    {
        item_compounds = new ArrayList<>(eng.getItemKeySet());
        // item_compounds = new ArrayList<>(Arrays.asList("laser", "beam", "laser beam"));
        // sort the item compounds so that we first consider the longest entries
        item_compounds.sort((String s1, String s2) -> s1.length() == s2.length() ? s1.compareTo(s2): s2.length() - s1.length());

        this.eng = eng;


        // creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution

        // make output of the error stream silent for a moment
        PrintStream err = System.err;
        System.setErr(new PrintStream(new OutputStream() {
            public void write(int b) {
            }
        }));

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

    public Command parseInput(String input)
    {
        if(input == null || input.length() == 0)
        {
            // if there was no input return a bad command
            return new Command(Command.Type.badcomm);
        }

        // remove all the extra spaces
        input = Utility.removeWhiteSpace(input);
        String original = input;
        // now test for special commands before any NLP is done
        if(eng.hasSpecial(input))
            return new Command(Command.Type.special, new ArrayList<>(Arrays.asList(input)), original);

        // find all the occurrences of items in the sentence and map them to "item1", "item2" etc.
        HashMap<String, String> itemMapping = new HashMap<>();
        int curr_mapping = 1;
        for(String item : item_compounds)
        {
            if(input.contains(item))
            {
                itemMapping.put("item" + curr_mapping, item);
                input = input.replace(item, "item" + curr_mapping);
                curr_mapping++;
            }
        }

        if(input.contains("dont") || input.contains("n't") || input.contains("not"))
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
        //System.out.println(sentence + "\n" + dependencies);

        // process the sentence and retrieve the command


        // first search for longer commands which take two arguments (useon and combine)
        for(String word : twoArgumentsynonyms.keySet())
        {
            String keyword = twoArgumentsynonyms.get(word); // the identifying word from the synonyms set
            IndexedWord verb = findIndexedWord(dependencies, word);
            if(verb == null)
                continue;

            TreeSet<IndexedWord> parents = getParents(dependencies, verb);
            TreeSet<IndexedWord> siblings = getSiblings(dependencies, verb);
            TreeSet<IndexedWord> children = getChildren(dependencies, verb);

            TreeSet<IndexedWord> all = new TreeSet<>();
            all.addAll(parents);
            all.addAll(siblings);
            all.addAll(children);
            for(IndexedWord child : children)
            {
                all.addAll(getChildren(dependencies, child));
            }

            // retrieve the arguments
            int curr_arg = 0;
            ArrayList<String> args = new ArrayList<>();
            for(IndexedWord arg : all)
            {
                String lemma = arg.get(CoreAnnotations.LemmaAnnotation.class);
                switch (twoArguments.get(keyword).get(curr_arg))
                {
                    case item:
                        if(itemMapping.containsKey(lemma))
                        {
                            if(curr_arg >= 2)
                                return new Command(Command.Type.badcomm);
                            else if(curr_arg == 1 && !keyword.equals("use"))
                            {
                                boolean works = false;
                                Set<IndexedWord> curr_children = dependencies.getChildren(arg);
                                for(String connector : twoArgumentConnectors.get(word))
                                {
                                    IndexedWord curr_child = findIndexedWord(dependencies, connector);
                                    if(curr_child == null)
                                        continue;
                                    if(curr_children.contains(curr_child))
                                        works = true;
                                }
                                if(works)
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
            if(curr_arg == 0)
            {
                // we have a bad command
                return new Command(Command.Type.badcomm);
            }

            if(curr_arg == 1)
            {
                if(keyword.equals("use"))
                {
                    // this means we in fact have use and not useon
                    //System.out.println(word + " " + args);
                    return new Command(Command.Type.valueOf(keyword), args, original);
                }
                else
                {
                    // we have a bad command
                    return new Command(Command.Type.badcomm);
                }
            }

            // otherwise we have useon
            if(keyword.equals("use"))
                keyword = "useon";
            if(keyword.equals("put"))
                keyword = "putin";
            //System.out.println(word + " " + args);
            return new Command(Command.Type.valueOf(keyword), args, original);
        }

        for(String word : oneArgumentsynonyms.keySet())
        {
            String keyword = oneArgumentsynonyms.get(word);
            IndexedWord verb = findIndexedWord(dependencies, word);
            if(verb == null)
                continue;

            TreeSet<IndexedWord> parents = getParents(dependencies, verb);
            TreeSet<IndexedWord> children = getChildren(dependencies, verb);

            TreeSet<IndexedWord> all = new TreeSet<>();
            all.addAll(parents);
            all.addAll(children);

            // retrieve the arguments
            ArrayList<String> args = new ArrayList<>();
            int curr_arg = 0;
            for(IndexedWord arg : all)
            {
                String lemma = arg.get(CoreAnnotations.LemmaAnnotation.class);
                switch (oneArguments.get(keyword))
                {
                    case item:
                        if(itemMapping.containsKey(lemma))
                        {
                            if(curr_arg == 1)
                                return new Command(Command.Type.badcomm);
                            args.add(itemMapping.get(lemma));
                            curr_arg++;
                        }
                        break;
                    case dir:
                        if(dirMapping.containsKey(lemma))
                        {
                            if(curr_arg == 1)
                                return new Command(Command.Type.badcomm);
                            args.add(dirMapping.get(lemma));
                            curr_arg++;
                        }
                        break;
                }
            }
            if(curr_arg == 0)
                return new Command(Command.Type.badcomm);
            //System.out.println(word + " " + args);
            return new Command(Command.Type.valueOf(keyword), args, original);

        }

        // test for zero argument commands
        for(String word : zeroArgumentsynonyms.keySet())
        {
            String keyword = zeroArgumentsynonyms.get(word);
            IndexedWord verb = findIndexedWord(dependencies, word);
            if(verb == null)
                continue;
            //System.out.println(word);
            return new Command(Command.Type.valueOf(keyword), original);
        }

        return new Command(Command.Type.badcomm);
    }

    private TreeSet<IndexedWord> getParents(SemanticGraph graph, IndexedWord word)
    {
        TreeSet<IndexedWord> parents = new TreeSet<>();
        if(graph.getParent(word) != null)
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
        for(int i = 1; i <= graph.size(); i++)
        {
            res = graph.getNodeByIndex(i);
            if(res.get(CoreAnnotations.LemmaAnnotation.class).equals(word))
            {
                return res;
            }
        }
        return null;
    }
}
