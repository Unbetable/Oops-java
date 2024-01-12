import java.util.Scanner;

public class M2Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        displaySum(num1, num2);
        displayDifference(num1, num2);
        displayProduct(num1, num2);
        displayQuotient(num1, num2);
    }

    static void displaySum(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    static void displayDifference(double a, double b) {
        System.out.println("Difference: " + (a - b));
    }

    static void displayProduct(double a, double b) {
        System.out.println("Product: " + (a * b));
    }

    static void displayQuotient(double a, double b) {
        // Check if the second number is not zero before performing division
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
