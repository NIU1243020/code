import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入提款金額: ");
        int Amount = scanner.nextInt();

        if (Amount < 1) {
            System.out.println("提款金額必須大於0");
        } else {
            int hundred = 0;
            int ten = 0;

            while (Amount > 99) {
                Amount = Amount - 100;
                hundred = hundred + 1;
            }

            while (Amount > 9) {
                Amount = Amount - 10;
                ten = ten + 1;
            }

            System.out.println("100元: " + hundred + "個");
            System.out.println("10元: " + ten + "個");
            System.out.println("1元: " + Amount + "個");
        }
        scanner.close();
    }

}
