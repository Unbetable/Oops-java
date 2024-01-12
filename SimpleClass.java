import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Sample class to demonstrate various Java concepts
class SampleClass {
    // Static variable
    private static int staticVariable;

    // Instance variable
    private int instanceVariable;

    // Parameterized constructor
    public SampleClass(int value) {
        this.instanceVariable = value;
    }

    // Overloaded constructor
    public SampleClass() {
        this.instanceVariable = 0;
    }

    // Method to demonstrate method overloading
    public void displayValue(int value) {
        System.out.println("Displaying int value: " + value);
    }

    // Overloaded method
    public void displayValue(double value) {
        System.out.println("Displaying double value: " + value);
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Finalize method
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing the SampleClass object.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) throws IOException {
        // Using Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Reading an integer using Scanner
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        // Creating an object using a parameterized constructor
        SampleClass obj1 = new SampleClass(userInput);

        // Displaying the value using method overloading
        obj1.displayValue(userInput);

        // Using auto-boxing and unboxing
        Integer wrappedInt = userInput;  // Auto-boxing
        int unwrappedInt = wrappedInt;   // Auto-unboxing
        System.out.println("Auto-boxing and unboxing: " + unwrappedInt);

        // Using BufferedReader for reading a string
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String userString = br.readLine();

        // Parsing the string to an integer
        try {
            int parsedValue = Integer.parseInt(userString);
            System.out.println("Parsed integer value: " + parsedValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Couldn't parse the string to an integer.");
        }

        // Displaying the string
        System.out.println("Entered string: " + userString);

        // Using static variable
        staticVariable = 10;
        System.out.println("Static variable: " + staticVariable);

        // Using static method
        staticMethod();

        // Returning an object from a method
        SampleClass returnedObj = getObject();
        System.out.println("Returned object value: " + returnedObj.instanceVariable);

        // Demonstrating reference variables
        SampleClass referenceObj = obj1;  // referenceObj now refers to the same object as obj1
        System.out.println("Reference object value: " + referenceObj.instanceVariable);

        // Using finalize method
        obj1 = null;  // Making the object eligible for garbage collection
        System.gc();  // Explicitly requesting garbage collection
    }

    // Method to return an object
    public static SampleClass getObject() {
        return new SampleClass(42);
    }
}
