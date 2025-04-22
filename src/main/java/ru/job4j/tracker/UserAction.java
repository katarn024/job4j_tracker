package ru.job4j.tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
    /* Метод execute возвращает boolean переменная.
    Это нужно, чтобы создать действия выхода из программы.
    Если действие вернуло false, то мы считаем, что пользователь вышел из системы.  */

}
