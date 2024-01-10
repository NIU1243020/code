import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        // 創建一個Scanner用在從使用者輸入獲取整數
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入一個整數: ");
        int num = scanner.nextInt();

        int x = num % 2;
        
        if (x == 0) {
            System.out.println(num + "是偶數");
        } else {
            System.out.println(num + "不是偶數");
        }

        //關閉Scanner
        scanner.close();
    } 
}