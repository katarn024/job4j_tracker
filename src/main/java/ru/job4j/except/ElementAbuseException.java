package ru.job4j.except;

public class ElementAbuseException extends ElementNotFoundException {
    public ElementAbuseException(String message) {
        super(message);
    }
}
