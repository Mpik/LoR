package main.java;

public class Player {
    private String name;
    private boolean isReady = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setIsReady(boolean ready) {
        this.isReady = ready;
    }

    public boolean getIsReady() {
        return this.isReady;
    }
}
