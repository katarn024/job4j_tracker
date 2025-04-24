package ru.job4j.except;

public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Petr";
        for (int index = 0; index < shops.length; index++) {
            String element = shops[index];
            if (element != null) {
                System.out.println(element + " has a size : " + element.length());
            }
        }
        /* Это исключение связано с вызовом методом у переменной, которая проинициализирована null ссылкой.
        Компилятор говорит, что данных в этой переменной нет и эту операцию он выполнить не может.
        В нашем примере исключение падает, так как мы заполнили только первую ячейку в массиве,
        а остальные по умолчанию заполняются null ссылками.*/
    }
}
