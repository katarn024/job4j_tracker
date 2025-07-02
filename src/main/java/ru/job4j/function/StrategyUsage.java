package ru.job4j.function;

public class StrategyUsage {
	public boolean empty(String string) {
		return string.isEmpty();
	}

	public boolean startWith(String string, String prefix) {
		return string.startsWith(prefix);
	}

	public boolean contains(String string, String key) {
		return string.contains(key);
	}
}
