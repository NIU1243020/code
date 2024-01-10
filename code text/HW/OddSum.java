import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入小於100的正整數(n)");
        int n = scanner.nextInt();

        if (n>0 && n < 100) {
            int sum = CalcuateOddSum(n);
            System.out.println("1+3+...+(2*n-1)的總和= " + sum);
        } else {
            System.out.println("請輸入1~99的正整數");
        }

        scanner.close();
    }

    public static int CalcuateOddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 1) {
            sum = sum + (2 * i - 1);
        }
        return sum;
    }
}
