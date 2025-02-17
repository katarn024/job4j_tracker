package ru.job4j.polymorphism;

import java.io.File;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Petya");
    }

    public static void main(String[] args) {
        FileStore store = new FileStore();
        /*MemoryStore store = new MemoryStore();*/
        Service service = new Service(store);
        service.add();
    }
}
