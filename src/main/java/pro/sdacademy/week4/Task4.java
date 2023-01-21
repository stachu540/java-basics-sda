package pro.sdacademy.week4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert weight in kilograms: ");
        float weight = scanner.nextFloat();
        System.out.print("Please insert height in centimeters: ");
        int height = scanner.nextInt();
        float bmi = weight / (float) Math.pow((float) height / 100, 2);
        System.out.println("BMI is " + ((bmi >= 18.5 && bmi <= 24.9) ? "correct" : "not correct") + ": " + bmi);
    }
}
