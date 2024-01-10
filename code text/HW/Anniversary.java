import java.util.Scanner;

public class Anniversary {
    public static void main(String[] args) {
        // 創建一個Scanner用再從使用者輸入獲取購物金額
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入購物金額: ");
        int shoppingAmount = scanner.nextInt();

        //外設計算禮券金額程式碼
        int voucherAmount = CalculateVoucherAmount(shoppingAmount);

        //輸出禮券金額
        System.out.println("您可以獲得 " + voucherAmount + " 元的禮券。");

        //關閉Scanner
        scanner.close();
    }
    
    //計算禮券金額程式碼
    public static int CalculateVoucherAmount(int shoppingAmount) {
        int voucherAmount = 0;
        voucherAmount += (shoppingAmount / 10000) * 1000;
        shoppingAmount = voucherAmount;

        return voucherAmount;
    }
}
