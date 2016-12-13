package input.parser;

import com.google.common.io.Files;
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

import java.io.File;
import java.nio.charset.Charset;
import java.util.*;

/**
 * Created by Milos on 25/11/2016.
 */
public class NLPparser
{
    private ArrayList<String> item_compounds;
    private HashMap<String, HashSet<String>> connectors; // a map of all possible connectors a command takes

    private Properties props;
    private StanfordCoreNLP pipeline;

    public NLPparser(Engine eng)
    {
        //item_compounds = new ArrayList<>(eng.getItemKeySet());
        connectors = new HashMap<>();
        connectors.put("use", new HashSet<>(Arrays.asList("on", "with")));
        connectors.put("combine", new HashSet<>(Arrays.asList("and", "with")));

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
        // create an empty Annotation just with the given text
        Annotation line = new Annotation(input);

        // run all Annotators on this input line
        pipeline.annotate(line);

        // get all the sentences from the input and use only the first one
        List<CoreMap> sentences = line.get(CoreAnnotations.SentencesAnnotation.class);
        CoreMap sentence = sentences.get(0);
        Command res = null;
        /*
        // traversing the words in the current sentence
        // a CoreLabel is a CoreMap with additional token-specific methods
        for (CoreLabel token : sentence.get(TokensAnnotation.class))
        {
            // this is the text of the token
            String word = token.get(TextAnnotation.class);
            // this is the POS tag of the token
            String pos = token.get(PartOfSpeechAnnotation.class);
            // this is the NER label of the token
            String ne = token.get(NamedEntityTagAnnotation.class);
            // this is the lemmatization of the token
            String lem = token.get(LemmaAnnotation.class);

            System.out.println("word: " + word + " pos: " + pos + " ne:" + ne + " lem:" + lem);
        }*/
        /*
        // this is the parse tree of the current sentence
        Tree tree = sentence.get(TreeAnnotation.class);
        System.out.println("parse tree:\n" + tree);
        */
        // this is the Stanford dependency graph of the current sentence
        SemanticGraph dependencies = sentence.get(SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation.class);
        System.out.println(sentence + "\n" + dependencies);

        // process the sentence and retrieve the command
        // first search for longer commands (useon and combine)

        

        // TODO do the parsing here
        return res;
    }
}
