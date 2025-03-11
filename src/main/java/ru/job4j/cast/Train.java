package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд перемещается по рельсам");
    }

    @Override
    public void openDoor() {
        System.out.println("Двери поезда открываются");
    }
}
