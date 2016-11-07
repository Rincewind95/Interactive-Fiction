package standard.engine;

/**
 * Created by Milos on 06/11/2016.
 */
public class Item
{
    private String item_id;   // the unique identifier of the item used to refer to it
    private boolean takeable; // true if the item can be taken from its respective room (if the item is not fixed in place)
    private String location;  // the location of the item (room_id, inv of null (if the item has not yet been produced))

    private String description; // items short description
}
