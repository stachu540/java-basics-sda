package pro.sdacademy.week1;

public class AppOddEven {
    public static void main(String[] args) {
        int number = 4;
        String output = "Number " + number + " is ";
        if (number % 2 == 0) {
            output += "odd";
        } else {
            output += "even";
        }
        System.out.println(output);
    }
}
