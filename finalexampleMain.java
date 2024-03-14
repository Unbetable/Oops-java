class A {
    final void show() {
        System.out.println("A");
    }
}

class B extends A {
    // Attempting to override final method will result in a compile-time error
    
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // Output: A
    }
}

public class finalexampleMain {
    public static void main(String[] args) {
        // Instantiate B and call its main method
        B.main(args);
    }
}
