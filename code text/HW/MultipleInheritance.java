public class MultipleInheritance {
    static public void main(String[] args) {
        Cube cube = new Cube(10, 5, 3);
        System.out.println("Volume: " + cube.ComputeVolume(cube.length, cube.width, cube.height));
    }
}
    
class Shape {
    public int area;
    public int ComputeArea(int length, int width) {
        area = length * width;
        return area;
    }

}
    
class Rectangle extends Shape {
    public int length;
    public int width;

    public Rectangle(double length2, double width2) {
    }

}
    
class Cube extends Rectangle {
    public Cube(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int height;
    public int ComputeVolume(int length, int width, int height) {
        return length * width * height;
    }

}
