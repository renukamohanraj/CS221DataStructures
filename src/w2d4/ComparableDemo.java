package w2d4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Elephant implements Comparable
{
	public float weight;
	public int age;
	Elephant(float weight, int age)
	{
		this.weight = weight;
		this.age = age;
	}
	// Sort by Ascending order
	public int compareTo(Object obj)
	{
		Elephant AObj = (Elephant)obj;
		if (this.age > AObj.age) 
		return 1;
		else 
			if (this.age < AObj.age) 
				return -1;
			else 
				return 0;
	}
	// Sort by Reverse order
	/*public int compareTo(Object obj)
	{
		Elephant AObj = (Elephant)obj;
		return Integer.compare( AObj.age,this.age);
	}*/
	//return Integer.compare(item.value, this.value);
}

public class ComparableDemo {
	
	public static void main(String[] args) {
		ArrayList <Elephant> list = new ArrayList<Elephant>();
		list.add(new Elephant(156.90f, 20));
		list.add(new Elephant(166.90f, 15));
		list.add(new Elephant(146.90f, 18));
		
		// Sort for ArrayList Elephant objects
		Collections.sort(list);
		System.out.println("Sorted List using age : ");
		for(Elephant obj : list)
			System.out.println(obj.age);
		
		// Sort for Array of Elephant objects
		Elephant[] obj = {new Elephant(156.90f, 22), new Elephant(166.90f, 17), new Elephant(146.90f, 20)};
	
		System.out.println("Sorted List using age : ");
		Arrays.sort(obj);
		for(Elephant ob : obj)
			System.out.println(ob.age);

	}

}