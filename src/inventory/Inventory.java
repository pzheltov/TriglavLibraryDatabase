package inventory;

public abstract class Inventory {

    private int internalID;
    private String type;
    private String title;
    private String availability;

    public Inventory() {
        this(0, Inventory.class.getName(), "Unknown Title", "Available");
    }

    public Inventory(int internalID, String type, String title, String availability) {
        this.internalID = internalID;
        this.type = type;
        this.title = title;
        this.availability = availability;

    }

    public int getInternalID() {
        return internalID;
    }

    public void setInternalID(int internalID) {
        this.internalID = internalID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public abstract StringBuilder returnFinalInfo();
    public abstract StringBuilder returnRawInfo();
}
