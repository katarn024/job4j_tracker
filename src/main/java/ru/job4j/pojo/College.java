package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Антон Павлович Чехов");
        student.setGroup("М-84");
        student.setDate(new Date());
        System.out.println(student.getFio() + " из группы " + student.getGroup() + " поступил " + student.getDate());
    }
}
