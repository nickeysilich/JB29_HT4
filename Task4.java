package by.htp.les05.main;
//4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc;
		int a;
		int b;
		int c;
		int nok;

		sc = new Scanner(System.in);

		System.out.println("Введите первое число");
		a = sc.nextInt();
		System.out.println("Введите второе число");
		b = sc.nextInt();
		System.out.println("Введите третье число");
		c = sc.nextInt();

		nok = nok1(a, nok1(b, c));
		System.out.println(nok);

	}

	public static int nod(int a, int b) {

		int tmp;
		while (a != 0 && b != 0) {
			a %= b;
			tmp = a;
			a = b;
			b = tmp;
		}
		return a + b;
	}

	public static int nok1(int a, int b) {

		int d;
		d = a / nod(a, b) * b;

		return d;

	}
}
