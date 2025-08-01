package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        /* for-each origin -> new HashSet. */
        for (String word : origin) {
            check.add(word);
        }
        for (String word : duplicate) {
            if (!check.contains(word)) {
                return false;
            }
        }
        /* for-each text -> hashSet.contains */
        return result;
    }
}
