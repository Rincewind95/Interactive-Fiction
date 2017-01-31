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
    private String step_id;                            // the steps identifier
    private TreeSet<Condition> conditions;             // the set of preconditions which ALL need to be met for the consequences to be triggered
    private TreeSet<Consequence> consequences;         // the set of consequences which are triggered when all the conditions are met
    private Message message;                           // the message printed when the step is activated
    private HashMap<String, StoryStep> child_steps;    // a list of steps which are direct descendants of the current step
    private HashMap<String, StoryStep> parent_steps;   // a list of steps which are direct predecessors of the current step
    private HashMap<String, Integer> sat_before;       // a map of times at least before the parents need to be satisfied
    private boolean ands;                              // true if the node requires all the parent_steps to be true, false if it requires at least one
    private boolean satisfied;                         // true if the step is always satisfied
    private int timestamp;                             // time of satisfaction
    private Message hint;                              // a hint for the story step if one exists
    private boolean hasHint;                           // true if there is a hint

    // placeholder step creator
    public StoryStep(String step_id)
    {
        this.step_id = step_id;
        hint = null;
        hasHint = false;
    }

    // creator for the start step
    public StoryStep(String step_id, boolean satisfied)
    {
        this.step_id = step_id;
        this.satisfied = satisfied;
        timestamp = 0;
        message = new Message("start", "initial step");
        parent_steps = new HashMap<>();
        child_steps = new HashMap<>();
        conditions = new TreeSet<>();
        consequences = new TreeSet<>();
        sat_before = new HashMap<>();
        hint = null;
        hasHint = false;
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
        timestamp = 0;
        sat_before = new HashMap<>();
        hint = null;
        hasHint = false;
    }

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

    public void satisfy(int time)
    {
        timestamp = time;
        satisfied = true;
    }

    public boolean isSatisfied()
    {
        return satisfied;
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
        this.ands = ands;
    }

    public void addChild(String child_id, StoryStep child)
    {
        child_steps.put(child_id, child);
    }

    public void addParent(String parent_id, StoryStep parent)
    {
        parent_steps.put(parent_id, parent);
    }

    public boolean canBeSatisfied(Engine eng)
    {
        if (satisfied)
            return false;
        boolean res = false;
        if (ands)
            res = true;
        for (String parent_id : parent_steps.keySet())
        {
            StoryStep parent = parent_steps.get(parent_id);
            boolean parent_sat = parent.isSatisfied() && (eng.getTime() - parent.getTimestamp() >= sat_before.get(parent_id));
            if (ands)
                res = res && parent_sat;
            else
                res = res || parent_sat;
        }
        return res && hasConditionsSatisfied(eng);
    }

    // if its parents are satisfied
    public boolean isHintCandidate()
    {
        if (satisfied)
            return false;
        boolean res = false;
        if (ands)
            res = true;
        for (String parent_id : parent_steps.keySet())
        {
            StoryStep parent = parent_steps.get(parent_id);
            boolean parent_sat = parent.isSatisfied();
            if (ands)
                res = res && parent_sat;
            else
                res = res || parent_sat;
        }

        // test if all the children are satisfied, and if so, this is not our hint candidate
        boolean children_sat = true;
        for(String child_id : child_steps.keySet())
        {
            StoryStep child = child_steps.get(child_id);
            children_sat = children_sat && child.isSatisfied();
        }
        return res && ((!child_steps.isEmpty() && !children_sat) || isWinning());
    }

    public boolean isWinning()
    {
        for(Consequence cons: consequences)
        {
            if (cons.getType() == Consequence.ConsType.win)
                return true;
        }
        return false;
    }

    public int lastParentSatisfactionTime(int currentTime)
    {
        int res = currentTime;
        for(String parent : parent_steps.keySet())
        {
            StoryStep curr = parent_steps.get(parent);
            if(curr.satisfied && (currentTime - curr.getTimestamp() < res))
            {
                res = currentTime - curr.getTimestamp();
            }
        }
        return res;
    }

    public boolean playerIsInRigthRoom(Engine eng)
    {
        String room = eng.getPlayer().getLocation().getRoom_id();
        for (Condition cond : conditions)
        {
            switch (cond.getType())
            {
                case plir:
                    // player in room
                    return room.equals(cond.getArgs().get(0));
            }
        }
        return true;
    }

    public boolean hasHint()
    {
        return hasHint;
    }

    public int satisfiedConditionCount(Engine eng)
    {
        int cnt = 0;
        for (Condition cond : conditions)
            cnt = cnt + (cond.evaluate(eng) ? 1 : 0);
        return cnt;
    }

    public void addCondition(Condition cond)
    {
        if (!conditions.contains(cond))
            conditions.add(cond);
    }

    public TreeSet<Condition> getConditions()
    {
        return conditions;
    }

    public TreeSet<Consequence> getConsequences()
    {
        return consequences;
    }

    public boolean hasConditionsSatisfied(Engine eng)
    {
        boolean res = true;
        for (Condition cond : conditions)
            res = res && cond.evaluate(eng);
        return res;
    }

    public void addConsequence(Consequence cons)
    {
        if (!consequences.contains(cons))
            consequences.add(cons);
    }

    public Consequence.Effect invokeConsequences(Engine eng)
    {
        Consequence.Effect res = Consequence.Effect.procede;
        for (Consequence cons : consequences)
        {
            Consequence.Effect ef = cons.invoke(eng);
            if (res != ef)
            {
                if (res != Consequence.Effect.kill)
                {
                    if (ef == Consequence.Effect.win)
                        res = ef;
                }
            }
        }
        return res;
    }

    public void addSatBefore(String step_id, int time)
    {
        sat_before.put(step_id, time);
    }

    public int getSatBefore(String step_id)
    {
        return sat_before.get(step_id);
    }

    public int getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(int timestamp)
    {
        this.timestamp = timestamp;
    }

    public void setHint(Message hint)
    {
        if(hint == null)
            hasHint = false;
        else
            hasHint = true;
        this.hint = hint;
    }

    public Message getHintMessage()
    {
        return hint;
    }

    public String getHint()
    {
        if(hint != null)
            return hint.getMsg();
        return null;
    }
}


