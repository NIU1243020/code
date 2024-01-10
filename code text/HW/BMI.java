import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // 創建一個Scanner用在從使用者輸入獲取體重身高
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入體重(kg): ");
        double weight = scanner.nextDouble();

        System.out.print("請輸入身高(m): ");
        double height = scanner.nextDouble();

        //輸出BMI
        System.out.println("您的BMI: " + weight / (height * height));

        //關閉Scanner
        scanner.close();
    }
}
