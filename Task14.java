package by.htp.les05.main;
//14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		int N;
		int M;
		Scanner sc;
		int[] arr;
		int[] arr2;
		sc = new Scanner(System.in);

		System.out.println("Введите N");
		N = sc.nextInt();
		System.out.println("Введите M");
		M = sc.nextInt();

		arr = arr(N);
		arr2 = arr2(M);
		if (arr.length > arr2.length) {
			System.out.println(Arrays.toString(arr));
		} else if (arr.length < arr2.length) {
			System.out.println(Arrays.toString(arr2));
		} else {
			System.out.println("равны");
		}
	}

	public static int[] arr(int N) {

		String s = Integer.toString(N);
		int[] arr = new int[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			arr[i] = N % 10;
			N /= 10;
		}

		return arr;
	}

	public static int[] arr2(int M) {

		String s = Integer.toString(M);
		int[] arr2 = new int[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			arr2[i] = M % 10;
			M /= 10;
		}

		return arr2;
	}

}
