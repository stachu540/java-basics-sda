package pro.sdacademy.week1;

import java.util.Scanner;

public class AppSampleGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type random integer: ");
        Integer randNumber = scanner.nextInt();
        System.out.print("How many times do you wish: ");
        Integer timesLoop = scanner.nextInt();

        System.out.println("--- TASK1 ---");
        task1(randNumber, timesLoop);
        System.out.println("--- TASK2 ---");
        task2(timesLoop);
        System.out.println("--- TASK3 ---");
        task3();
        System.out.println("\n--- TASK4 ---");
        task4(timesLoop);
        System.out.println("\n---  END  ---");
    }

    /**
     * using loop, implement power for any integers
     */
    private static void task1(Integer number, Integer count) {
        Integer x = number;
        Integer y = count;
        Integer sum = 1;
        for (Integer i = 1; i <= y; i++) {
            sum = sum * x;
        }
        System.out.println(x + " ^ " + count + " = " + sum);
    }

    /**
     * using loop, implement factorial for any integers
     */
    private static void task2(Integer count) {
        Integer factorialNumber = count;
        Integer factorialSum = 1;
        for (Integer i = 2; i <= factorialNumber; i++) {
            factorialSum = factorialSum * i;
        }
        System.out.println("Results for " + factorialNumber + "! = " + factorialSum);
    }

    /**
     * FizzBuzz
     * using loop, implement counts using 1 until 100.
     * If number is dived by 3 types Fizz.
     * If number is dived by 5 types Buzz.
     * If number is dived 3 and 5 types FizzBuzz.
     * Otherwise, types the number.
     */
    private static void task3() {
        for (Integer i = 1; i <= 100; i++) {
            String result = ""; // prepare for input
            if (i % 3 == 0) { // check if i can be dived 3
                result = result + "Fizz"; // append to result
            }
            if (i % 5 == 0) { // check if i can be dived 5
                result = result + "Buzz"; // append to result
            }
            if (result != "") { // check if result is empty
                System.out.print(result + " "); // printing Fizz / Buzz / FizzBuzz if some number are divide 3 and/or 5
            } else {
                System.out.print(i + " "); // printing number, if will not divide
            }
        }
    }

    /**
     * EXTRA
     * using loop implement fibonacci series for any integers.
     * SRC: https://www.javatpoint.com/fibonacci-series-in-java
     */
    private static void task4(Integer count) {
        Integer n1 = 0;
        Integer n2 = 1;
        Integer n3 = 0;
        if (count == 1) {
            System.out.print("Result: " + n1);
        }
        if (count == 2) {
            System.out.print("Result: " + n2);
        } else {
            for (Integer i = 2; i < count; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.print("Result: " + n3);
        }
    }
}
