package w3d3solutionpack;

import java.util.TreeSet;

class Vehicle implements Comparable{
    String name;
    double price;
    String model;

    public Vehicle(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }
    
    public String toString(){
        return "\nVehicle Name: " + name + ", \tModel: " + model + ", \tPrice: " + price;
    }

    public int compareTo(Object o) {
        Vehicle v = (Vehicle) o;
        return Double.compare(this.price, v.price);
    }
}
public class VechicleBST {

	public static void main(String[] args) {
		 TreeSet<Vehicle> obj = new TreeSet<Vehicle>();
		 obj.add(new Vehicle("TVSScooty", 1000, "2015"));  
		 obj.add(new Vehicle("Rodeo" , 1500, "2014" ));
		 obj.add(new Vehicle("Bajaj" , 1300, "2015" ));
		 obj.add(new Vehicle("Honda" , 900, "2014" ));
		 
	        System.out.println(obj);

	}

}
