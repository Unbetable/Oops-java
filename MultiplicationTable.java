import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to display its multiplication table: ");
        int number = scanner.nextInt();

        displayMultiplicationTable(number);

        scanner.close();
    }

    static void displayMultiplicationTable(int number) {
        System.out.println("Multiplication table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}

