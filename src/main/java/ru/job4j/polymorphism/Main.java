package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {

        /* переменная типа Vehicle хранит ссылку на объект TownCar */
        /*Vehicle townCar = new TownCar();
        townCar.changeGear();
        townCar.accelerate();
        townCar.steer();
        townCar.brake();
        System.out.println();*/

        /* переменная типа Vehicle хранит ссылку на объект SportCar */
        /*Vehicle sportCar = new SportCar();
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();*/

        /* когда класс реализует более одного интерфейса, которые не связаны между собой
        родственными связями, то нужно сначала объявить прямую реализацию класса, и уже ей
        проинициализировать объекты типов интерфейсов, которые мы будем использовать */
        /*SportCar sportCar = new SportCar();
        Vehicle vehicle = sportCar;
        Fuel fuel = sportCar;
        vehicle.changeGear();
        vehicle.accelerate();
        vehicle.steer();
        vehicle.brake();
        fuel.refill();*/

        /* В случае подобного наследования интерфейсов мы теперь можем в методе main() объявить
         объект sportCar как тип всеобъемлющего интерфейса, то есть Vehicle, так как Vehicle
         наследует методы Fuel, а также определяет свои методы */
        Vehicle sportCar = new SportCar();
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        sportCar.refill();
        Vehicle.getDragCoefficient();
    }
}
