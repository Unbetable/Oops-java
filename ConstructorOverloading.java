public class ConstructorOverloading {

    // Default constructor
    public ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    // Constructor with one parameter
    public ConstructorOverloading(int x) {
        System.out.println("Parameterized Constructor with one parameter: " + x);
    }

    // Constructor with two parameters
    public ConstructorOverloading(int x, int y) {
        System.out.println("Parameterized Constructor with two parameters: " + x + ", " + y);
    }

    public static void main(String[] args) {
        // Creating instances with different constructors
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading(20, 30);
    }
}
