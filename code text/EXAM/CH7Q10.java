package EXAM;

import java.util.Arrays;

public class CH7Q10 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 2, 4},
                {7, 5, 9, 6, 8}
        };

        // 將第0列元素從小排到大
        Arrays.sort(arr[0]);

        // 將第1列元素從小排到大
        Arrays.sort(arr[1]);

        // 利用 foreach 迴圈結構將二維陣列顯示在螢幕
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
