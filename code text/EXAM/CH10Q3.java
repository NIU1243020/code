package EXAM;

/public class CH10Q3 {
    public static void main(String[] args) {
        printStrings(1, 3);
        printStrings(2, 2);
    }

    public static void printStrings(int a, int b) {
        printStrings("", a, b);
    }

    public static void printStrings(String result, int a, int b) {
        if (a == 0) {
            System.out.println(result);
            return;
        }
        if (a == 1) {
            printStrings(result + "a", 0, b - 1);
        } else {
            printStrings(result + "aa", a - 1, b);
        }
    }
}
