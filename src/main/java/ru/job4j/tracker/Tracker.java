package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int number = 0;
        for (int index = 0; index < size; index++)  {
            if (items[index].getName().equals(key)) {
                result[number++] = items[index];
            }
        }
        result = Arrays.copyOf(items, number);
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        if (indexOf(id) != -1) {
            items[indexOf(id)].setName(item.getName());
            return findById(id).equals(item);
        }
        return false;
    }

    public void delete(int id) {
        int index;
        if (1 >= id && id <= size) {
            index = indexOf(id);
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, size - (index - 1));
            items[size - 1] = null;
            size--;
        }
    }
}