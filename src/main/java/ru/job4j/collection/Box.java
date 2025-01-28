package ru.job4j.collection;

public class Box {

    public static void num(Integer x) {
        System.out.println("Значение типа Integer: " + x);
    }

    /* Здесь видно, что когда есть выбор то выбирается тот метод где отсутствует автоупаковка */
    public static void num(int x) {
        System.out.println("Значение типа Integer: " + x);
    }

    public static void main(String[] args) {
        /* Автоупаковка int в Integer */
        System.out.println("Автоупаковка int в Integer");
        int x = 2;
        /* b = Integer.valueOf(a); */
        num(x);
        int a = 1;
        Integer b;
        b = a;
        System.out.println("Integer b = " + b);
        System.out.println();

        /* Автораспаковка Integer в int */
        System.out.println("Автораспаковка Integer в int");
        Integer m = 3;
        int n = m;
        /* под капотом: int n = m.intValue(); */
        System.out.println("int n = " + n);
        System.out.println();

        Integer g = 250;
        Integer h = 250;
        System.out.println(g == h);

        /* Исключением являются только кэшированные значения из пула Integer от -128 до 127 включительно */
        Integer v = 127;
        Integer w = 127;
        System.out.println(v == w);
    }
}
