package ru.job4j.concat;

public class JoinExample {
    public static void main(String[] args) {
        /*Когда нам нужно объединить 2 и более строки с каким-либо разделителем, например,
        пробелом, то можно использовать метод join() класса String.*/
        String string3 = String.join(" ", "abc", "def", "ghi");
        System.out.println(string3);
    }
}
