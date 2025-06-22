package ru.job4j.tracker.comparator;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemDescByNameTest {

    @Test
    void whenListItemCompareDesc() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Item 101"));
        items.add(new Item(2, "Item 222"));
        items.add(new Item(3, "Item 333"));
        items.add(new Item(4, "Item 10"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(3, "Item 333"));
        expected.add(new Item(2, "Item 222"));
        expected.add(new Item(1, "Item 101"));
        expected.add(new Item(4, "Item 10"));
        assertThat(items).containsExactlyElementsOf(expected);
    }
}