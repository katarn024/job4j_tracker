package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item implements Comparable<Item> {
    private LocalDateTime created = LocalDateTime.now();
    private int id;
    private String name;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created.format(FORMATTER)
                + '}';
    }

    @Override
    public int compareTo(Item another) {
        return Integer.compare(id, another.id);
    }
}