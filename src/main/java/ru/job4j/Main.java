package ru.job4j;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void sort(int[] array) {
        int current = 0;
        int time;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[current] > array[j]) {
                    current = j;
                }
            }
            time = array[i];
            array[i] = array[current];
            array[current] = time;
            current = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(array));
        sort(array);
    }
}