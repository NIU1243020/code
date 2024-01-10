import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        try (Scanner keyin = new Scanner(System.in)) {
            System.out.println("輸入a");
            double a = keyin.nextDouble();
            System.out.println("輸入b");
            double b = keyin.nextDouble();
            System.out.println("輸入c");
            double c = keyin.nextDouble();

            answer(a, b, c);
        }
    }

    public static void answer(double a, double b, double c) {
        
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("x = " + root1 + " , " + root2);
        } else if (discriminant == 0) {
            
            double root = -b / (2 * a);
            System.out.println("x = " + root);
        } else {
            
            System.out.println("無實數解");
        }
    }
}
