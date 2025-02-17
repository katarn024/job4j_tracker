package ru.job4j.polymorphism;

public class MemoryStore {
    private String[] memoryStore = new String[100];
    private int size = 0;

    public void save(String data) {
        memoryStore[size++] = data;
    }

    public String read() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(memoryStore[i]);
        }
        return builder.toString();
    }
}
