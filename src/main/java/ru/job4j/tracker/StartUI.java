package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(1, "Test");
        System.out.println(item.getDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
    }
}
