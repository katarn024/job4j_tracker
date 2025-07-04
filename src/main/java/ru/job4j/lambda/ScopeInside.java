package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {

	private static String first = "Гав";
	private static String second = "Муу";

	public static void main(String[] args) {
		String ayyy = "ayyy";
		String name = echo(
				() -> {
					return ayyy;
				}
		);
		String test = echo(
				() -> {
					second = "Мяу";
					return first + second;
				}
		);
		System.out.println(test);
		System.out.println(ayyy);
		System.out.println(name);
	}

	private static String echo(Supplier<String> supplier) {
		String sound = supplier.get();
		return sound + " " + sound + " " + sound;
	}
}
