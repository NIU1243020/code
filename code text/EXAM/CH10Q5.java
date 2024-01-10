package EXAM;

public class CH10Q5 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
