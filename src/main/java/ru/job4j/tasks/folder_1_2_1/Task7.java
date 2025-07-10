package ru.job4j.tasks.folder_1_2_1;

public class Task7 {
    private int age = 20;
    private String name;
    private String surname;

    public Task7() { }

    public Task7(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
