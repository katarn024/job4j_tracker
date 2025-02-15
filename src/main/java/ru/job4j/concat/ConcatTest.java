package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        /*
        Вариант без использования StringBilder
        String string = "Job4j";
        for (int index = 0; index < 9999; index++) {
            string = string + index;
        }
        */
        StringBuilder string = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            string.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}
