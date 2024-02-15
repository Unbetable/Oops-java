
import java.util.ArrayList;
import java.util.Collections;

public class M3Q1 
{
	public static void main(String[] args) 
	{
	        // Create a list of names
	        ArrayList<String> names = new ArrayList<String>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("ECharlie");
	        names.add("David");
	        names.add("CEve");

	        // Sort the list in ascending order
	        Collections.sort(names);

	        // Print the sorted names
	        System.out.println("Sorted Names (Ascending Order):");
	        for (String people : names) 
	        {
	            System.out.println(people);
	        }
	  }
}
