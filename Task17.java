package by.htp.les05.main;

import java.util.Scanner;

//17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию
public class Task17 {
    public static void main(String[] args) {
        int k;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Введите k");
        k = sc.nextInt();
        System.out.println("Числa Армистронга от 1 до k: ");

        for (int i = 1; i < k; i++) {
            int p = (int) Math.log10(i) + 1;
            if (i == getSum(i, p))
                System.out.println(i);
        }
    }
        private static long getSum (int x, int a) {
            int z = x;
            long sum = 0;
            for (int i = a; i >= 0; i--) {
                int tmp = (int)(z/Math.pow(10,i));
                sum += (long)Math.pow(tmp,a);
                z %= (int)(Math.pow(10,i));
            }
            return sum;
        }
    }

