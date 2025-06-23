package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		int lenMin = o1.length();
		if (o1.length() > o2.length()) {
			lenMin = o2.length();
		}
		for (int index = 0; index < lenMin; index++) {
			int charCompare = Character.compare(o1.charAt(index), o2.charAt(index));
			if (charCompare != 0) {
				return charCompare;
			}
		}
		return Integer.compare(o1.length(), o2.length());
	}
}
