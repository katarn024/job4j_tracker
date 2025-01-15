package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
        //Сделаем дефолтный конструктор в явном виде и сделаем там начальные значения
        multiMonitor = true;
        ssd = 600;
        cpu = "Inter Core I7-10700K";
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printInfo();
    }
}
