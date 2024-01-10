import java.util.Random;

public class TwoDice {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] diceRolls = new int[100][2];

        for (int i = 0; i < 100; i++) {
            diceRolls[i][0] = random.nextInt(6) + 1;
            diceRolls[i][1] = random.nextInt(6) + 1;
        }

        for (int i = 2; i <= 12; i++) {
            int count = 0;
            for (int j = 0; j < 100; j++) {
                if (diceRolls[j][0] + diceRolls[j][1] == i) {
                    count++;
                }
            }
            System.out.println("點數和為 " + i + " 的次數：" + count);
        }
    }
}
