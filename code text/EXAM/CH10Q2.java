package EXAM;

import java.util.Random;

public class CH10Q2 {
    public static void main(String[] args) {
        printLottoNumbers();
    }

    public static void printLottoNumbers() {
        int[] lotto = new int[49];
        for (int i = 0; i < 49; i++) {
            lotto[i] = i + 1;
        }

        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int choose = random.nextInt(49 - i);
            System.out.print(lotto[choose] + " ");

            for (int j = choose; j < 48 - i; j++) {
                lotto[j] = lotto[j + 1];
            }
        }
        System.out.println();
    }
}
