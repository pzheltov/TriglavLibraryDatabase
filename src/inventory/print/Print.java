package inventory.print;

import inventory.Inventory;

public class Print extends Inventory {
    private String author;
    private String genre;


    public Print() {
        this("Unknown author", "Unknown genre");
        setInternalID(1);
        setType(getClass().getSimpleName());
    }

    public Print(String author, String genre) {
        this.author = author;
        this.genre = genre;
        setInternalID(1);
        setType(getClass().getSimpleName());
    }

    public Print(String title, String author, String genre) {
        this(author, genre);
        setTitle(title);
        setInternalID(1);
        setType(getClass().getSimpleName());

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Print{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public StringBuilder returnFinalInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item: ")
                .append(getType())
                .append("\r\n")
                .append("Title: ")
                .append(getTitle())
                .append("\r\n")
                .append("Author: ")
                .append(getAuthor())
                .append("\r\n")
                .append("Genre: ")
                .append(getGenre())
                .append("\r\n");

        return sb;
    }

    @Override
    public StringBuilder returnRawInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getType())
                .append("\r\n")
                .append(getTitle())
                .append("\r\n")
                .append(getAuthor())
                .append("\r\n")
                .append(getGenre())
                .append("\r\n");

        return sb;
    }
}

