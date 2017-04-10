package engine.utility;

import engine.Command;
import engine.Condition;
import engine.Engine;

import java.util.HashSet;

/**
 * Command considered important for the purposes of the User Study
 */
public class ImportantCommand
{
    private Command com;
    private HashSet<Condition> conditions;
    private boolean triggered;

    public ImportantCommand(Command command, HashSet<Condition> conds)
    {
        com = command;
        conditions = conds;
        triggered = false;
    }

    public Command getCommand()
    {
        return com;
    }

    public HashSet<Condition> getConditions()
    {
        return conditions;
    }

    public void unTrigger()
    {
        triggered = false;
    }

    public void trigger()
    {
        triggered = true;
    }

    public boolean wasTriggered()
    {
        return triggered;
    }

    public boolean wasExecuted(Command command, Engine eng)
    {
        if(command.equals(com))
        {
            boolean satisfiable = true;
            for (Condition cond : conditions)
                satisfiable = satisfiable && cond.evaluate(eng);
            return satisfiable;
        }
        return false;
    }
}
