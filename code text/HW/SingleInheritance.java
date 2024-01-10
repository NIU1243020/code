import java.util.Scanner;

public class SingleInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("長:");
        double length = scanner.nextDouble();

        System.out.println("寬:");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.ComputeArea(rectangle.length, rectangle.width);

        System.out.println("面積: " + rectangle.area);
    }
}

class Shape {
    public double area;
    public double ComputeArea(double length, double width) {
        area = length * width;
        return area;

    //public abstract void ComputeArea(length, width);
}

class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

}

}