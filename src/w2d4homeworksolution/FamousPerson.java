package w2d4homeworksolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FamousPerson {
	private String firstname;
	private String lastname;
	private int age;
	private ArrayList<Car> cars = new ArrayList<Car>();

	public FamousPerson(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean addCar(Car car) {
		boolean result = cars.add(car);
		return result;
	}

	public boolean removeCar(Car car) {
		boolean result = cars.remove(car);
		return result;
	}
	
	public void carsByYear() {
		Comparator<Car> yearComparator = new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o1.getYear() - o2.getYear();
			}
		};
		Collections.sort(cars, yearComparator);
		System.out.println(cars.toString());
	}
	
	public void carsByMake() {
		Comparator<Car> makeComparator = new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o1.getMake().compareTo(o2.getMake());
			}
		};
		Collections.sort(cars, makeComparator);
		System.out.println(cars.toString());
	}
	
	public void carsByModel() {
		Comparator<Car> modelComparator = new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o1.getModel().compareTo(o2.getModel());
			}
		};
		Collections.sort(cars, modelComparator);
		System.out.println(cars.toString());
	}
	
	public void carsByColor() {
		Comparator<Car> colorComparator = new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o1.getColor().compareTo(o2.getColor());
			}
		};
		Collections.sort(cars, colorComparator);
		System.out.println(cars.toString());
	}
}
