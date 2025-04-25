package ru.job4j.except;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.*;

class CountTest {

    @Test
    void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Count.add(10, 2);
                });
        /* Когда программа прерывается с исключением нам необходимо использовать метод assertThrows(),
        в качестве первого параметра он принимает класс исключения, который мы ожидаем получить
        в результате выполнения нашего кода. В качестве второго параметра мы передаем код, при выполнении которого
        будет сгенерировано исключение. При этом передаем мы его в виде лямбда-выражения, которая реализует
        абстрактный метод функционального интерфейса Executable.*/
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish");
    }

    @Test
    void whenException2() {
        int start = 0;
        int finish = 3;
        int expected = 3;
        int result = Count.add(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}
