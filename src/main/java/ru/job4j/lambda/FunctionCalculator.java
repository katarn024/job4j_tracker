package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
	public List<Double> diapason(int start, int end, Function<Double, Double> func) {
		Function<Double, Double> function;
		List<Double> result = new ArrayList<>();
		for (int index = start; index < end; index++) {
			result.add(func.apply((double) index));
		}
		return result;
	}
}
