package standard.engine;

/**
 * Created by Milos on 06/11/2016.
 */
public class Direction extends Argument
{
    private Compass dir;

    public Direction(Compass facing)
    {
        dir = facing;
    }

    public Compass getDir()
    {
        return dir;
    }

    public static enum Compass
    {
        N, E, S, W
    }
}
