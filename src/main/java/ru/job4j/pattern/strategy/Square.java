package ru.job4j.pattern.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "  ____ " + ln
                + " |    |" + ln
                + " |____|" + ln;
    }
}