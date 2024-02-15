import java.util.Arrays;
import java.util.Scanner;
public class M3Q5
{

    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] A = new int[size];

        System.out.println("Enter " + size + " elements for the  A:");
        for (int i = 0; i < size; i++) 
        {
            A[i] = scan.nextInt();
        }

        // Create a new array and copy elements from A
        int[] B= Arrays.copyOf(A, A.length);

        // Print the copied array
        System.out.println("Copied array elements:");
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}
