import java.util.Scanner;

public class NumberRhombus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = scanner.nextInt();

        displayNumberRhombus(n);

        scanner.close();
    }

    static void displayNumberRhombus(int n) {
       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
          
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}
