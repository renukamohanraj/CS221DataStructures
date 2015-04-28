package w1d1homeworksolution;

import java.util.Scanner;

public class Prog2 {
	public static void main(String[] args) {
		double currency = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency value: ");
		currency = sc.nextDouble();
		
		int qty = (int)(currency*100);		
		int dollars = qty/100;
		qty = qty%100;
		int quarters = qty/25;
		qty = qty%25;
		int dimes = qty/10;
		qty = qty%10;
		int nickels = qty/5;
		int pennies = qty%5;
		
		System.out.println("Your amount " + currency + " consists of");
		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
	}


}
