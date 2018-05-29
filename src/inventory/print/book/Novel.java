package inventory.print.book;

import inventory.LibraryDatabase;

public class Novel extends Book {
    private String numberDDC;
    private String language;

    public Novel() {
        this("Unknown DDC", "Unknown language");
        setInternalID(11);
        setType(getClass().getSimpleName());
    }

    public Novel(String numberDDC, String language) {
        this.numberDDC = numberDDC;
        this.language = language;
        setInternalID(11);
        setType(getClass().getSimpleName());
    }

    public Novel(String title, String author, String genre, boolean hardCover, int yearPublished, String numberDDC, String language) {
        super(title, author, genre, hardCover, yearPublished);
        this.numberDDC = numberDDC;
        this.language = language;
        setInternalID(11);
        setType(getClass().getSimpleName());

        LibraryDatabase.addNovel(this);
        LibraryDatabase.addInventory(this);
    }

    public String getNumberDDC() {
        return numberDDC;
    }

    public void setNumberDDC(String numberDDC) {
        this.numberDDC = numberDDC;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "numberDDC='" + numberDDC + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    @Override
    public StringBuilder returnFinalInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnFinalInfo())
                .append("DDC Number: ")
                .append(getNumberDDC())
                .append("\r\n")
                .append("Language: ")
                .append(getLanguage())
                .append("\r\n");

        return sb;
    }

    @Override
    public StringBuilder returnRawInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnRawInfo())
                .append(getNumberDDC())
                .append("\r\n")
                .append(getLanguage())
                .append("\r\n");

        return sb;
    }
}
