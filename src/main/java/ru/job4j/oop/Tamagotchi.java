package ru.job4j.oop;

public class Tamagotchi {

    private int weight = 100;

    public void feed() {
        weight += 10;
    }

    public String info() {
        return "weight: " + weight;
    }

    public static void main(String[] args) {
        /* Тут мы смотрим, то изменение переменной с которой мы берем значение когда она примитив не измен базовой переменной */
        int weight = 100;
        int weightCopy = weight;
        System.out.println("weight " + weight);
        System.out.println("copy of weight " + weightCopy);
        weightCopy += 10;
        System.out.println("weight " + weight);
        System.out.println("copy of weight " + weightCopy);
        System.out.println();

        Tamagotchi pet = new Tamagotchi();
        Tamagotchi petCopy = pet;
        System.out.println(pet.info());
        System.out.println("copy of " + petCopy.info());
        petCopy.feed();
        System.out.println(pet.info());
        System.out.println("copy of " + petCopy.info());
    }
}
