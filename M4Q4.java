class Shape {
    public Shape() {
        // Default constructor
    }

    public void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        // Default constructor
    }

    public void printRectangle() {
        System.out.println("This is a rectangular shape");
    }
}

class Circle extends Shape {
    public Circle() {
        // Default constructor
    }

    public void printCircle() {
        System.out.println("This is a circular shape");
    }
}

class Square extends Rectangle {
    public Square() {
        // Default constructor
    }

    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class M4Q4 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();
        square.printRectangle();
    }
}