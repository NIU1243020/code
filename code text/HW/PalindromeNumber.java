import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("請輸入一個6位數正整數: ");
            int num = scanner.nextInt();

            if (isPalindrome(num)) {
                System.out.println(num + " 是回文數");
            } else {
                System.out.println(num + " 不是回文數");
            }
        }
    }

    public static boolean isPalindrome(int num) {
        String strNum = String.valueOf(num);
        String reverseStrNum = new StringBuilder(strNum).reverse().toString();
        return strNum.equals(reverseStrNum);
    }
}
