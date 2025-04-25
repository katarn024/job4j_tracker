package ru.job4j.except;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index] == key) {
                result = index;
                break;
            } else {
                throw new ElementNotFoundException("In your list not be key");
            }
        }
        return result;
    }

    public static boolean sent(String value, String[] abuse) throws ElementAbuseException {
        for (String key : abuse) {
            if (key == value) {
                throw new ElementAbuseException("Присутствует запрещенный элемент");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[] {"10", "66", "88"}, "115"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
