package w1d1homeworksolution;

import java.util.Scanner;

class DigitalCamera {
	private String brand_name;
	private int megaPixel;
	private int price;

public DigitalCamera(String brand_name, int megaPixel) {
	this.brand_name = brand_name;
	if(megaPixel > 10)
		this.megaPixel = 10;
	else 
		this.megaPixel = megaPixel;
	
	if(megaPixel <= 6) 
		this.price = 99;
	else
		this.price = 129;
}

public void showCameraDetails() {
	System.out.println("======================");
	System.out.println("Brand Name: " + this.brand_name);
	System.out.println("Megapixel: " + this.megaPixel);
	System.out.println("Price: $" + this.price + "\n");
}

}

public class TestDigitalCamera {
public static void main(String[] args) {
		
		DigitalCamera[] dg = new DigitalCamera[4];
		for(int i = 0; i < 4; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Camera" + (i+1) + " Brand:");
			String bName = sc.nextLine();			
			System.out.println("Enter The Camera" + (i+1) + " Megapixel:");
			int mPixel = sc.nextInt();
			dg[i] = new DigitalCamera(bName, mPixel);
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println("\nThe Camera" + (i+1) + " Details is:");
			dg[i].showCameraDetails();
		}
	}

}
