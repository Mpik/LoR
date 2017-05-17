package main.java;

public class Track {
    private int speedMax;
    private int mileageFactor;
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public void setSpeedMax(int amount) {
        this.speedMax = amount;
    }

    public int getSpeedMax() {
        return this.speedMax;
    }

    public void setMileageFactor(int amount) {
        this.mileageFactor = amount;
    }

    public int getMileageFactor() {
        return this.mileageFactor;
    }

    public void setLength(int amount) {
        this.length = amount;
    }

    public int getLength() {
        return this.length;
    }
}
