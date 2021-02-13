package ru.kuznetsov.test.transport;

import ru.kuznetsov.test.services.Random;

public class Bus extends Transport {
    private int routeTime;

    public Bus() {
        super("Автобус");
    }

    @Override
    protected void generateCharacteristics() {
        this.quantityWheels = Random.randInt(4, 6);
        this.maxSpeed = Random.randInt(60, 180);
        this.routeTime = Random.randInt(30, 420);
    }

    @Override
    public String toString() {
        return super.toString() + "Продолжительность маршрута: " + routeTime + "мин.";
    }
}
