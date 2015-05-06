package javacollectionframework.arraylist;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Array1 {
            // Demo code to sort the elements
		public static void main(String[] args) {
			ArrayList<String> stringArray = new ArrayList<String>(
		    Arrays.asList("Hello", "Welcome", "Java", "Object", "Array", "10", "Inheritance"));
			System.out.println("****** Unsorted String Array *******");
			//Sort array in ascending order
			System.out.println(stringArray);
					
			System.out.println("****** Sorted String Array *******");
			Collections.sort(stringArray);
			System.out.println(stringArray);
			    
			  //Sort array in reverse order
			  Collections.sort(stringArray,Collections.reverseOrder());
			   System.out.println("****** Reverse Sorted String Array *******");
			   System.out.println(stringArray);
			   //ArrayList<Integer> 
			   	   
			   
			
	}

}
