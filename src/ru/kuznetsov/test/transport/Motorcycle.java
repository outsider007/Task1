package ru.kuznetsov.test.transport;

import ru.kuznetsov.test.services.Random;

public class Motorcycle extends Transport {

    public Motorcycle() {
        super("Мотоцикл");
    }

    @Override
    protected void generateCharacteristics() {
        this.quantityWheels = Random.randInt(2, 3);
        this.maxSpeed = Random.randInt(80, 360);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
