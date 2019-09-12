package by.htp.les05.main;
//10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task10 {

	public static void main(String[] args) {
		int a;
		int b;

		a = 1;
		b = 0;

		System.out.println("Cумма факториалов = " + fact(a, b));
	}

	public static int fact(int a, int b) {

		for (int i = 1; i <= 9; i++) {
			a *= i;
			if (i % 2 != 0) {
				b += a;
			}
		}
		return b;
	}

}
