package ru.job4j.cast;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус едет по дороге");
    }

    @Override
    public void openDoor() {
        System.out.println("Двери автобуса открываются");
    }
}