package pro.sdacademy.week2;

import java.util.Scanner;

public class AppMethods {
//    public static void main(String[] args) {
//        System.out.print("Please write your name: ");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        if (name == "") {
//            name = "Stranger";
//        }
//        System.out.println("Hello, " + name + "!");
//    }
    public static void main(String[] args) {
        String name = getInput();
        name = checkName(name);
        printResult(name);
        // or
        // printResult(checkName(getInput()));
    }

    private static String getInput() {
        System.out.print("Please write your name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String checkName(String name) {
        if (name == "") {
            return "Stranger";
        }
        return name;
    }

    private static void printResult(String name) {
        System.out.println("Hello, " + name + "!");
        // or
        // System.out.println(String.format("Hello, %s!", result));
    }
}
