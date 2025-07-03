package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lazy {
	public static void main(String[] args) {
		String[] names = {
				"Ivan",
		};
		Comparator<String> lengthComparator = (left, right) -> {
			System.out.println("execute comparator");
			return Integer.compare(left.length(), right.length());
		};
		Arrays.sort(names, lengthComparator);
		/// т.к. 1 объект, то сортировать тут нечего и сортировка не произойдет
	}
}
