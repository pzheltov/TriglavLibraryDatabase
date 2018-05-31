/*
This class is temporary.

>> It contains objects that help me with building the program without having to rely on import - export.
 */

package inventory;

import inventory.multimedia.audio.Podcast;
import inventory.multimedia.video.Movie;
import inventory.print.book.Novel;

import java.util.ArrayList;

public class FalseDatabaseStarter {

    private static ArrayList<Inventory> libraryInventory = new ArrayList<>();

    public static void startDatabase() {

        Movie m1 = new Movie("Full Metal Jacket", "Tristar Colombia", "War Film", "Stanley Kubrick", "Not Stanley", 7.7, true);
        Novel n1 = new Novel("Things Fall Apart", "Chinua Achebe", "Fiction", true, 1995, "DC.51C3", "English");
        Podcast p1 = new Podcast("Escape Pod", "Daikaiju", "Science Fiction", "MP3", false, false);
    }
}
