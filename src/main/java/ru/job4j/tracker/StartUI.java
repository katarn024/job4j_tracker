package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Выбрать: ");
            int select = input.askInt("Enter id: ");
            System.out.println("пользователь выбрал: " + select);
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 5) {
                findItemByName(input, tracker);
            } else if (select == 6) {
                System.out.println("Завершаю программу");
                run = false;
            }
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявок по имени ===");
        System.out.print("Введите имя: ");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== вывод заявки по id ===");
        System.out.print("ВВведите id: ");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
                /* При проверке найденного объекта на null не стоит использовать конструкцию:
                if (item.equals(null)) {};
                Дело в том, что если объект item будет null-ссылкой, то вызов на этом объекте метода equals приведет
                исключению NullPointerException. Поэтому мы используем конструкцию:
                if (item != null) {
                которая будет работать корректно и не приведет к остановке нашего приложения */
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        System.out.print("Введите id: ");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        tracker.delete(id);
        System.out.println(item != null ? "Заявка удалена успешно" : "Ошибка удаления заявки");
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Редактирование заявки ===");
        System.out.print("Введите id: ");
        int id = input.askInt("Enter id: ");
        System.out.print("Введите имя: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка заменена успешно");
        } else {
            System.out.println("Ошибка замены заявки");
        }
    }

    public static void findAllItems(Tracker tracker) {
        System.out.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        System.out.print("Пожалуйста, введите имя: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    private static void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки",
                "Изменить заявку", "Удалить заявку", "Показать заявку по id",
                "Показать заявки по имени", "Завершить программу"};

        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        /* Item item = new Item(1, "Test");
        System.out.println(item);*/
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        /* Мы создаем объект класса StartUI и сразу на этом объекте вызываем метод init().
         * Поскольку дальше этот объект мы не будем переиспользовать, то мы не записываем созданный объект в переменную.  */
        /*Вызов не статического метода. Необходимо обратиться через объект. */
        new StartUI().init(input, tracker);
        /* Вызов статического метода. Обращаемся через класс. */
        StartUI.createItem(input, tracker);
    }
}