package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        /* [тип переменной] имя объекта = new [Объект какого класса]
        * Во время компиляции статические методы связаны с типом объявленной переменной,
        * то есть какой класс объявлен в типе, статический метод того класса и будет вызван.
        * */
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
        System.out.println();

        animal.staticInvoke();
        cat.staticInvoke();
        Animal other = null;
        other.staticInvoke();
        Cat kitty = new Cat();
        kitty.staticInvoke();
    }
}
