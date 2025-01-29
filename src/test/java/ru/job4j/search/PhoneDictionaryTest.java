package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenNoFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Serill", "Ars", "66534872", "Syansk")
        );
        ArrayList<Person> persons = phones.find("Ara");
        assertThat(persons.size()).isEqualTo(0);
    }
}