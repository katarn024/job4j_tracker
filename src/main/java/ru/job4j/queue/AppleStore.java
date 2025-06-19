package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer reuslt = null;
        for (int i = 0; i < count; i++) {
            reuslt = queue.peek();
            queue.poll();
        }
        return reuslt.name();
    }

    public String getFirstUpsetCustomer() {
        Customer reuslt = null;
        for (int i = 0; i < count; i++) {
            queue.poll();
            reuslt = queue.peek();
        }
        return reuslt.name();
    }
}
