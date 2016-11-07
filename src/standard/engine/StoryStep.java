package standard.engine;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Milos on 06/11/2016.
 */
public class StoryStep
{
    // step format: [step_id]{parent_steps}{conditions}{consequences}"message"
    // parent_steps are a list of parent steps which need to be satisfied + the conditions for the step to be enacted
    String step_id;                    // the steps identifier
    TreeSet<Condition> conditions;     // the set of preconditions which ALL need to be met for the consequences to be triggered
    TreeSet<Consequence> consequences; // the set of consequences which are triggered when all the conditions are met
    String message;                    // the message printed when the step is activated
    boolean satisfied;                 // true if the step has been activated once (We only allow steps to be activated once!)

    TreeSet<StoryStep> child_steps;    // a list of steps which are direct descendants of the current step
    TreeSet<StoryStep> parent_steps;   // a list of steps which are direct predecessors of the current step
    boolean Ands;                      // true if the node requires all the parent_steps to be true, false if it requires at least one

    // creates an empty story step
    public StoryStep(String step_id, String message, boolean satisfied)
    {
        this.step_id = step_id;
        conditions = new TreeSet<>();
        consequences = new TreeSet<>();
        this.message = message;
        this.satisfied = satisfied;
        child_steps = new TreeSet<>();
        parent_steps = new TreeSet<>();
        Ands = true;
    }

    public void addChild(StoryStep child)
    {
        child_steps.add(child);
    }

    public void addParent(StoryStep parent)
    {
        parent_steps.add(parent);
    }

    public void addCondition(Condition cond)
    {
        conditions.add(cond);
    }

    public void addConsequence(Consequence cons)
    {
        consequences.add(cons);
    }
}


