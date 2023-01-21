package pro.sdacademy.week1;

import java.util.Scanner;

public class AppInput {
    public static void main(String[] args) {
        // SOURCE: https://www.baeldung.com/java-console-input-output#reading-from-systemin
        System.out.print("Type something: ");
        Scanner scanner = new Scanner(System.in);
        String output = scanner.next();
        System.out.println("Output: " + output);
    }
}
