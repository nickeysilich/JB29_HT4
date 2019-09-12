package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;

//13. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

public class Task13 {

	public static void main(String[] args) {
		
		int N;
		Scanner sc;
		int[] arr;
		sc = new Scanner(System.in);

		System.out.println("Введите N");
		N = sc.nextInt();
		
		
		arr = arr(N);
		System.out.println(Arrays.toString(arr));
		
	}
	public static int [] arr (int N) {
		
		String s = Integer.toString(N);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = N % 10;
            N /= 10;
        }
        
		return arr;
	}

}
