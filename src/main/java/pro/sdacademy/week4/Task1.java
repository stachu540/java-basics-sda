package pro.sdacademy.week4;

public class Task1 {
    public static void main(String[] argv) {
        displayCharsDec();
        displayCharsBin();
        displayCharsHex();
    }
    private static void displayCharsDec() {
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print("Using decimal: ");
        System.out.print(s);
        System.out.print(d);
        System.out.println(a);
    }

    private static void displayCharsBin() {
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print("Using binary: ");
        System.out.print(s);
        System.out.print(d);
        System.out.println(a);
    }
    private static void displayCharsHex() {
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;
        System.out.print("Using hex: ");
        System.out.print(s);
        System.out.print(d);
        System.out.println(a);
    }
}
