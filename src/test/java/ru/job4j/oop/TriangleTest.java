package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isEqualTo(expected, offset(0.001));
    }

    @Test
    public void when02and40and03Then8() {
        Point a = new Point(0, 2);
        Point b = new Point(4, 0);
        Point c = new Point(0, 3);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 2;
        assertThat(result).isEqualTo(expected, offset(0.001));
    }

    @Test
    public void when00and0Minus1And01ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, -1);
        Point c = new Point(0, 1);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isEqualTo(expected, offset(0.001));
    }
}