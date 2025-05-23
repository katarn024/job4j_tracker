package ru.job4j.except;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BackArrayTest {

    @Test
    void whenInputArrayHasEvenAmountElement() {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        String[] result = new BackArray().turn(names);
        String[] expected = {"Vasya", "Nik", "Ivan", "Petr"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenInputArrayHasNotEvenAmountElements() {
        String[] names = {"Petr", "Ivan", "Andrey", "Nik", "Vasya"};
        String[] result = new BackArray().turn(names);
        String[] expected = {"Vasya", "Nik", "Andrey", "Ivan", "Petr"};
        assertThat(result).isEqualTo(expected);
    }
}