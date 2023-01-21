package pro.sdacademy.week4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert multiplier digit: ");
        int multi = scanner.nextInt();
        System.out.println("Please insert min multiplicand digit: ");
        int min = scanner.nextInt();
        System.out.println("Please insert max multiplicand digit: ");
        int max = scanner.nextInt();
        multiplicationTable(multi, min, max);
    }

    private static void multiplicationTable(int multi, int minMulti, int maxMulti) {
        for (int i = minMulti; i<= maxMulti; i++) {
            System.out.println(multi + " x " + i + " = " + multi*i);
        }
    }
}
