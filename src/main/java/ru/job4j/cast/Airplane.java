package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит в небе");
    }

    @Override
    public void openDoor() {
        System.out.println("Дверь самолета открываются");
    }
}