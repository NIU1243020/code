import java.util.Scanner;

public class Hundred {
    public static void main(String[] args) {
        // 創建一個Scanner用在從使用者輸入獲取整數
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入整數");
        int number = scanner.nextInt();

        if (number < 1000 && number > 99) {
            System.out.println("是三位數");
        } else {
            System.out.println("不是三位數");

        }
        scanner.close();
    }
}
