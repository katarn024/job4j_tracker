package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapLambdaUsage {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map.put(1, "name");
		//map.put(2, "top");
		//map.put(3, "user");
		//map.put(4, "precision");
		//map.put(5, "post");

		/*
		BiFunction<Integer, String, String> function = (key, value) -> value + "_" + key;
		map.replaceAll(function);
		*/

		BiFunction<Integer, String, String> function = (key, value) -> key + "_" + value;
		String result = map.computeIfPresent(1, function);

		System.out.println("Current value: " + result);
		map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

		System.out.println("\nДалее идет функция computeIfAbsent");
		//map2.put("Petr", 5);

		Function<String, Integer> function2 = String::length;
		map2.computeIfAbsent("Petr", function2);
		map2.computeIfAbsent("Petr", key -> key.length() + 10);
		map2.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

		System.out.println("\nДалее идет функция merge (с использованием функции на имеющемся значении)");
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("Shoes", 200);

		BiFunction<Integer, Integer, Integer> function3 = (oldValue, newValue) -> oldValue - newValue;
		int newPrice = map3.merge("Shoes", 50, function3);
		System.out.println("New price: " + newPrice);

		map3.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

		System.out.println("\nДалее идет функция merge (с добавлением нового значения)");
		Map<String, Integer> map4 = new HashMap<>();
		map4.put("Shoes", 200);

		BiFunction<Integer, Integer, Integer> function4 = (oldValue, newValue) -> oldValue - newValue;
		int newPrice4 = map4.merge("Shoes", 50, function4);
		System.out.println("New price Shoes: " + newPrice4);
		System.out.println("Price of shirt: " + map4.merge("Shirt", 100, function4));

		map4.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
	}
}
