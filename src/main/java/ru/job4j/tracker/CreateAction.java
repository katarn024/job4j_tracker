package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "Добавь новую заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        /* мы просто берем содержимое метода createItem из StartUI */
        System.out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
        return true;    // Здесь просто показываем, выходи ли это из программы
    }
}
