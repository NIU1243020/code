import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // 創建一個Scanner用在從使用者輸入獲取三角形邊長
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入第一個數(a)");
        float a = scanner.nextFloat();

        System.out.print("請輸入第二個數(b)");
        float b = scanner.nextFloat();

        System.out.println("請輸入第一個數(c)");
        float c = scanner.nextFloat();

        // 判斷短邊相加是否會大於長邊
        if ( (a + b > c) && (a + c > b) && (b+ c > a) ) {
            System.out.println("構成三角形");
        } else {
            System.out.println("不構成三角形");
        }
        scanner.close();
    }
}
