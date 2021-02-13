package ru.kuznetsov.test.transport;

import ru.kuznetsov.test.services.Random;

public class Car extends Transport {
    private int quantityPassengerSeats;

    public Car() {
        super("Автомобиль");
    }

    @Override
    protected void generateCharacteristics() {
        this.quantityWheels = Random.randInt(4, 6);
        this.maxSpeed = Random.randInt(60, 360);
        this.quantityPassengerSeats = Random.randInt(1, 6);
    }

    @Override
    public String toString() {
        return super.toString() + "Количество пассажирских мест: " + quantityPassengerSeats + "\n";
    }
}
