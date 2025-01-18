package ru.job4j.oop;

public class Max {

    public static int max(int one, int second) {
        return one > second ? one : second;
    }

    public static int max(int one, int second, int three) {
        int max12 = max(one, second);
        return max12 > three ? max12 : three;
    }

    public static int max(int one, int second, int three, int four) {
        int max12 = max(one, second);
        int max34 = max(three, four);
        return max12 > max34 ? max12 : max34;
    }
}