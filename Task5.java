package by.htp.les05.main;
//5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc;
		int a;
		int b;
		int c;
		int min;
		int max;
		int sum;

		sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();

		min = min(min(a, b), c);
		max = max(max(a, b), c);

		sum = min + max;

		System.out.println("Cумма большего и меньшего из трех чисел = " + sum);

	}

}
