package by.htp.les05.main;

import java.util.Collections;

//8. Составить программу, которая в массиве
//A[N] находит второе по величине число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

public class Task8 {

	public static void main(String[] args) {

		int[] arr = { 32, 3423, 23, 423423, 4233333, 2, 3232, 575, 323 };
		int a;
		int b;
		a = max(arr);
		b = submax(arr,a);
		System.out.println(b);

	}
	public static int max(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
	}
		return max;
}
public static int submax(int [] arr, int max){
	int submax = 0;
	for (int i = 0; i < arr.length;i++){
		if (submax < arr[i] && max > arr[i]) {
			submax = arr[i];
		}
	}
	return submax;
	}
}
