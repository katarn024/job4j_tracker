package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            System.out.print("Выбрать: ");
            int select = input.askInt("Enter id: ");
            UserAction action = actions[select];
            System.out.println("пользователь выбрал: " + select);
            run = action.execute(input, tracker);
            }
    }

    private static void showMenu(UserAction[] actions) {
        System.out.println("Меню:");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
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
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}