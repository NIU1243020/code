import java.util.Scanner;

public class QandR {
    public static void main(String[] args) {
        // 創建一個Scanner用在從使用者輸入獲取整數
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入第一個整數(a)");
        int a = scanner.nextInt();

        System.out.print("請輸入第二個整數(b)");
        int b = scanner.nextInt();

        // 檢查是否為零，避免除零錯誤
        if (b == 0) {
            System.out.println("除數不能為零");
        }  else {
            //計算商數餘數
            int quotient = a / b;
            int remainder = a % b;

            //輸出
            System.out.println("商: " + quotient);
            System.out.println("餘數: " + remainder);
        }

        // 關閉Scanner
        scanner.close();
    }
}