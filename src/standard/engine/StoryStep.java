package standard.engine;

import java.util.ArrayList;

/**
 * Created by Milos on 06/11/2016.
 */
public class StoryStep
{
    // step format: [step_id]{parent_steps}{conditions}{consequences}"message"
    // parent_steps are a list of parent steps which need to be satisfied + the conditions for the step to be enacted
    String step_id;                      // the steps identifier
    ArrayList<Condition> conditions;     // the set of preconditions which ALL need to be met for the consequences to be triggered
    ArrayList<Consequence> consequences; // the set of consequences which are triggered when all the conditions are met
    String message;                      // the message printed when the step is activated
    boolean activated;                   // true if the step has been activated once (We only allow steps to be activated once!)

    ArrayList<StoryStep> child_steps;  // a list of steps which are direct descendants of the current step
    ArrayList<StoryStep> parent_steps; // a list of steps which are direct predecessors of the current step
    boolean Ands;                      // true if the node requires all the parent_steps to be true, false if it requires at least one
}


