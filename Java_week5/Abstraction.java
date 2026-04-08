// Abstract class
abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

// Concrete subclass
class Quadrilateral extends Shape {
    private int length = 10;
    private int breadth = 5;

    @Override
    void calculateArea() {
        System.out.println("Area: " + (length * breadth));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + breadth)));
    }
}

// Main class (must match filename: Abstraction.java)
public class Abstraction {
    public static void main(String[] args) {
        Quadrilateral q = new Quadrilateral();
        q.calculateArea();
        q.calculatePerimeter();
    }
}