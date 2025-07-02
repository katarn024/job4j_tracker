package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
	public static void main(String[] args) {
		System.out.println("Supplier:");
		Supplier<String> supplier = () -> "New String For Interface";
		System.out.println(supplier.get());

		List<String> list = List.of("one", "two", "three", "one", "two", "three");
		Supplier<Set<String>> supplier2 = () -> new HashSet<>(list);
		Set<String> strings = supplier2.get();
		for (String string : strings) {
			System.out.println(string);
		}

		List<String> list2 = List.of("one", "two", "three", "one", "two", "three");
		Supplier<Set<String>> supplier3 = () -> new HashSet<>(list2);
		BiConsumer<Integer, String> consumer = (first, second) -> System.out.println(first + second);
		Set<String> strings2 = supplier3.get();
		int i = 1;
		for (String string : strings2) {
			consumer.accept(i++, " is " + string);
		}

		System.out.println();
		System.out.println("Predicate:");
		Predicate<String> predicate = string -> string.isEmpty();
		System.out.println("Строка пустая: " + predicate.test(""));
		System.out.println("Строка пустая: " + predicate.test("test"));

		System.out.println();
		System.out.println("BiPredicate:");
		BiPredicate<String, Integer> condition = (string, number) -> string.contains(number.toString());
		System.out.println("Строка содержит подстроку: " + condition.test("Name123", 123));
		System.out.println("Строка содержит подстроку: " + condition.test("Name", 123));

		System.out.println();
		System.out.println("Function:");
		Function<String, Character> function = string -> string.charAt(2);
		System.out.println("Третий символ в строке: " + function.apply("first"));
		System.out.println("Третий символ в строке: " + function.apply("second"));

		System.out.println();
		System.out.println("BiFunction:");
		BiFunction<String, Integer, String> biFunction = (string, number) -> string.concat(" ").concat(number.toString());
		System.out.println("Результат работы бифункции: " + biFunction.apply("Name", 123));
		System.out.println("Результат работы бифункции: " + biFunction.apply("String number", 12345));
	}
}
