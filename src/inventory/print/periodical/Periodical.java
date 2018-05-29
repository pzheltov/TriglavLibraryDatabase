package inventory.print.periodical;

import inventory.LibraryDatabase;
import inventory.LibraryIO;
import inventory.print.Print;

public class Periodical extends Print implements LibraryIO {
    private int publicationFrequency;

    public Periodical() {
        this(0);
        setInternalID(5);
        setType(getClass().getSimpleName());
    }

    public Periodical(int publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
        setInternalID(5);
        setType(getClass().getSimpleName());
    }

    public Periodical(String title, String author, String genre, int publicationFrequency) {
        super(title, author, genre);
        this.publicationFrequency = publicationFrequency;
        setInternalID(5);
        setType(getClass().getSimpleName());

        LibraryDatabase.addPeriodical(this);
        LibraryDatabase.addInventory(this);
    }

    public int getPublicationFrequency() {
        return publicationFrequency;
    }

    public void setPublicationFrequency(int publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    @Override
    public String toString() {
        return "Periodical{" +
                "publicationFrequency=" + publicationFrequency +
                '}';
    }

    @Override
    public StringBuilder returnFinalInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnFinalInfo())
                .append("Publication frequency: ")
                .append(getPublicationFrequency())
                .append("\r\n");

        return sb;
    }

    @Override
    public StringBuilder returnRawInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnRawInfo())
                .append(getPublicationFrequency())
                .append("\r\n");

        return sb;
    }
}
