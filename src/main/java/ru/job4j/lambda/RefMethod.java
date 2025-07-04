package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class RefMethod {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"Ivan",
				"Petr"
		);
		//Consumer<String> consumer = name -> System.out.println(name); ниже написан равнозначный метод
		Consumer<String> consumer = System.out::println;
		names.forEach(consumer);

		//Comparator<Integer> intComparator = (left, right) -> Integer.compare(left, right);
		//ниже написан равнозначный метод
		Comparator<Integer> intComparator = Integer::compare;

		Consumer<String> out = RefMethod::cutOut;
		names.forEach(out);
	}

	public static void cutOut(String value) {
		if (value.length() > 10) {
			System.out.println(value.substring(0, 10) + "..");
		} else {
			System.out.println(value);
		}
	}
}
