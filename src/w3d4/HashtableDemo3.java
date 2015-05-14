package w3d4;
import java.util.*;
public class HashtableDemo3 {

	public static void main(String[] args) {
		 
		 Hashtable<Integer,Empl> tm = new Hashtable<Integer,Empl>();
		 tm.put(1, new Empl("Ramu",3000));
		 tm.put(5, new Empl("Jony",6000));
		 tm.put(3, new Empl("Crish",2000));
		 tm.put(4, new Empl("Tom",2400));
	        System.out.println("Hashtable entries:");
	       Set<Integer> keys = tm.keySet();
	        for(Integer key:keys){
	            System.out.println(key+" ==> "+tm.get(key));
	        }
      
		      
	}

}
class Empl{
    
    private String name;
    private int salary;
    
     
    public Empl(String n, int s){
        
        this.name = n;
        this.salary = s;
    }
    public String toString() {
    	return  "\n" + name + "\n" + salary + "\n"; 
     	}
}
