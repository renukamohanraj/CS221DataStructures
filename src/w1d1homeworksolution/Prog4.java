package w1d1homeworksolution;

import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		int oddCount = 0;
		int evenCount = 0;
		int zeroCount = 0;
		int temp = num;
		
		while(temp > 0) {
			int a = temp%10;
			temp /= 10;
			if(a == 0) {
				zeroCount++;
			}
			else if(a%2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			
		}
		System.out.println("The inputted number is: " + num);
		System.out.println("Even digits: " + evenCount);
		System.out.println("Odd digits: " + oddCount);
		System.out.println("Zero digits: " + zeroCount);
		
}
}
