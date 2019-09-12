package by.htp.les05.main;
//3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

import java.io.IOException;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		int nod;
		int[] arr = fillArray(4);
		nod = nod1(arr);
		System.out.println("Наибольший общий делитель 4-ex чисел: " + nod);
	}

	///////////////////////////////////
	private static int[] fillArray(int n) {
		Scanner sc;
		int[] arr = new int[4];
		sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Введите число");
			arr[i] = sc.nextInt();

		}
		return arr;
	}

///////////////////////////////////
	public static int nod1(int[] arr) {
		int a = Math.abs(arr[0]);
		for (int b : arr) {
			while (a != 0 && b != 0) {
				if (a >= b) {
					a = a % b;
				} else {
					b = b % a;
				}
			}

			a += b;
		}
		return a;

	}
}
