package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;

public class FindByIdAction implements UserAction {
    private final Output output;

    public FindByIdAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод заявки по id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
                /* При проверке найденного объекта на null не стоит использовать конструкцию:
                if (item.equals(null)) {};
                Дело в том, что если объект item будет null-ссылкой, то вызов на этом объекте метода equals приведет
                исключению NullPointerException. Поэтому мы используем конструкцию:
                if (item != null) {
                которая будет работать корректно и не приведет к остановке нашего приложения */
        if (item != null) {
            output.println("Item{id=" + item.getId() + ", name=" + item.getName() + "}");
        } else {
            output.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
