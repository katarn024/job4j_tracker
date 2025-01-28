package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        /* Тут мы указываем обобщением, что в коллекцию добавляются эл-ты только указанного типа */
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        names.set(0, "Iven");
        names.remove(0);
        for (int index = 0; index < names.size(); index++) {
            Object value = names.get(index);
            System.out.println(value);
        }
        System.out.println();
        /* с помощью ForEach удобнее перебирать коллекции */
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
