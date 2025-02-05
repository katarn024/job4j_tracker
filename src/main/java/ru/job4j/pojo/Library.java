package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 400);
        Book tudaIObratno = new Book("Хоббит: Туда и обратно", 700);
        Book bible = new Book("Библия", 1100);
        Book constitution = new Book("Конституция", 78);
        Book[] books = new Book[4];

        books[0] = cleanCode;
        books[1] = tudaIObratno;
        books[2] = bible;
        books[3] = constitution;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getTitle() + " имеет: " + book.getPages() + " страниц");
        }

        System.out.println();

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getTitle().equals("Clean Code")) {
                System.out.println(book.getTitle() + "имеет: " + book.getPages() + " страниц");
            }
        }
    }
}
