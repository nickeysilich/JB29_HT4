package by.htp.les05.main;

import java.util.Scanner;

//12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task12 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		double t;
		double s;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Введите сторону x");
		x = sc.nextDouble();
		System.out.println("Введите сторону y");
		y = sc.nextDouble();
		System.out.println("Введите сторону z");
		z = sc.nextDouble();
		System.out.println("Введите сторону t");
		t = sc.nextDouble();
		
		s = s(x, y, z, t);
		System.out.println(s);
	
	}

	public static double s (double x, double y, double z, double t) {
		double d;
		double s1;
		double s2;
		double p;
		d = Math.sqrt(x * x + y * y);
		s1 = x * y / 2;
		p = (d + z +t)/2;
		s2 = Math.sqrt(p * (p - d) * (p - z) * (p - t));
		//s2 = 0.25 * Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d));
		
		return s1 + s2;
		
	}
}
