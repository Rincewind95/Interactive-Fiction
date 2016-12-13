package input.parser;

import com.google.common.io.Files;
import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.tweet.AT;
import edu.stanford.nlp.dcoref.CorefChain;
import edu.stanford.nlp.dcoref.CorefCoreAnnotations;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import standard.engine.Command;
import standard.engine.Engine;
import standard.engine.Utility;
import sun.security.util.AuthResources_zh_CN;

import java.io.File;
import java.nio.charset.Charset;
import java.util.*;

/**
 * Created by Milos on 25/11/2016.
 */
public class NLPparser
{
    private ArrayList<String> item_compounds;
    private Engine eng;
    private ArrayList<String> twoArgumentWords;                          // the words which take two arguments
    private HashMap<String, ArrayList<argType>> twoArguments;            // a map of their respective argument types
    private ArrayList<String> oneArgumentWords;                          // the words which take one argument
    private HashMap<String, argType> oneArguments;                       // a map of their respective argument types
    private ArrayList<String> zeroArgumentWords;                         // the map of all the words with no arguments

    private enum argType {item, dir, saveloc} // the possible argument types

    private HashMap<String, String> dirMapping; // all the possible direction mappings we take

    private Properties props;
    private StanfordCoreNLP pipeline;

    public NLPparser(Engine eng)
    {
        item_compounds = new ArrayList<>(eng.getItemKeySet());
        // item_compounds = new ArrayList<>(Arrays.asList("laser", "beam", "laser beam"));
        // sort the item compounds so that we first consider the longest entries
        item_compounds.sort((String s1, String s2) -> s1.length() == s2.length() ? s1.compareTo(s2): s2.length() - s1.length());

        this.eng = eng;
        twoArgumentWords = new ArrayList<>(Arrays.asList("use", "combine"));
        oneArgumentWords = new ArrayList<>(Arrays.asList("take", "drop", "examine", "move"));
        zeroArgumentWords = new ArrayList<>(Arrays.asList("look", "brief", "wait", "history", "exit"));

        twoArguments = new HashMap<>();
        twoArguments.put("use", new ArrayList<>(Arrays.asList(argType.item, argType.item)));
        twoArguments.put("combine", new ArrayList<>(Arrays.asList(argType.item, argType.item)));

        oneArguments = new HashMap<>();
        oneArguments.put("take"   , argType.item);
        oneArguments.put("drop"   , argType.item);
        oneArguments.put("examine", argType.item);
        oneArguments.put("move"   , argType.dir);

        dirMapping = new HashMap<>();
        dirMapping.put("north", "n");
        dirMapping.put("east", "e");
        dirMapping.put("south", "s");
        dirMapping.put("west", "w");
        dirMapping.put("n", "n");
        dirMapping.put("e", "e");
        dirMapping.put("s", "s");
        dirMapping.put("w", "w");

        // creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution
        props = new Properties();
        props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
        pipeline = new StanfordCoreNLP(props);
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

        // now test for special commands before any NLP is done
        if(eng.hasSpecial(input))
            return new Command(Command.Type.special, new ArrayList<>(Arrays.asList(input)));

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
        System.out.println(sentence + "\n" + dependencies);

        // process the sentence and retrieve the command


        // first search for longer commands which take two arguments (useon and combine)
        for(String word : twoArgumentWords)
        {
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

            // retrieve the arguments
            int curr_arg = 0;
            ArrayList<String> args = new ArrayList<>();
            for(IndexedWord arg : all)
            {
                String lemma = arg.get(CoreAnnotations.LemmaAnnotation.class);
                switch (twoArguments.get(word).get(curr_arg))
                {
                    case item:
                        if(itemMapping.containsKey(lemma))
                        {
                            if(curr_arg == twoArguments.get(word).size())
                                return new Command(Command.Type.badcomm);
                            args.add(itemMapping.get(lemma));
                            curr_arg++;
                        }
                        break;
                }
            }
            if(curr_arg == 0)
            {
                // we have a bad command
                return new Command(Command.Type.badcomm);
            }

            if(curr_arg == 1 && word.equals("use"))
            {
                // this means we in fact have use and not useon
                System.out.println(word + " " + args);
                return new Command(Command.Type.valueOf(word), args);
            }

            // otherwise we have useon
            if(word.equals("use"))
                word = "useon";
            System.out.println(word + " " + args);
            return new Command(Command.Type.valueOf(word), args);
        }

        for(String word : oneArgumentWords)
        {
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
                switch (oneArguments.get(word))
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
            System.out.println(word + " " + args);
            return new Command(Command.Type.valueOf(word), args);

        }

        // test for zero argument commands
        for(String word : zeroArgumentWords)
        {
            IndexedWord verb = findIndexedWord(dependencies, word);
            if(verb == null)
                continue;
            System.out.println(word);
            return new Command(Command.Type.valueOf(word));
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
