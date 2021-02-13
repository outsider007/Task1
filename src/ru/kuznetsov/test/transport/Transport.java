package ru.kuznetsov.test.transport;

public abstract class Transport {
    protected String name;
    protected int quantityWheels;
    protected int maxSpeed;

    public Transport(String name) {
        this.name = name;
        generateCharacteristics();
    }

    protected abstract void generateCharacteristics();

    @Override
    public String toString() {
        return "Наименование транспорта: " + name + "\n"
                + "Количество колёс: " + quantityWheels + "\n"
                + "Максимальная скорость: " + maxSpeed + "км/ч\n";
    }
}
