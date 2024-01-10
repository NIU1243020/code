package EXAM;

import java.util.Scanner;

public class CH7Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入一個大寫英文單字:");
        String word = scanner.nextLine().toUpperCase();

        int totalScore = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                totalScore += c - 'A' + 1;
            }
        }

        System.out.println("該單字的總分數為: " + totalScore);

        scanner.close();
    }
}
