package basicsprogram;
import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Circumference: " + circleCircumference);
        System.out.println("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
        System.out.println("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = 0.5 * base * height;

        System.out.println("Enter the three sides of the triangle (a b c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double trianglePerimeter = a + b + c;

        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Triangle Perimeter: " + trianglePerimeter);

        scanner.close();
    }
}

	