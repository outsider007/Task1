package ru.kuznetsov.test;

import ru.kuznetsov.test.services.TransportFactory;
import ru.kuznetsov.test.transport.Transport;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        for(String type : args) {
            if (!isValidType(type)) {
                System.out.println("\nНЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
                continue;
            }

            Transport transport = TransportFactory.getInstance(Integer.parseInt(type));

            if (transport != null){
                System.out.println(TransportFactory.getInstance(Integer.parseInt(type)));
            } else {
                System.out.println("\nНЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
            }
        }
    }

    public static boolean isValidType(String type) {
        Pattern pattern = Pattern.compile("^(\\d){1,9}$");
        Matcher matcher = pattern.matcher(type);

        return matcher.find();
    }
}
