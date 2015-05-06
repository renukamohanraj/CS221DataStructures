package w2d3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class TestIterator {
	public static void main(String[] args) {
		// Iterator for ArrayList
		 List<String> port = new ArrayList<String>();
		 Collections.addAll(port, "AO", "BR", "CV", "GW", "MO", "MZ", "PT");
		 System.out.println(port);
		 Iterator it1 = port.iterator();
		 System.out.println("it1.next():"+ it1.next());
		 System.out.println("it1.next():"+ it1.next());
		 System.out.println("it1.next():"+ it1.next());
		 System.out.println("it1.next():"+ it1.next());
		 it1.remove();
		 System.out.println(port);
		 System.out.printf("it1.next(): %s%n", it1.next());
		 it1.remove();
		 System.out.println(port);
		 Iterator it2 = port.iterator();
		 while(it2.hasNext()) {
		 System.out.printf("%s ", it2.next());
		  }
		 System.out.println("");
		 System.out.printf("it1.next(): %s%n", it1.next());
		 ArrayList<String> country = new ArrayList<String>();
		 country.add("India");
		 country.add("Canada");
		 country.add("Africa");
		 country.add("Austraslia");
		 System.out.println("Countries : ");
		 for(Iterator it = country.iterator();it.hasNext();)
		 {
			 System.out.print(it.next() + " ");
		 }
	
		 }
}

