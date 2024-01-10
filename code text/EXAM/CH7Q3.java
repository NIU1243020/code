package EXAM;

import java.util.Scanner;

public class CH7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentNames = new String[3];
        int[][] studentScores = new int[3][3];

        // 輸入3個學生的姓名及期中考的3科成績
        for (int i = 0; i < 3; i++) {
            System.out.println("請輸入第 " + (i + 1) + " 個學生的姓名:");
            
            if (i != 0) scanner.nextLine();
            studentNames[i] = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.println("請輸入第 " + (i + 1) + " 個學生的第 " + (j + 1) + " 科成績:");
                studentScores[i][j] = scanner.nextInt();
            }
        }

        // 計算並輸出3個學生的總成績
        for (int i = 0; i < 3; i++) {
            int totalScore = 0;
            for (int j = 0; j < 3; j++) {
                totalScore += studentScores[i][j];
            }
            System.out.println(studentNames[i] + " 的總成績為: " + totalScore);
        }
        
        scanner.close();
    }
}
