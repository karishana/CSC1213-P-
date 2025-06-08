class Calculator {
    public final double PI = 3.14;

    public int add(int a, int b) {
        return a + b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
 class AdvancedCalculator extends Calculator {
    public int add(int a, int b) {
        return super.add(a,b) + 10;
    }
}
abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + Calculator.subtract(10, 4));
		// System.out.println("Multiply: "+calc.multiply(3, 4));
        System.out.println("PI: " + calc.PI);

        Shape circle = new Circle(2.5);
        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}
