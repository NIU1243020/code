import java.util.Scanner;

public class FiveDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入一個五位數");
        int FiveDigits = scanner.nextInt();

        if (FiveDigits < 10000 && FiveDigits > 99999) {
            System.out.println("請輸入五位數");
        } else {
            int TenThousand = 0;
            int Thousand = 0;
            int Hundred = 0;
            int ten = 0;

            TenThousand = FiveDigits / 10000;
            FiveDigits = FiveDigits % 10000;
            Thousand = FiveDigits / 1000;
            FiveDigits = FiveDigits % 1000;
            Hundred = FiveDigits / 100;
            FiveDigits = FiveDigits % 100;
            ten = FiveDigits / 10;
            FiveDigits = FiveDigits % 10;

            System.out.println("個位數" + FiveDigits);
            System.out.println("十位數" + ten);
            System.out.println("百位數" + Hundred);
            System.out.println("千位數" + Thousand);
            System.out.println("萬位數" + TenThousand);
            }

            scanner.close();
        }
        
    }
    
