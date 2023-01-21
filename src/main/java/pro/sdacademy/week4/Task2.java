package pro.sdacademy.week4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        float d = in.nextFloat();
        float r = d / 2;
        float PI = (float) Math.PI;
        float o = (2 * PI) * r;
        float p = PI * d;
        System.out.println("Circumference of a circle: " + o);
        System.out.println("Area of a circle: " + p);
    }
}
