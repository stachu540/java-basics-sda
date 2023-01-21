package pro.sdacademy.week4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Range from 0 to ");
        int m = 0;
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
