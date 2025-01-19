package ru.job4j;

import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите не четное число от 3 и более: ");
            num = in.nextInt();
        } while (num % 2 == 0 || num < 3);
        Random random = new Random();
        int[][] array = new int[num][num];
        int minDiagonal = 99;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(0, 99);
                System.out.print(array[i][j] + " ");
                if (i == num - j - 1 && i != j && minDiagonal > array[i][j]) {
                    minDiagonal = array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(minDiagonal);
    }
}