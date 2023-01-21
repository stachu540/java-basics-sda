package pro.sdacademy.week4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int first = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int second = scanner.nextInt();
        int sum = 0;
        for (int i = first; i <= second; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
