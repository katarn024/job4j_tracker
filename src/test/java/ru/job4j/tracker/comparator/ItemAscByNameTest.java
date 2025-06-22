package ru.job4j.tracker.comparator;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemAscByNameTest {

    @Test
    void whenListItemCompareAsc() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Cat"));
        items.add(new Item(2, "Alan"));
        items.add(new Item(3, "Bob"));
        items.add(new Item(4, "Simon"));
        items.sort(new ItemAscByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(2, "Alan"));
        expected.add(new Item(3, "Bob"));
        expected.add(new Item(1, "Cat"));
        expected.add(new Item(4, "Simon"));
        assertThat(items).containsExactlyElementsOf(expected);
    }
}