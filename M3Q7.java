import java.util.Scanner;
public class M3Q7
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		//System.out.println("enter the size of array");
		//int size1=scan.nextInt();
		int size1=5;
		int[] a=new int[size1];
		System.out.println("enter the array elements");
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=scan.nextInt();

		}
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			int isPresent=0;
			for (int k=i;k>=0 ;k-- )
			{
				if (a[i]==a[k])
				{
					isPresent++;
				}
			}
			if (isPresent==1)
			{
				count++;
			}
		}
		int size2=count;
		int [] b=new int[size2];
		int index=0;//second array variable to store
		for (int i=0;i<a.length;i++ )
		{
			int isPresent=0;
			for (int k=i;k>=0 ;k-- )
			{
				if (a[i]==a[k])
				{
					isPresent++;
				}
			}
			if (isPresent==1)
			{
				b[index]=a[i];
				index++;
			}
		}
		System.out.println("After removing  duplicate elements  array is");	
		for (int i=0;i<b.length ;i++ )
		{
			System.out.println(b[i]);
		}
	


	}
}
