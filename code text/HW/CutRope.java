import java.util.Scanner;

public class CutRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float RopeLenght = 1000;
        int CutCount = 0;

        // 每剪一半就加一迴圈程式碼
        while (RopeLenght >= 5) {
            RopeLenght = RopeLenght / 2;
            CutCount = CutCount + 1;
        }

        System.out.println("要剪 " + CutCount + " 次");

        scanner.close();
    }
}
