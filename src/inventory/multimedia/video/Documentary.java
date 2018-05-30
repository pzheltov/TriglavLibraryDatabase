package inventory.multimedia.video;

import inventory.LibraryDatabase;

public class Documentary extends Video {
    private boolean color;
    private int topic;

    public Documentary() {
        this(false, 4);
        setInternalID(12);
        setType(getClass().getSimpleName());
    }

    public Documentary(boolean color, int topic) {
        this.color = color;
        this.topic = topic;
        setInternalID(12);
        setType(getClass().getSimpleName());
    }

    public Documentary(String title, String publisher, String subDefine, String director, String screenwriter, boolean color, int topic) {
        super(title, publisher, subDefine, director, screenwriter);
        this.color = color;
        this.topic = topic;
        setInternalID(12);
        setType(getClass().getSimpleName());

        LibraryDatabase.addDocumentary(this);
        LibraryDatabase.addInventory(this);
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public int getTopic() {
        return topic;
    }

    public void setTopic(int topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Documentary{" +
                "color=" + color +
                ", topic=" + topic +
                '}';
    }

    @Override
    public StringBuilder returnFinalInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.returnFinalInfo())
                .append("Multicolor: ")
                .append(isColor())
                .append("\r\n")
                .append("Topic: ")
                .append(getTopic())
                .append("\r\n");

        return sb;
    }

    @Override
    public StringBuilder returnRawInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.returnRawInfo())
                .append(isColor())
                .append("\r\n")
                .append(getTopic())
                .append("\r\n");

        return sb;
    }
}
