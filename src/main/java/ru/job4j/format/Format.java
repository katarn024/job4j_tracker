package ru.job4j.format;

import java.util.Calendar;

public class Format {

    public static void getGreeting(String name, int age) {
        /*
        * %s - строковое представление аргумента
        * %d - форматирование целое число
        * %b - Любой переданный аргумент будет превращён в true, если же передан null, то false
        * %c - Задаёт любой символ из таблицы Юникод
        * %n - Задает разделитель строк
        * %t - Преобразует дату и время. Применяется только с дополнительными флагами
        * %f - Задаёт число с плавающей точкой.
        * */
        System.out.println(String.format("Привет! Я %s, мой возраст: %d", name, age));
        System.out.println(String.format("Аргумент передан? %b", 55));
        System.out.println(String.format("Jo%c4j", 'b'));
        System.out.format("Строка1%nСтрока2");
        System.out.println();
        System.out.println(String.format("Задаем число 0.99 - %f", 0.99));
    }

    public static  void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT", name, instance, instance));
    }

    public static void main(String[] args) {
        getGreeting("Ира", 30);
        getGreetingAndTime("Ира");
        /* %[индекс_аргумента$][флаг(и)][ширина][.точность]спецификатор
        *- С помощью индекса аргумента можно указать позицию в списке аргументов (в виде целого числа)
        * - Флаги - это отдельные символы для изменения результата форматирования
        * - Ширина определяет количество выводимых символов
        * */
        System.out.println(String.format("%1$,+016.2f", 5000000.0000));
    }
}
