import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        // // 創建一個Scanner用在從使用者輸入獲取x值y值
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入x值");
        float x = scanner.nextFloat();

        System.out.print("請輸入y值");
        float y = scanner.nextFloat();

        DetermineQuadrant(x, y);

        scanner.close();
    }

    public static void DetermineQuadrant(float x, float y) {
        if (x == 0 && y == 0) {
            System.out.println("位於原點");
        } else if (x > 0 && y > 0) {
            System.out.println("位於位於第一象限");
        } else if (x < 0 && y > 0) {
            System.out.println("位於位於第二象限");
        } else if (x < 0 && y < 0) {
            System.out.println("位於位於第三象限");
        } else if (x > 0 && y < 0) {
            System.out.println("位於位於第四象限");
        }
    }
}
