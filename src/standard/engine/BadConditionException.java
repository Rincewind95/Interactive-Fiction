package standard.engine;

/**
 * Thrown when the condition is bad (as form of help to the creator)
 */
public class BadConditionException extends Exception
{
    public BadConditionException(String message)
    {
        super(message);
    }
}
