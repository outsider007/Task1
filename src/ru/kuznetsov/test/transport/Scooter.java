package ru.kuznetsov.test.transport;

import ru.kuznetsov.test.services.Random;

public class Scooter extends Transport {
    public Scooter() {
        super("Самокат");
    }

    @Override
    protected void generateCharacteristics() {
        this.quantityWheels = Random.randInt(2, 4);
        this.maxSpeed = Random.randInt(5, 20);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
