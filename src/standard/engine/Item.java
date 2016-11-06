package standard.engine;

/**
 * Created by Milos on 06/11/2016.
 */
public class Item extends Argument
{
    private boolean takeable; // true if the item can be taken from its respective room (if the item is not fixed in place)
    private boolean in_game;  // true if the item is currently in the game (has been produced, or has not been removed)

    private Message description; // items short description
}
