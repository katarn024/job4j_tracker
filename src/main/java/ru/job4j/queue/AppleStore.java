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
        Customer nameWinner = null;
        for (int i = 0; i < count; i++) {
            nameWinner = queue.peek();
            queue.poll();
        }
        return nameWinner.name();
    }

    public String getFirstUpsetCustomer() {
        Customer nameWinner = null;
        for (int i = 0; i < count; i++) {
            queue.poll();
            nameWinner = queue.peek();
        }
        return nameWinner.name();
    }
}
