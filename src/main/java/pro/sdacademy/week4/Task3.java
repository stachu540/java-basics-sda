package pro.sdacademy.week4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit (x): ");
        int x = scanner.nextInt();
        System.out.print("Please insert second digit (y): ");
        int y = scanner.nextInt();
        System.out.println("If x is greater than y: " + taskA(x, y));
        System.out.println("If x * 3 is greater than y: " + taskB(x, y));
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: " + taskC(x, y));
        System.out.println("If x * y is even: " + taskD(x, y));
    }

    private static boolean taskA(int x, int y) {
        return x > y;
    }

    private static boolean taskB(int x, int y) {
        return (x * 3) > y;
    }

    private static boolean taskC(int x, int y) {
        return y++ < ++x && --x < y++;
    }

    private static boolean taskD(int x, int y) {
        return x * y % 2 == 0;
    }
}
