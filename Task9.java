package by.htp.les05.main;

//9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc;
		int a;
		int b;
		int c;
		int nok;
		int d;

		sc = new Scanner(System.in);

		System.out.println("Введите первое число");
		a = sc.nextInt();
		System.out.println("Введите второе число");
		b = sc.nextInt();
		System.out.println("Введите третье число");
		c = sc.nextInt();
		d = 0;

		nok = nod(a, b, d);

	}

	public static int nod(int a, int b, int d) {
		while (a != 0 && b != 0) {
			if (a >= b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}

		if (a == 1) {
			System.out.println("Числа взаимно простые");
			return a;
		} else if (b == 1) {
			System.out.println("Числа взаимно простые");
			return b;

		} else {
			System.out.println("Числа не взаимно простые");
			return d;
		}

	}
}
