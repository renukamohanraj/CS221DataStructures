package w2d3homeworksolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class GenericMethod {
	public static void main(String[] args) {
		args = new String[] { "CA", "US", "MX", "HN", "GT" };
		print(args);
		Integer[] x = new Integer[] { 10, 20, 30, 40, 50 };
		print(x);
		ArrayList<String> stringArray = new ArrayList<String>(Arrays.asList(
				"Hello", "Welcome", "Java", "Object", "Array", "String",
				"Inheritance"));
		display(stringArray);
		Vector<Integer> V = new Vector<Integer>(Arrays.asList(10, 20, 30, 40,
				50));
		display(V);
		// Invoking of countOccurrences method
		String[] text = new String[] { "CA", "US", "MX", "HN", "GT","CA"};
		int count = countOccurrences(text,"CA");
		System.out.println("Number of counts of CA : " + count);
		
		Integer[] it = new Integer[] {10,20,30,10,40,10,60};
		int count1 = countOccurrences(it,10);
		System.out.println("Number of counts of CA : " + count1);
		
	}

	// Generic Method
	static <E> void print(E[] a) {
		for (E ae : a) {
			System.out.printf("%s ", ae);
		}
		System.out.println();
		
	}

	// Wild cards
	static void display(Collection<?> c) {
		for (Object o : c) {
			System.out.printf("%s ", o);
		}
		System.out.println();
	}

	// Count the number of occurrences of give element in the list
	public static <T> int countOccurrences(T[] list, T itemToCount) {
		   int count = 0;
		   if (itemToCount == null) {
		      for ( T listItem : list )
		         if (listItem == null)
		            count++;
		   }
		   else {
		      for ( T listItem : list )
		         if (itemToCount.equals(listItem))
		            count++;
		   }
		   return count;
		}  
	
}
