package ru.kuznetsov.test.services;

public class Random {
    public static int randInt(int min, int max) {
        max -= min;
        return (int)(Math.random() * ++max) + min;
    }
}
