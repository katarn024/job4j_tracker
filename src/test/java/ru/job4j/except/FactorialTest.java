package ru.job4j.except;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static  org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }
}