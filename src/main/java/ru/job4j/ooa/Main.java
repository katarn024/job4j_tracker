package ru.job4j.ooa;

public class Main {
    public static void main(String[] args) {
        final User FIRST_USER = new User("Serg", 30);
        System.out.println("Вывод в консоль до изменения.");
        System.out.println(FIRST_USER);

        FIRST_USER.setName("Andrew");
        FIRST_USER.setAge(25);
        System.out.println("Вывод в консоль после изменений.");
        System.out.println(FIRST_USER);
    }
}
