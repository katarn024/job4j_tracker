package ru.job4j.collection.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorted {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Bug Fix", 4),
                new Job("Fix bug", 1),
                new Job("Fix bug", 2),
                new Job("Impl Task", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0)
        );
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Comparator<Job> combine = new JobDescByNameLength()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, combine);
        System.out.println(jobs);
    }
}
