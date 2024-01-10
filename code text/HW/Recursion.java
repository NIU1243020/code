import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        try (Scanner keyin = new Scanner(System.in)) {
            System.out.println("輸入m");
            int m =keyin.nextInt(); 
            System.out.println("輸入n");
            int n =keyin.nextInt(); 
            System.out.println("C(m, n) = " + comb(m, n));
        }

    }

    public static int comb (int m, int n) {
        if (n == 0 || m == n) {
            return 1;
        }
        if (m < n) {
            return 0;
        }
        if (n == 1) {
            return m;
        }
        return comb(m-1, n) + comb(m-1, n-1);
    }
}