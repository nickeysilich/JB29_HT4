package by.htp.les05.main;
//1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

import static java.lang.Math.sqrt;

public class Task1 {

	public static void main(String[] args) {

		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double a;
		double b;
		double c;
		double sqr;

		x1 = 2;
		y1 = 0;
		x2 = 0;
		y2 = 4;
		x3 = 0;
		y3 = 0;

		a = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		b = sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		c = sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		if (a + b <= c || a + c <= b || b + c <= a)
			System.out.println("Треугольник не существует");
		else {

			sqr = sqr(a, b, c);
			System.out.println("Площадь: " + sqr);
		}
	}

	public static double sqr(double a, double b, double c) {
		double pp;
		double sqr;
		pp = (a + b + c) / 2;
		sqr = sqrt(pp * (pp - a) * (pp - b) * (pp - c));
		return sqr;

	}

}
