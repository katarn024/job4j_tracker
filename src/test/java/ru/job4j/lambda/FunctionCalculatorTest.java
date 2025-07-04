package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class FunctionCalculatorTest {
	@Test
	void whenLinearFunctionThenLinearResults() {
		FunctionCalculator function = new FunctionCalculator();
		List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
		List<Double> expected = Arrays.asList(11D, 13D, 15D);
		assertThat(result).containsAll(expected);
	}

	@Test
	void whenQuadraticFunctionThenLinearResults() {
		FunctionCalculator function = new FunctionCalculator();
		List<Double> result = function.diapason(5, 8, x -> x * x);
		List<Double> expected = Arrays.asList(25D, 36D, 49D);
		assertThat(result).containsAll(expected);
	}

	@Test
	void whenExponentialFunctionThenLinearResults() {
		FunctionCalculator function = new FunctionCalculator();
		List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x));
		List<Double> expected = Arrays.asList(32D, 64D, 128D);
		assertThat(result).containsAll(expected);
	}

}