package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> containsInName = person -> person.getName().contains(key);
        Predicate<Person> containsInSurname = person -> person.getSurname().contains(key);
        Predicate<Person> containsInAddress = person -> person.getAddress().contains(key);
        Predicate<Person> containsInPhone = person -> person.getPhone().contains(key);
        Predicate<Person> combine = containsInName.or(containsInSurname).or(containsInAddress).or(containsInPhone);

        for (Person person : persons) {
            /*
            if (person.getName().contains(key)
                    || person.getSurname().contains(key)
                    || person.getAddress().contains(key)
                    || person.getPhone().contains(key))
            */
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
