package inventory.print.book;

import inventory.LibraryDatabase;

public class ChildrensLit extends Book {
    private boolean pictureBook;
    private boolean fairytale;

    public ChildrensLit() {
        this(false, false);
        setInternalID(15);
        setType(getClass().getSimpleName());
    }

    public ChildrensLit(boolean pictureBook, boolean fairytale) {
        this.pictureBook = pictureBook;
        this.fairytale = fairytale;
        setInternalID(15);
        setType(getClass().getSimpleName());
    }

    public ChildrensLit(String title, String author, String genre, boolean hardCover, int yearPublished, boolean pictureBook, boolean fairytale) {
        super(title, author, genre, hardCover, yearPublished);
        this.pictureBook = pictureBook;
        this.fairytale = fairytale;
        setInternalID(15);
        setType(getClass().getSimpleName());

        LibraryDatabase.addChildrensBook(this);
        LibraryDatabase.addInventory(this);
    }

    public boolean isPictureBook() {
        return pictureBook;
    }

    public void setPictureBook(boolean pictureBook) {
        this.pictureBook = pictureBook;
    }

    public boolean isFairytale() {
        return fairytale;
    }

    public void setFairytale(boolean fairytale) {
        this.fairytale = fairytale;
    }

    @Override
    public String toString() {
        return "ChildrensLit{" +
                "pictureBook=" + pictureBook +
                ", fairytale=" + fairytale +
                '}';
    }

    @Override
    public StringBuilder returnFinalInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnFinalInfo())
                .append("Picture book: ")
                .append(isPictureBook())
                .append("\r\n")
                .append("Fairytale: ")
                .append(isFairytale())
                .append("\r\n");

        return sb;
    }

    @Override
    public StringBuilder returnRawInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnRawInfo())
                .append(isPictureBook())
                .append("\r\n")
                .append(isFairytale())
                .append("\r\n");

        return sb;
    }
}
