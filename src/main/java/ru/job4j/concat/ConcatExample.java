package ru.job4j.concat;

public class ConcatExample {
    public static void main(String[] args) {
        /*Еще один способ объединять строки. Удобно пользоваться, если у нас уже есть готовые строки,
        которые мы просто хотим объединить и получит результат.
        Метод concat() класса String возвращает объект String. Метод concat() можно
        объединять в цепочку, в результате работы которой будет возвращена новая строка без накладных
        расходов в виде создания промежуточных строк.*/
        String string2 = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(string2);
    }
}
