package main.java;

public class Car {
    private int speed = 0;
    private int fuel = 100;
    private int speedMax = 200;

    public Car(int speedMax) {
        this.speedMax = speedMax;
    }

    public void increaseSpeed(int amount) {
        this.speed += amount;
        if (this.speed > this.speedMax) {
            this.speed = this.speedMax;
        }
    }

    public void decreaseSpeed(int amount) {
        this.speed -= amount;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public void setFuel(int amount) {
        this.fuel = amount;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void setSpeed(int amount) {
        this.speed = amount;
    }

    public int getSpeed() {
        return this.speed;
    }
}
