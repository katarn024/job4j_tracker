package ru.job4j.hierarchyUsage.noInterface;

public class Dog extends Pet {
    public void runAfterCat() {
        System.out.println(nameClass + " не любит кошек, постоянно за ними гоняется.");
    }
}
