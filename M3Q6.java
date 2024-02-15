import java.util.Arrays;
import java.util.Scanner;
public class M3Q6 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        // Sorted array (ascending order)
        int[] sortedArray = {10, 20, 30, 40, 50};

        System.out.print("Enter the element to search: ");
        int key = scan.nextInt();

        // Perform binary search using Arrays.binarySearch()
        int result = Arrays.binarySearch(sortedArray, key);

        if (result >= 0) 
        {
            System.out.println("Element " + key + " found at index " + result);
            
        }
        else 
        {
            System.out.println("Element " + key + " not found in the array.");
        }

    }
}
