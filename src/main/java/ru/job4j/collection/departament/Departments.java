package ru.job4j.collection.departament;

import java.util.*;

public class Departments {

	public static List<String> fillGaps(List<String> departments) {
		Set<String> temp = new LinkedHashSet<>();
		for (String value : departments) {
			String start = "";
			for (String element : value.split("/")) {
				if (element.length() == 2) {
					temp.add(element);
					start = element;
				} else {
					temp.add(start + "/" + element);
					start = start + "/" + element;
				}
			}
		}
		return new ArrayList<>(temp);
	}

	public static void sortAsc(List<String> departments) {
		Collections.sort(departments, Comparator.naturalOrder());
	}

	public static void sortDesc(List<String> departments) {
		Collections.sort(departments, new DepartmentsDescComparator());
	}
}