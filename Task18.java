package by.htp.les05.main;
//18.Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc;
        int n;
        boolean x;
        List<Integer> z = new ArrayList<>();

        sc = new Scanner(System.in);
        System.out.println("Введите n");
        n = sc.nextInt();

        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            x = true;
            x = check(i);
            if (x == true) {
                z.add(i);
            }
        }
        for (int i = 0; i < z.size(); i++) {
            println("Цифры которые образуют строго возрастающую последовательность", z.get(i));
        }
    }

    public static boolean check(int num) {
        int cnum = num % 10;
        num /= 10;
        while (num > 0) {
            if (num % 10 >= cnum) {
                return false;
            }
            cnum = num % 10;
            num = num / 10;
        }

        return true;
    }
    public static void println(String message, int value) {

        System.out.println(message + " is " + value);
    }

}
