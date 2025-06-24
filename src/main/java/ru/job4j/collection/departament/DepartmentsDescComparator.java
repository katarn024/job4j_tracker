package ru.job4j.collection.departament;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
	@Override
	public int compare(String left, String right) {
		String[] leftSplit = left.split("/");
		String[] rightSplit = right.split("/");

		String[] minLen = leftSplit;
		if (leftSplit.length > rightSplit.length) {
			minLen = rightSplit;
		}
		for (int i = 0; i < minLen.length; i++) {
			if (i == 0) {
				int firstLetter = rightSplit[i].compareTo(leftSplit[i]);
				if (firstLetter != 0) {
					return firstLetter;
				}
			}
			for (int index = 0; index < leftSplit[i].length(); index++) {
				int charCompare = Character.compare(leftSplit[i].charAt(index), rightSplit[i].charAt(index));
				if (charCompare != 0) {
					return charCompare;
				}
			}
		}
		return Integer.compare(leftSplit.length, rightSplit.length);
	}
}
