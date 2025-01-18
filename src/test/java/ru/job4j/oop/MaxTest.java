package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when12Then() {
        int one = 1;
        int two = 2;
        int output = Max.max(one, two);
        int expected = 2;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when123Then3() {
        int one = 1;
        int two = 2;
        int three = 3;
        int output = Max.max(one, two, three);
        int expected = 3;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1234Then4() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int output = Max.max(one, two, three, four);
        int expected = 4;
        assertThat(output).isEqualTo(expected);
    }
}