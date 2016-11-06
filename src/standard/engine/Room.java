package standard.engine;

import java.util.ArrayList;

/**
 * Created by Milos on 06/11/2016.
 */
public class Room
{
    private String room_id;    // the unique name of the room
    private String level_id;   // the unique name of the level the room is located on
    private String[] leads_to; // the room_ids that can be accessed from the N,E,S,W passages of the room (can be empty string meaning closed passage)

    private String brief;       // message printed upon first entry to the room
    private String description; // short description printed upon consequent entries

    private ArrayList<Item> items; // list of all items currently contained in the room
}
