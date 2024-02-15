import java.util.Scanner;

public class M3Q2 
{
      public static void main(String[] args)
      {
		  Scanner scan= new Scanner(System.in);
	
		  System.out.println("Enter the size of the square matrices (e.g., 3 for 3x3):");
		  int n = scan.nextInt();
		
	     int[][] a = new int[n][n];
	     int[][] b = new int[n][n];
	     int[][] c = new int[n][n];
		
		 System.out.println("Enter elements of the first matrix row-wise:");
		 for (int i = 0; i < n; i++) 
		 {
		        for (int j = 0; j < n; j++)
		        {
		            a[i][j] =scan.nextInt();
		        }
		  }
	
		 System.out.println("Enter elements of the second matrix row-wise:");
		 for (int i = 0; i < n; i++)
		 {
		      for (int j = 0; j < n; j++) 
		      {
		            b[i][j] = scan.nextInt();
		      }
		  }
	
		  // Multiply matrices
		    for (int i = 0; i < n; i++) 
		    {
		        for (int j = 0; j < n; j++) 
		        {
		            for (int k = 0; k < n; k++) 
		            {
		                c[i][j] += a[i][k] * b[k][j];
		            }
		        }
		    }
	
		    System.out.println("Resultant matrix after multiplication:");
		    
		        for (int i = 0; i < n; i++)
		        {
		            for (int j = 0; j < n; j++) 
		            {
		                System.out.print(c[i][j] + " ");
		            }
		            System.out.println();
		        }
	
		       
		}
 }



