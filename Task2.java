package by.htp.les05.main;

import java.util.Scanner;

//2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:

public class Task2 {

	public static void main(String[] args) {

		Scanner sc;
		int a;
		int b;
		int nok;

		sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();

		nok = (a * b) / nod(a, b);
		System.out.println(nok);

	}

	//////////////////////////////////// nod
	public static int nod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a >= b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}

		if (a == 0) {
			System.out.println(b);
			return b;
		} else {
			System.out.println(a);
			return a;
		}

	}

}
