package standard.engine;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Milos on 06/11/2016.
 */
public class StoryStep implements Comparable
{
    // parent_steps are a list of parent steps which need to be satisfied + the conditions for the step to be enacted
    String step_id;                    // the steps identifier
    TreeSet<Condition> conditions;     // the set of preconditions which ALL need to be met for the consequences to be triggered
    TreeSet<Consequence> consequences; // the set of consequences which are triggered when all the conditions are met
    Message message;                   // the message printed when the step is activated
    HashMap<String, StoryStep> child_steps;    // a list of steps which are direct descendants of the current step
    HashMap<String, StoryStep> parent_steps;   // a list of steps which are direct predecessors of the current step
    boolean ands;                      // true if the node requires all the parent_steps to be true, false if it requires at least one
    boolean satisfied;                 // true if the step is always satisfied

    // placeholder step creator
    public StoryStep(String step_id)
    {
        this.step_id = step_id;
    }

    // creator for the start step
    public StoryStep(String step_id, boolean satisfied)
    {
        this.step_id = step_id;
        this.satisfied = satisfied;
        message = new Message("start", "initial step");
        parent_steps = new HashMap<>();
        child_steps = new HashMap<>();
        conditions = new TreeSet<>();
        consequences = new TreeSet<>();
    }

    // creates a bare story step
    public StoryStep(String step_id, Message message, boolean ands)
    {
        this.step_id = step_id;
        conditions = new TreeSet<>();
        consequences = new TreeSet<>();
        this.message = message;
        child_steps = new HashMap<>();
        parent_steps = new HashMap<>();
        this.ands = ands;
        satisfied = false;
    }

    //------------------Parser-Related-Bit----------------------
    //------------------Linker-Related-Bit----------------------
    public Set<String> getChildStepsKeySet()
    {
        return child_steps.keySet();
    }
    public Set<String> getParentStepsKeySet()
    {
        return parent_steps.keySet();
    }
    public StoryStep getParent(String parent_id)
    {
        return parent_steps.get(parent_id);
    }
    public StoryStep getChild(String child_id)
    {
        return child_steps.get(child_id);
    }
    //----------------------------------------------------------

    @Override
    public int compareTo(Object o)
    {
        if (o instanceof StoryStep)
        {
            return ((StoryStep) o).step_id.compareTo(step_id);
        }
        return -1;
    }

    public void satisfy()
    {
        satisfied = true;
    }

    public HashMap<String, StoryStep> getChildren()
    {
        return child_steps;
    }

    public HashMap<String, StoryStep> getParents()
    {
        return parent_steps;
    }

    public String getStep_id()
    {
        return step_id;
    }

    public void setStep_id(String step_id)
    {
        this.step_id = step_id;
    }

    public Message getMessage()
    {
        return message;
    }

    public void setMessage(Message message)
    {
        this.message = message;
    }

    public boolean ands()
    {
        return ands;
    }

    public void setAnds(boolean ands)
    {
        ands = ands;
    }

    public void addChild(String child_id, StoryStep child)
    {
        child_steps.put(child_id, child);
    }

    public void addParent(String parent_id, StoryStep parent)
    {
        parent_steps.put(parent_id, parent);
    }

    public void addCondition(Condition cond)
    {
        if (!conditions.contains(cond))
            conditions.add(cond);
    }

    public void addConsequence(Consequence cons)
    {
        if (!consequences.contains(cons))
            consequences.add(cons);
    }
}


