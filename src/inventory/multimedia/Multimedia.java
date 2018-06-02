package inventory.multimedia;

import inventory.Inventory;

public class Multimedia extends Inventory {
    private String publisher;

    public Multimedia() {
        this("Unknown title", "Unknown publisher");
        setInternalID(2);
        setType(getClass().getSimpleName());
    }

    public Multimedia (String publisher) {
        this.publisher = publisher;
        setInternalID(2);
        setType(getClass().getSimpleName());
    }

    public Multimedia(String title, String publisher) {
        this(publisher);
        setTitle(title);
        setInternalID(2);
        setType(getClass().getSimpleName());

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "publisher='" + publisher + '\'' +
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
                .append("Publisher: ")
                .append(getPublisher())
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
                .append(getPublisher())
                .append("\r\n");

        return sb;
    }
}
