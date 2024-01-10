package EXAM;

import java.util.Scanner;

public class CH8Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入第一個字串: ");
        String str1 = scanner.nextLine();
        System.out.print("請輸入第二個字串: ");
        String str2 = scanner.nextLine();

        // 將第一個字串變數所指向的記憶體位址設定給第二個字串變數
        str1 = str2;

        // 輸出第一個字串變數所指向的記憶體位址中的資料
        System.out.println("第一個字串變數所指向的記憶體位址中的資料: " + str1);

        scanner.close();
    }
}
