public class Example {
    private final int constantValue;

    // Constructor using 'this'
    public Example(int value) {
        this.constantValue = value;
    }

    // Method using 'this'
    public void displayConstant() {
        System.out.println("Constant Value: " + this.constantValue);
    }

    // Finalize method
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalize method called.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        Example example = new Example(42);

        // Calling a method using 'this'
        example.displayConstant();

        // Demonstrating 'finalize'
        System.out.println("Program is about to exit.");
        example = null; // Marking the instance for garbage collection
        System.gc(); // Requesting garbage collection
    }
}
