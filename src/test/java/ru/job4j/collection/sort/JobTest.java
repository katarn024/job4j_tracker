package ru.job4j.collection.sort;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.*;

public class JobTest {

	@Test
	public void whenComparatorAscByName() {
		int result = new JobAscByName().compare(
				new Job("Impl task", 0),
				new Job("Fix bug", 1)
		);
		assertThat(result).isGreaterThan(0);
	}

	@Test
	public void whenComparatorDescByName() {
		int result = new JobDescByName().compare(
				new Job("Impl task", 0),
				new Job("Fix bug", 1)
		);
		assertThat(result).isLessThan(0);
	}

	@Test
	public void whenComparatorAscByPriority() {
		int result = new JobAscByPriority().compare(
				new Job("Impl task", 0),
				new Job("Fix bug", 1)
		);
		assertThat(result).isLessThan(0);
	}

	@Test
	public void whenComparatorDescByPriority() {
		int result = new JobDescByPriority().compare(
				new Job("Impl task", 0),
				new Job("Fix bug", 1)
		);
		assertThat(result).isGreaterThan(0);
	}

	@Test
	public void whenComparatorByNameAndPriority() {
		Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
		int rsl = cmpNamePriority.compare(
				new Job("Impl task", 0),
				new Job("Fix bug", 1)
		);
		assertThat(rsl).isLessThan(0);
	}
}