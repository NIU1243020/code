import java.util.Scanner;

public class ABDistance {
public static void main(String[] args) {
    Scanner keyin = new Scanner(System.in);
    System.out.print("輸入A座標: ");
    double Ax = keyin.nextDouble();
    double Ay = keyin.nextDouble();

    System.out.print("輸入B座標: ");
    double Bx = keyin.nextDouble();
    double By = keyin.nextDouble();

    float XDistance = (float) (Ax - Bx);
    float YDistance = (float) (Ay - By);
    float Distance = (float)Math.sqrt(XDistance * XDistance + YDistance * YDistance);

    System.out.println("兩點距離: " + Distance);

    keyin.close();
}
}
