package by.htp.les05.main;
//16.Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
//Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Введите n");
        n = sc.nextInt();
        twin(n);
    }

    public static void twin(int n) {
        int x = n - 1;
        int[][] xmass = new int[2][x];

        for (int i = 0; i < xmass[0].length; i++) {
            xmass[0][i] = n;
            xmass[1][i] = n + 2;
            n++;
        }
        for (int i = 0; i < xmass[0].length; i++) {
            System.out.println(xmass[0][i] + ", " + xmass[1][i]);
        }
    }
}
