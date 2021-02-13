package ru.kuznetsov.test.services;

import ru.kuznetsov.test.transport.*;

public class TransportFactory {
    public static Transport getInstance(int transportId) {
        Transport transport;

        switch (transportId) {
            case 0:
                transport = new Motorcycle();
                break;
            case 1:
                transport = new Scooter();
                break;
            case 2:
                transport = new Car();
                break;
            case 3:
                transport = new Bus();
                break;
            default:
                transport = null;
        }

        return transport;
    }
}
