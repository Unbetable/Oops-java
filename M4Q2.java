class Shape {
    double length;
    double width;
    double height;

    // Constructor with one parameter
    Shape(double length) {
        this.length = length;
        this.height = 1.0; // Default height to 1.0
    }

    // Constructor with two parameters
    Shape(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = 1.0; // Default height to 1.0
    }

    // Method to calculate volume
    void calculate() {
        System.out.println("Volume of Shape: " + (length * width * height));
    }
}

class Test extends Shape {
    // Constructor with one parameter
    Test(double length) {
        super(length);
    }

    // Constructor with two parameters
    Test(double length, double width) {
        super(length, width);
    }

    // Override calculate method to calculate volume
    @Override
    void calculate() {
        System.out.println("Volume of Test: " + (length * width * height));
    }
}

public class M4Q2 {
    public static void main(String[] args) {
        Test m4q2A = new Test(5.0);
        m4q2A.calculate(); // Should print volume based on the constructor

        Test m4q2B = new Test(3.0, 4.0);
        m4q2B.calculate(); // Should print volume based on the constructor
    }
}
