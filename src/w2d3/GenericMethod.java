package w2d3;

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

}
