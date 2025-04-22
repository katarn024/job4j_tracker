package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
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
        return true;
    }
}
