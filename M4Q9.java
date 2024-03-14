class Fibonacci {
    private int n1, n2, n3, count;

    // constructor to initialize the data members
    public Fibonacci(int n1, int n2, int count) {
        this.n1 = n1;
        this.n2 = n2;
        this.count = count;
    }

    // method to generate Fibonacci series
    public void generateFibonacciSeries() {
        System.out.print(n1 + " " + n2 + " "); // print the first two numbers

        for (int i = 3; i <= count; i++) {
            n3 = n1 + n2; // calculate the next number
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}

// main class to test the Fibonacci class
public class M4Q9 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(0, 1, 10); // create an object of Fibonacci class with initial values and count
        fib.generateFibonacciSeries(); // call the generateFibonacciSeries method
    }
}