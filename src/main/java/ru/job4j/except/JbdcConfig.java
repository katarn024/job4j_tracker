package ru.job4j.except;

public class JbdcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
        /* load jdbc */
    }

    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
            /* Этот оператор выведет на консоль стек вызовов методов от начала программы до оператора,
             * который вызвал прерывания */
        }
    }
}
