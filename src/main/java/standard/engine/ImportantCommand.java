package standard.engine;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.HashSet;

/**
 * Created by Milos on 02/02/2017.
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
