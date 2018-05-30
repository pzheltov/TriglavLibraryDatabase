package inventory.print.book;

import inventory.LibraryDatabase;

public class ChildrensLiterature extends Book {
    private boolean pictureBook;
    private boolean fairytale;

    public ChildrensLiterature() {
        this(false, false);
        setInternalID(15);
        setType(getClass().getSimpleName());
    }

    public ChildrensLiterature(boolean pictureBook, boolean fairytale) {
        this.pictureBook = pictureBook;
        this.fairytale = fairytale;
        setInternalID(15);
        setType(getClass().getSimpleName());
    }

    public ChildrensLiterature(String title, String author, String subType, boolean hardCover, int yearPublished, String ddcLocation, boolean pictureBook, boolean fairytale) {
        super(title, author, subType, hardCover, yearPublished, ddcLocation);
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
        return "ChildrensLiterature{" +
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
