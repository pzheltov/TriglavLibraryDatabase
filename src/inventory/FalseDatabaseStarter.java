/*
This class is temporary.

>> It contains objects that help me with building the program without having to rely on import - export.
 */

package inventory;

import inventory.multimedia.video.Movie;
import inventory.print.periodical.Comics;

import java.util.ArrayList;

public class FalseDatabaseStarter {

    private static ArrayList<Inventory> libraryInventory = new ArrayList<>();

    public static void startDatabase() {

        Movie movie1 = new Movie("Apocalypse Now", "20th Century Fox", "Stanley Kubrick", "Joe Pesci", 7.3, true);
        Movie movie2 = new Movie("Full Metal Jacket", "Tristar Columbia", "Michael Bay", "Lindsey Ellis", 2.1, true);
        Movie movie3 = new Movie("The Godfather", "Tristar Columbia", "Michael Bay", "Lindsey Ellis", 2.1, true);
        Movie movie4 = new Movie("The Shawshank Redemption", "Tristar Columbia", "Michael Bay", "Lindsey Ellis", 2.1, true);
        Movie movie5 = new Movie("Batman Begins", "Tristar Columbia", "Michael Bay", "Lindsey Ellis", 2.1, true);
        Movie movie6 = new Movie("The Shape of Water", "Tristar Columbia", "Guillermo del Toro", "Lindsey Ellis", 6.1, true);
        Movie movie7 = new Movie("Good Morning Vietnam", "Tristar Columbia", "Michael Bay", "Lindsey Ellis", 2.1, true);
        Movie movie8 = new Movie("Platoon", "Tristar Columbia", "Michael Bay", "Lindsey Ellis", 2.1, true);

        Comics comic1 = new Comics("V for Vendetta", "Miller", "Dystopia", 1, false, true);

    }
}
