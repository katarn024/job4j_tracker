package ru.job4j.collection;

import java.util.ArrayList;

public class Base {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Pavel");     //Добавление в коллекцию
        names.add("Alex");
        names.add("Sasha");
        names.set(0, "Artem");  // Замена в коллекцию
        names.remove(0);  // Удаление из коллекции
        //Чтение данных
        for (int index = 0; index < names.size(); index++) {
            Object value = names.get(index);
            System.out.println(value);
        };
        System.out.println();
        for (Object value : names) {    //Данных вариант предпочтительно использовать для коллекций и массивов
            System.out.println(value);
        };
    }
}
