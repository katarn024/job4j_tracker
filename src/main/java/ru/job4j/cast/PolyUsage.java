package ru.job4j.cast;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle autobus = new Autobus();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicle = new Vehicle[]{train, autobus, airplane};
        for (Vehicle object : vehicle) {
            object.move();
            object.openDoor();
        }
    }
}
