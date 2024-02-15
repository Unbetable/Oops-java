import java.util.Scanner;
public class M3Q4 
{

    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scan.nextInt();

        // Create an array of arrays (jagged array)
        int[][] irregularArray = new int[numRows][];

        // Input elements for each row
        for (int i = 0; i < numRows; i++) 
        {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int numCols = scan.nextInt();
            irregularArray[i] = new int[numCols];

            System.out.println("Enter " + numCols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < numCols; j++)
            {
                irregularArray[i][j] = scan.nextInt();
            }
        }

        // Print the irregular array
        System.out.println("The irregular array is:");
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < irregularArray[i].length; j++) 
            {
                System.out.print(irregularArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        
    }

}
