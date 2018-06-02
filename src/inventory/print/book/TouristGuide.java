package inventory.print.book;

import inventory.LibraryDatabase;

public class TouristGuide extends Book {
    private String region;
    private boolean hikingTrails;

    public TouristGuide() {
        this("Unknown region", false);
        setInternalID(7);
        setType(getClass().getSimpleName());
    }

    public TouristGuide(String region, boolean hikingTrails) {
        this.region = region;
        this.hikingTrails = hikingTrails;
        setInternalID(7);
        setType(getClass().getSimpleName());
    }

    public TouristGuide(String title, String author, String genre, boolean hardCover, int yearPublished, String region, boolean hikingTrails) {
        super(title, author, genre, hardCover, yearPublished);
        this.region = region;
        this.hikingTrails = hikingTrails;
        setInternalID(7);
        setType(getClass().getSimpleName());

        LibraryDatabase.addTouristGuide(this);
        LibraryDatabase.addInventory(this);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isHikingTrails() {
        return hikingTrails;
    }

    public void setHikingTrails(boolean hikingTrails) {
        this.hikingTrails = hikingTrails;
    }

    @Override
    public String toString() {
        return "TouristGuide{" +
                "region='" + region + '\'' +
                ", hikingTrails=" + hikingTrails +
                '}';
    }

    @Override
    public StringBuilder returnFinalInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnFinalInfo())
                .append("Region: ")
                .append(getRegion())
                .append("\r\n")
                .append("Hiking trails: ")
                .append(isHikingTrails())
                .append("\r\n");

        return sb;
    }

    @Override
    public StringBuilder returnRawInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.returnRawInfo())
                .append(getRegion())
                .append("\r\n")
                .append(isHikingTrails())
                .append("\r\n");

        return sb;
    }
}
