import java.util.Scanner;

public class IntegerQuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        solveQuadraticEquation(a, b, c);

        scanner.close();
    }

    static void solveQuadraticEquation(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            int sqrtDiscriminant = (int) Math.sqrt(discriminant);
            int root1 = (-b + sqrtDiscriminant) / (2 * a);
            int root2 = (-b - sqrtDiscriminant) / (2 * a);

            System.out.println("The roots of the quadratic equation are real and distinct:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            int root = -b / (2 * a);

            System.out.println("The root of the quadratic equation is real and equal:");
            System.out.println("Root: " + root);
        } else {
            System.out.println("The roots of the quadratic equation are complex and imaginary.");
        }
    }
}
