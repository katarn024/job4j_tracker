package ru.job4j.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorted {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Bug Fix", 4),
                new Job("Impl Task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
        jobs.sort(new SortDescByNameJob());
        System.out.println(jobs);
    }
}
