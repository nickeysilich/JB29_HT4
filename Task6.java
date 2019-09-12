package by.htp.les05.main;

import java.util.Scanner;

//6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task6 {

	public static void main(String[] args) {

		double S1;
		Scanner sc;
		double a;

		sc = new Scanner(System.in);
		System.out.println("Введите сторону a");
		a = sc.nextDouble();

		S1 = 0;
		S1 = str1(S1, a);

		System.out.println("Площадь правильного шестиугольника = " + S1);
	}

	public static double str1(double s1, double a) {

		s1 = (double) (((Math.sqrt(3) / 4) * a * a) * 6);
		return s1;
	}
}
