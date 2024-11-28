// Abstract class Shape
abstract class Shape {
    // Two integer fields for dimensions
    int dimension1, dimension2;

    // Constructor to initialize the dimensions
    Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Abstract method to print the area
    abstract void printArea();
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    
    // Constructor to initialize rectangle dimensions
    Rectangle(int length, int width) {
        super(length, width); // Calling parent class constructor
    }

    // Implementing printArea() for Rectangle
    @Override
    void printArea() {
        int area = dimension1 * dimension2;  // Area of rectangle (length * width)
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class extends Shape
class Triangle extends Shape {
    
    // Constructor to initialize triangle dimensions
    Triangle(int base, int height) {
        super(base, height); // Calling parent class constructor
    }

    // Implementing printArea() for Triangle
    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2; // Area of triangle (0.5 * base * height)
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class extends Shape
class Circle extends Shape {
    
    // Constructor to initialize circle radius (dimension2 is not used)
    Circle(int radius) {
        super(radius, 0); // Calling parent class constructor with only radius
    }

    // Implementing printArea() for Circle
    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1; // Area of circle (π * radius^2)
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating objects for different shapes
        Shape rectangle = new Rectangle(5, 10); // Length=5, Width=10
        Shape triangle = new Triangle(6, 8);   // Base=6, Height=8
        Shape circle = new Circle(7);           // Radius=7

        // Calling printArea() for each shape
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
