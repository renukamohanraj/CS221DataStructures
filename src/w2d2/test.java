package w2d2;


class Person {
    
    String name;
    Person(String name)
    {
    	 this.name = name;
    }
    
    void talk() {
    
               System.out.print("Hello I am " + name);
                 }
}

public class test {
	@SuppressWarnings("null")
	public static void main(String args[])
	{
		//Array Demonstation
		int arr[] = new int[10];
		System.out.println(arr.length);
		
		// Difference between equals and equal
		Person ob1 = new Person("Ajay");
		Person ob2 = new Person("Ajay");
		Person ob3 = ob2;
		System.out.println(ob1.equals(ob1));
		System.out.println(ob1==ob2);
		System.out.println(ob2==ob3);
		
	}

}
