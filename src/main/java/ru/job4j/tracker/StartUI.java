package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Выбрать: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select != 6) {
                System.out.println("пользователь выбрал: " + select);
            } else {
                run = false;
            }
        }
    }

    private static void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени",
                "Завершить программу"};

        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        /* Item item = new Item(1, "Test");
        System.out.println(item);*/
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        /* Мы создаем объект класса StartUI и сразу на этом объекте вызываем метод init().
         * Поскольку дальше этот объект мы не будем переиспользовать, то мы не записываем созданный объект в переменную.  */
        new StartUI().init(scanner, tracker);
    }
}