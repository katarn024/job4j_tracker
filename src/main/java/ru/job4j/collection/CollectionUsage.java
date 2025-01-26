package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionUsage {
    public static void main(String[] args) {
        /* Добавление элементов в коллекцию */
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        for (String string : collection) {
            System.out.println(string);
        }
        System.out.println();

        /* Добавление коллекции в другую коллекцию */
        Collection<String> list = new ArrayList<>();
        list.addAll(collection);
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println();

        /* Удаление эл-тов из коллекции
        * boolean remove(Object o) – метод удаляет объект, который мы передали в метод, и возвращает true, если удаление успешно, т.е. коллекция изменилась.*/
        collection.remove("two");
        System.out.println("Вывод содержимого коллекции после удаления");
        for (String string : collection) {
            System.out.println(string);
        }
        System.out.println();

        System.out.println("Размер коллекции равен: " + collection.size());
        System.out.println("Коллекция содержит элемент two: " + collection.contains("two"));
        System.out.println("Содержимое в виде массива: " + Arrays.toString(collection.toArray()));
        collection.clear();
        System.out.println("Коллекция после очистки пуста: " + collection.isEmpty());
    }
}
