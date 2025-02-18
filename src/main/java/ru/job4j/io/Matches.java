package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3, но не более оставшегося количества спичек:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches >= 1 && matches <= (Math.min(count, 3))) {
                count -= matches;
            } else {
                System.out.println("Число не входит в диапазон, пожалуйста введите число от 1 до " + (count <= 3 ? count : "3"));
            }
            System.out.println("На столе осталось " + count + " спичек");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
