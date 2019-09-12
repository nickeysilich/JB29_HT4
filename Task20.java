package by.htp.les05.main;
//20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task20 {
	public static void main(String[] args) {
		int a;

		Scanner sc;

		sc = new Scanner(System.in);

		System.out.println("Введите a");
		a = sc.nextInt();

		int c = sum(a);

		System.out.println("Количество действий чтобы получился 0 " + c);

	}

	public static int sum(int a) {
		int b = a;
		int sum;
		int c;
		sum = 0;
		c = 0;
		for (; a > 0; a /= 10)
			sum += a % 10;
		//System.out.println(sum);

		while (b != 0 & b > -1) {
			b -= sum;
			}
			c++;

		return c;

	}
}
