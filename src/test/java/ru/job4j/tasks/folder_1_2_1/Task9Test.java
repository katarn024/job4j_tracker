package ru.job4j.tasks.folder_1_2_1;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class Task9Test {

    @Test
    public void whenCreateQueue() {
        Task9 task = new Task9();
        assertEquals(task.queue.getClass(), PriorityQueue.class);
    }

}