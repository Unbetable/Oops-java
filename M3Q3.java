import java.util.Scanner;
public class M3Q3
{
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++)
        {
            array[i] = scan.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < n; i++) 
        {
            if (array[i] < min) 
            {
                min = array[i];
            }
            if (array[i] > max) 
            {
                max = array[i];
            }
        }

        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);

        
    }
}


