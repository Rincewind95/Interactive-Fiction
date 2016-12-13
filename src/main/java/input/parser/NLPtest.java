package input.parser;

import com.google.common.io.Files;

import edu.stanford.nlp.dcoref.CorefChain;
import edu.stanford.nlp.dcoref.CorefCoreAnnotations.CorefChainAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreAnnotations.*;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeCoreAnnotations.TreeAnnotation;
import edu.stanford.nlp.util.CoreMap;
import edu.stanford.nlp.util.StreamGobbler;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

/**
 * A simple corenlp example ripped directly from the Stanford CoreNLP website using text from wikinews.
 */
public class NLPtest
{

    public static void main(String[] args) throws IOException
    {
        // read some text from the file..
        File inputFile = new File("C:\\Users\\Milos\\Dropbox\\Part II project Interactive Fiction\\Testing\\sample_input.txt");
        String text = Files.toString(inputFile, Charset.forName("UTF-8"));
        text = text.toLowerCase();
        NLPparser parser = new NLPparser(null);
        String[] sentences = text.split("\\.");
        for(String sentence : sentences)
        {
            parser.parseInput(sentence);
        }
    }

}