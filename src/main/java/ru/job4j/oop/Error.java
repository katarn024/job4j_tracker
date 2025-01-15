package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void printInfo() {
        System.out.println("Статусом: " + active);
        System.out.println("Была вызвана: " + message);
        System.out.println("Кода: " + status);
    }

    public static void main(String[] args) {
        Error error404 = new Error(true, 404, "Error");
        Error error = new Error();
        error404.printInfo();
        error.printInfo();
    }
}
