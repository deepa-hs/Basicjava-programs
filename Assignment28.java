package basicsprogram;
abstract class Shape {
    abstract double area();
    void displayShape() {
        System.out.println("Calculating area of the shape...");
    }
}
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
}
public class Assignment28 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.displayShape();
        System.out.println("Area of Circle: " + circle.area());

        rectangle.displayShape();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
