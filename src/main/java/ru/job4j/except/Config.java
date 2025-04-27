package ru.job4j.except;

public class Config {
    public static void load(String path) {
        if (path == null) {
            throw new IllegalStateException("Path could not be null");
        }
        System.out.println("Loading config by " + path);
    }

    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}
