package ru.job4j.tasks.folder_1_2_1;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class Task7Test {

    @Test
    public void whenCheckVariable() {
        var task = new Task7();
        int x = task.getAge();
        assertThat(x, is(20));
    }

    @Test
    public void whenCheckConstructor() {
        var task = new Task7("name", "surname");
        assertThat(task, is(notNullValue()));
    }

}