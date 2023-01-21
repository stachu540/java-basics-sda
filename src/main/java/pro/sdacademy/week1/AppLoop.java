package pro.sdacademy.week1;

public class AppLoop {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++) {
            System.out.println("Repeating code " + (i+1) + " time" + ((i > 0) ? "s" : ""));
        }
    }
}
