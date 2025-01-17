package ru.job4j.oop;

import static java.lang.StrictMath.sqrt;

public class Triangle {

    private Point first, second, third;

    public Triangle(Point ab, Point bc, Point ca) {
        this.first = ab;
        this.second = bc;
        this.third = ca;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double bc, double ca) {
        return (ab + bc > ca && ab + ca > bc && ca + bc > ab);
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            double s = sqrt(p * (p - ab) * (p - bc) * (p - ac));
            result = s;
        }
        return result;
    }
}
