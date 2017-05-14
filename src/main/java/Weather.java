package main.java;

import java.util.concurrent.ThreadLocalRandom;

public class Weather {
    String type;
    int trackLength;
    int speedMax;
    int mileageFactor;

    public Weather() {
        // random int zwischen 1 und 10
        int rand = ThreadLocalRandom.current().nextInt(1, 11);

        // 1-4: regen
        // 5-8: schnee
        // 9-10: sonne
        if (rand <= 4) {
            this.setRegen();
        } else if (rand >= 9) {
            this.setSonne();
        } else {
            this.setSchnee();
        }

    }

    public final void setSonne() {
        this.type = "Sonne";
        this.trackLength = ThreadLocalRandom.current().nextInt(1000, 1501);
        this.speedMax = 200;
        this.mileageFactor = 2;
    }

    public final void setRegen() {
        this.type = "Regen";
        this.trackLength = ThreadLocalRandom.current().nextInt(1000, 1801);
        this.speedMax = 150;
        this.mileageFactor = 1;
    }

    public final void setSchnee() {
        this.type = "Schnee";
        this.trackLength = ThreadLocalRandom.current().nextInt(1500, 2001);
        this.speedMax = 70;
        this.mileageFactor = 4;
    }
}
