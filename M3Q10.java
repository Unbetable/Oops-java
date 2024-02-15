import java.util.Arrays;
import java.util.Scanner;

public class M3Q10 
{
	
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] intArray = new int[size];

        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) 
        {
            intArray[i] = scan.nextInt();
        }

        // Convert the integer array to a string
        String intArrayAsString = Arrays.toString(intArray);

        System.out.println("Integer array as a string: " + intArrayAsString);
    }
}



