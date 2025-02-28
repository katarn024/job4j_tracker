package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус куда-то едет");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе " + count + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        int costFuel = 50;
        System.out.println("Автобус заправляется");
        return fuel * costFuel;
    }
}
