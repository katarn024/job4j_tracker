package ru.job4j.collection.sort;


import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        // Из-за Collections.reverseOrder() происходит реверс сортировки
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
    }
}
