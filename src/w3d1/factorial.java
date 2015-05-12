package w3d1;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type a Number: ");
		int n = in.nextInt();
		    	
        
		System.out.println("Factorial = " + fact(n));
		
	}
	static int fact(int num) {
	   	if(num == 0 || num == 1)
	 		return 1;
	   	else
	 		return num * fact(num - 1);
	}

}
