package ru.job4j.tasks.folder_1_1_7;

public class Task1 {
    public static void isPalindrome(int number) {
        String str = String.valueOf(number);
        int count = 0;
        for (int index = 0; index < str.length() / 2; index++) {
            if (str.charAt(index) == str.charAt(str.length() - index - 1)) {
                count++;
            }
        }
        if (count == str.length() / 2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
