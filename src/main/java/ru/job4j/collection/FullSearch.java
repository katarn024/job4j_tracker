package ru.job4j.collection;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FullSearch {

    public Set<String> extractNumber(List<Task> tasks) {
        HashSet<String> numbers = new HashSet<>();
        HashSet<String> descriptions = new HashSet<>();
        for (Task task : tasks) {
            numbers.add(task.getNumber());
            descriptions.add(task.getDescription());
        }

        return numbers;
    }
}
