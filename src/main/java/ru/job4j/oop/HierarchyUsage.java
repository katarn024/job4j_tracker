package ru.job4j.oop;

public class HierarchyUsage {
    /* Здесь мы будем смотреть работу приведения типов */
    public static void main(String[] args) {
        /* создаем объекта класса Track. */
        Ship ship = new Ship();
        /* делаем приведение к типу родителя Transport. */
        Transport transport = ship;
        /* делаем приведение к типу родителя Object. */
        Object object = ship;
        /* Приведение типа при создании объекта. */
        Object objectShip = new Ship();
        /* Приведение типа за счет понижения по иерархии. */
        Ship shipFromObject = (Ship) objectShip;

        /* Ошибка в приведении типа. */
        Object bicycle = new Bicycle();
        //Ship shipBicycle = (Ship) bicycle; // код завершится с ошибкой приведения типов ClassCastException

        System.out.println(new Ship());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
