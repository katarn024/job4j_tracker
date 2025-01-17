package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return x - y;
    }

    public double devide(int y) {
        return y / x;
    }

    public double sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + devide(y);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        result = minus(5);
        System.out.println(result);
        
        // далее идут не статические методы
        Calculator calculator = new Calculator();

        result = calculator.multiply(5);
        System.out.println(result);

        double res = calculator.multiply(5);
        System.out.println(res);
        res = calculator.devide(5);
        System.out.println(res);
        res = calculator.sumAllOperation(5);
        System.out.println(res);
    }
}
