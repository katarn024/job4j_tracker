package ru.job4j.oop;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public class Transmission {
        public void accelerate() {
            System.out.println("Ускорение");
        }
    }

    public class Brakes {
        public void brake() {
            System.out.println("Торможение");
        }
    }

    public class TripComputer {

        public String tripData = "Бортовой компьютер";
        private String model = "Модель TripComputer";

        public void getInfo() {
            System.out.println("Марка: " + brand);
            /* Здесь можно написать просто model, либо this.model. Здесь мы обращаемся к переменной model класса TripComputer */
            System.out.println("Модель TripComputer: " + this.model);
            /* Чтобы обратиться к переменной, которая находится во внешнем классе, нужно обращаться через имя внешнего класса и точку */
            System.out.println("Модель Car: " + Car.this.model);
        }
    }

    public static TripComputer getTripComputer() {
        Car car = new Car("Марка", "Модель");
        Car.TripComputer tripComputer = car.new TripComputer();
        return tripComputer;
    }
}