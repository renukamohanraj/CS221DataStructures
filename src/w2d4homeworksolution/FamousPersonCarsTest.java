package w2d4homeworksolution;

public class FamousPersonCarsTest {

	public static void main(String[] args) {
		FamousPerson fp = new FamousPerson("Borat", "Chatizkan", 35);
		fp.addCar(new Car("Lada", "L1", 1975, "Yellow"));
		fp.addCar(new Car("Wheelbarrel", "Good", 1992, "Green"));
		fp.addCar(new Car("HorseCart", "Billow", 1980, "Brown"));
		fp.addCar(new Car("HorseSeld", "Asumat", 1985, "Metal"));
		
		fp.carsByYear();
		fp.carsByMake();
		fp.carsByModel();
		fp.carsByColor();
	}

}
