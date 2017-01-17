// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/main/java/story/grammars\StoryGrammar.g4 by ANTLR 4.5.3
package story.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StoryGrammarParser}.
 */
public interface StoryGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#level_id}.
	 * @param ctx the parse tree
	 */
	void enterLevel_id(StoryGrammarParser.Level_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#level_id}.
	 * @param ctx the parse tree
	 */
	void exitLevel_id(StoryGrammarParser.Level_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#item_id}.
	 * @param ctx the parse tree
	 */
	void enterItem_id(StoryGrammarParser.Item_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#item_id}.
	 * @param ctx the parse tree
	 */
	void exitItem_id(StoryGrammarParser.Item_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#room_id}.
	 * @param ctx the parse tree
	 */
	void enterRoom_id(StoryGrammarParser.Room_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#room_id}.
	 * @param ctx the parse tree
	 */
	void exitRoom_id(StoryGrammarParser.Room_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#message_id}.
	 * @param ctx the parse tree
	 */
	void enterMessage_id(StoryGrammarParser.Message_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#message_id}.
	 * @param ctx the parse tree
	 */
	void exitMessage_id(StoryGrammarParser.Message_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#message_text}.
	 * @param ctx the parse tree
	 */
	void enterMessage_text(StoryGrammarParser.Message_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#message_text}.
	 * @param ctx the parse tree
	 */
	void exitMessage_text(StoryGrammarParser.Message_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#story_elements}.
	 * @param ctx the parse tree
	 */
	void enterStory_elements(StoryGrammarParser.Story_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#story_elements}.
	 * @param ctx the parse tree
	 */
	void exitStory_elements(StoryGrammarParser.Story_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#welcome}.
	 * @param ctx the parse tree
	 */
	void enterWelcome(StoryGrammarParser.WelcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#welcome}.
	 * @param ctx the parse tree
	 */
	void exitWelcome(StoryGrammarParser.WelcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(StoryGrammarParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(StoryGrammarParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#room}.
	 * @param ctx the parse tree
	 */
	void enterRoom(StoryGrammarParser.RoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#room}.
	 * @param ctx the parse tree
	 */
	void exitRoom(StoryGrammarParser.RoomContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#exits}.
	 * @param ctx the parse tree
	 */
	void enterExits(StoryGrammarParser.ExitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#exits}.
	 * @param ctx the parse tree
	 */
	void exitExits(StoryGrammarParser.ExitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#exit}.
	 * @param ctx the parse tree
	 */
	void enterExit(StoryGrammarParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#exit}.
	 * @param ctx the parse tree
	 */
	void exitExit(StoryGrammarParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(StoryGrammarParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(StoryGrammarParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#brief}.
	 * @param ctx the parse tree
	 */
	void enterBrief(StoryGrammarParser.BriefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#brief}.
	 * @param ctx the parse tree
	 */
	void exitBrief(StoryGrammarParser.BriefContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(StoryGrammarParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(StoryGrammarParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(StoryGrammarParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(StoryGrammarParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#mobility}.
	 * @param ctx the parse tree
	 */
	void enterMobility(StoryGrammarParser.MobilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#mobility}.
	 * @param ctx the parse tree
	 */
	void exitMobility(StoryGrammarParser.MobilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(StoryGrammarParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(StoryGrammarParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#itemtype}.
	 * @param ctx the parse tree
	 */
	void enterItemtype(StoryGrammarParser.ItemtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#itemtype}.
	 * @param ctx the parse tree
	 */
	void exitItemtype(StoryGrammarParser.ItemtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#temp_level}.
	 * @param ctx the parse tree
	 */
	void enterTemp_level(StoryGrammarParser.Temp_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#temp_level}.
	 * @param ctx the parse tree
	 */
	void exitTemp_level(StoryGrammarParser.Temp_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#temp_variability}.
	 * @param ctx the parse tree
	 */
	void enterTemp_variability(StoryGrammarParser.Temp_variabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#temp_variability}.
	 * @param ctx the parse tree
	 */
	void exitTemp_variability(StoryGrammarParser.Temp_variabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#special_id}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_id(StoryGrammarParser.Special_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#special_id}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_id(StoryGrammarParser.Special_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(StoryGrammarParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(StoryGrammarParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#step_id}.
	 * @param ctx the parse tree
	 */
	void enterStep_id(StoryGrammarParser.Step_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#step_id}.
	 * @param ctx the parse tree
	 */
	void exitStep_id(StoryGrammarParser.Step_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(StoryGrammarParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(StoryGrammarParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(StoryGrammarParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(StoryGrammarParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#step_before}.
	 * @param ctx the parse tree
	 */
	void enterStep_before(StoryGrammarParser.Step_beforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#step_before}.
	 * @param ctx the parse tree
	 */
	void exitStep_before(StoryGrammarParser.Step_beforeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#required_steps}.
	 * @param ctx the parse tree
	 */
	void enterRequired_steps(StoryGrammarParser.Required_stepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#required_steps}.
	 * @param ctx the parse tree
	 */
	void exitRequired_steps(StoryGrammarParser.Required_stepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(StoryGrammarParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(StoryGrammarParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(StoryGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(StoryGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#single_arg_cnd}.
	 * @param ctx the parse tree
	 */
	void enterSingle_arg_cnd(StoryGrammarParser.Single_arg_cndContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#single_arg_cnd}.
	 * @param ctx the parse tree
	 */
	void exitSingle_arg_cnd(StoryGrammarParser.Single_arg_cndContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#single_arg_cnd_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_arg_cnd_type(StoryGrammarParser.Single_arg_cnd_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#single_arg_cnd_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_arg_cnd_type(StoryGrammarParser.Single_arg_cnd_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#double_arg_cnd}.
	 * @param ctx the parse tree
	 */
	void enterDouble_arg_cnd(StoryGrammarParser.Double_arg_cndContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#double_arg_cnd}.
	 * @param ctx the parse tree
	 */
	void exitDouble_arg_cnd(StoryGrammarParser.Double_arg_cndContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#double_arg_cnd_type}.
	 * @param ctx the parse tree
	 */
	void enterDouble_arg_cnd_type(StoryGrammarParser.Double_arg_cnd_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#double_arg_cnd_type}.
	 * @param ctx the parse tree
	 */
	void exitDouble_arg_cnd_type(StoryGrammarParser.Double_arg_cnd_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#consequences}.
	 * @param ctx the parse tree
	 */
	void enterConsequences(StoryGrammarParser.ConsequencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#consequences}.
	 * @param ctx the parse tree
	 */
	void exitConsequences(StoryGrammarParser.ConsequencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#consequence}.
	 * @param ctx the parse tree
	 */
	void enterConsequence(StoryGrammarParser.ConsequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#consequence}.
	 * @param ctx the parse tree
	 */
	void exitConsequence(StoryGrammarParser.ConsequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#no_arg_cons}.
	 * @param ctx the parse tree
	 */
	void enterNo_arg_cons(StoryGrammarParser.No_arg_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#no_arg_cons}.
	 * @param ctx the parse tree
	 */
	void exitNo_arg_cons(StoryGrammarParser.No_arg_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#single_arg_cons}.
	 * @param ctx the parse tree
	 */
	void enterSingle_arg_cons(StoryGrammarParser.Single_arg_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#single_arg_cons}.
	 * @param ctx the parse tree
	 */
	void exitSingle_arg_cons(StoryGrammarParser.Single_arg_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#single_arg_cons_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_arg_cons_type(StoryGrammarParser.Single_arg_cons_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#single_arg_cons_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_arg_cons_type(StoryGrammarParser.Single_arg_cons_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#double_arg_cons}.
	 * @param ctx the parse tree
	 */
	void enterDouble_arg_cons(StoryGrammarParser.Double_arg_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#double_arg_cons}.
	 * @param ctx the parse tree
	 */
	void exitDouble_arg_cons(StoryGrammarParser.Double_arg_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#double_arg_cons_type}.
	 * @param ctx the parse tree
	 */
	void enterDouble_arg_cons_type(StoryGrammarParser.Double_arg_cons_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#double_arg_cons_type}.
	 * @param ctx the parse tree
	 */
	void exitDouble_arg_cons_type(StoryGrammarParser.Double_arg_cons_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#four_arg_cons}.
	 * @param ctx the parse tree
	 */
	void enterFour_arg_cons(StoryGrammarParser.Four_arg_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#four_arg_cons}.
	 * @param ctx the parse tree
	 */
	void exitFour_arg_cons(StoryGrammarParser.Four_arg_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#four_arg_cons_type}.
	 * @param ctx the parse tree
	 */
	void enterFour_arg_cons_type(StoryGrammarParser.Four_arg_cons_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#four_arg_cons_type}.
	 * @param ctx the parse tree
	 */
	void exitFour_arg_cons_type(StoryGrammarParser.Four_arg_cons_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoryGrammarParser#gate_type}.
	 * @param ctx the parse tree
	 */
	void enterGate_type(StoryGrammarParser.Gate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoryGrammarParser#gate_type}.
	 * @param ctx the parse tree
	 */
	void exitGate_type(StoryGrammarParser.Gate_typeContext ctx);
}