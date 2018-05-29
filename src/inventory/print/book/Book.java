package inventory.print.book;

import inventory.LibraryDatabase;
import inventory.print.Print;

public class Book extends Print {
    private boolean hardCover;
    private int yearPublished;

    public Book() {
        this(false, 1991);
        setInternalID(3);
        setType(getClass().getSimpleName());
    }

    public Book(boolean hardCover, int yearPublished) {
        this.hardCover = hardCover;
        this.yearPublished = yearPublished;
        setInternalID(3);
        setType(getClass().getSimpleName());
    }

    public Book(String title, String author, String genre, boolean hardCover, int yearPublished) {
        super(title, author, genre);
        this.hardCover = hardCover;
        this.yearPublished = yearPublished;
        setInternalID(3);
        setType(getClass().getSimpleName());

        LibraryDatabase.addBook(this);
        LibraryDatabase.addInventory(this);
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "hardCover=" + hardCover +
                ", yearPublished=" + yearPublished +
                '}';
    }

    @Override
    public StringBuilder returnFinalInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnFinalInfo())
                .append("Hard cover: ")
                .append(isHardCover())
                .append("\r\n")
                .append("Year Published: ")
                .append(getYearPublished())
                .append("\r\n");

        return sb;
    }

    @Override
    public StringBuilder returnRawInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnRawInfo())
                .append(isHardCover())
                .append("\r\n")
                .append(getYearPublished())
                .append("\r\n");

        return sb;
    }


}
