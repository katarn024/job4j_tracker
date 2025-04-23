package ru.job4j.tracker;

public class StubOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();

    /* В этом классе заглушке мы используем поле с типом StringBuilder. Класс StringBuilder позволяет складывать строки.
    String в Java неизменяемые типы данных. То есть после создания объекта типа String изменить строку нельзя.
    Любые методы из класса String возвращают новую строку. */

    @Override
    public void println(Object object) {
        if (object != null) {
            buffer.append(object.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}
