package EXAM;

import java.util.Scanner;

public class CH7Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入巴斯卡三角形的列數: ");
        int n = scanner.nextInt();
        int[][] pascalTriangle = new int[n][];

        for (int i = 0; i < n; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println(pascalTriangle[i][i]);
        }
        scanner.close();
    }
}
