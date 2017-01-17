// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/main/java/story/grammars\StoryGrammar.g4 by ANTLR 4.5.3
package story.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StoryGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StoryGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#level_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel_id(StoryGrammarParser.Level_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#item_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_id(StoryGrammarParser.Item_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#room_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom_id(StoryGrammarParser.Room_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#message_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_id(StoryGrammarParser.Message_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#message_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_text(StoryGrammarParser.Message_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#story_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStory_elements(StoryGrammarParser.Story_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#welcome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWelcome(StoryGrammarParser.WelcomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(StoryGrammarParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(StoryGrammarParser.RoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#exits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExits(StoryGrammarParser.ExitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit(StoryGrammarParser.ExitContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(StoryGrammarParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#brief}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrief(StoryGrammarParser.BriefContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(StoryGrammarParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(StoryGrammarParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#mobility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMobility(StoryGrammarParser.MobilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(StoryGrammarParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#itemtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemtype(StoryGrammarParser.ItemtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#temp_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_level(StoryGrammarParser.Temp_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#temp_variability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_variability(StoryGrammarParser.Temp_variabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#special_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_id(StoryGrammarParser.Special_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(StoryGrammarParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#step_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_id(StoryGrammarParser.Step_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(StoryGrammarParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(StoryGrammarParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#step_before}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_before(StoryGrammarParser.Step_beforeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#required_steps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequired_steps(StoryGrammarParser.Required_stepsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(StoryGrammarParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(StoryGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#single_arg_cnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_arg_cnd(StoryGrammarParser.Single_arg_cndContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#single_arg_cnd_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_arg_cnd_type(StoryGrammarParser.Single_arg_cnd_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#double_arg_cnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_arg_cnd(StoryGrammarParser.Double_arg_cndContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#double_arg_cnd_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_arg_cnd_type(StoryGrammarParser.Double_arg_cnd_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#consequences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsequences(StoryGrammarParser.ConsequencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#consequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsequence(StoryGrammarParser.ConsequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#no_arg_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_arg_cons(StoryGrammarParser.No_arg_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#single_arg_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_arg_cons(StoryGrammarParser.Single_arg_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#single_arg_cons_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_arg_cons_type(StoryGrammarParser.Single_arg_cons_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#double_arg_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_arg_cons(StoryGrammarParser.Double_arg_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#double_arg_cons_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_arg_cons_type(StoryGrammarParser.Double_arg_cons_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#four_arg_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFour_arg_cons(StoryGrammarParser.Four_arg_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#four_arg_cons_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFour_arg_cons_type(StoryGrammarParser.Four_arg_cons_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoryGrammarParser#gate_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate_type(StoryGrammarParser.Gate_typeContext ctx);
}