package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;

public class MostUsedSymbol {
	public static void main(String[] args) {
		String input = "slogan of java language: write once, run everywhere".replaceAll(" ", "");
		Map<Character, Integer> map = new HashMap<>();
		for (char character : input.toCharArray()) {
			Integer temp = map.get(character);
			if (temp != null) {
				map.put(character, temp + 1);
			} else {
				map.put(character, 1);
			}
		}
		int max = 0;
		char result = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				result = entry.getKey();
			}
		}
		System.out.println("Most used symbol: " + result);
	}
}
