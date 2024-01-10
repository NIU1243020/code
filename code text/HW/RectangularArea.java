public class RectangularArea {
    public static void main(String[] args) {
        // 宣告兩個資料型態為Shape的物件變數
        new Shape(3);

        // 利用物件變數 rectangle，分別求長=4,寬=5的長方形面積
        new Shape(4, 5);
    }
}

class Shape {
    // 定義建構子1: 計算正方形面積
    Shape(int side) {
        System.out.println("正方形的面積: " + (side * side));
    }

    // 定義建構子2: 計算長方形面積
    Shape(int length, int width) {
        System.out.println("長方形的面積: " + (length * width));
    }
}
