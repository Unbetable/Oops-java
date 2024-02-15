import java.util.Scanner;
public class M3Q8 
{
	 public static void main(String[] args)
	 {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scan.nextInt();

	        int[] a= new int[size];

	        System.out.println("Enter " + size + " elements for the array:");
	        for (int i = 0; i < size; i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        // Reverse the array in-place
	        int i = 0;
	        int j= size - 1;
	        while (i< j) {
	            // Swap the values
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;

	            // Move indices towards the center
	            i++;
	            j--;
	        }

	        System.out.println("Reversed array:");
	        for (int num : a) 
	        {
	            System.out.print(num + " ");
	        }

	   }
}



