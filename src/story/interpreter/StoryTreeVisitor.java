package story.interpreter;

import org.antlr.v4.runtime.ParserRuleContext;
import standard.engine.Engine;
import story.parser.StoryGrammarBaseVisitor;
import story.parser.StoryGrammarParser;

/**
 * Created by Milos on 09/11/2016.
 */
public class StoryTreeVisitor extends StoryGrammarBaseVisitor<Void>
{
    private Engine eng;

    public StoryTreeVisitor()
    {
        eng = new Engine();
    }

    public Engine extractEngine()
    {
        return eng;
    }

    @Override
    public Void visitStory_elements(StoryGrammarParser.Story_elementsContext ctx) {
        System.out.println("Method name:" + ctx.getText());
        return super.visitStory_elements(ctx);
    }
}
