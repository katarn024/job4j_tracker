package ru.job4j.lambda;

import java.util.Comparator;

public class NumbersLambda {
	public static void main(String[] args) {
		String[] numbers = {
				"1. Task",
				"2. Task",
				"11. Task"
		};

		Comparator<String> numberString = (left, right) -> {
			int first = Integer.valueOf(left.substring(0, left.indexOf(".")));
			int second = Integer.valueOf(right.substring(0, right.indexOf(".")));
			return Integer.compare(first, second);
		};

		/**
		 * Опишем Лямбда через шаблон:
		 * (ПАРАМЕТРЫ) -> {
		 *    ОПЕРАТОРЫ;
		 *    return ЗНАЧЕНИЕ;
		 * }
		 */
	}
}
