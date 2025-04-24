package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
    /* Метод execute возвращает boolean переменная.
    Это нужно, чтобы создать действия выхода из программы.
    Если действие вернуло false, то мы считаем, что пользователь вышел из системы.  */

}
