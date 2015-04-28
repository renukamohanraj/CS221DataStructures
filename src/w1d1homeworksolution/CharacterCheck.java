package w1d1homeworksolution;

import java.util.Scanner;

public final class CharacterCheck {
	public static void main (String[] args)
	{

		char characterFound;

		Scanner scanedInfo = new Scanner(System.in);

		System.out.print("Input a character : ");
		System.out.flush();
		characterFound = scanedInfo.next().charAt(0);
		System.out.println();

		if(characterFound >= 'A' && characterFound <= 'Z')
		   System.out.println("The character found is uppercase.");

		if(characterFound >= 'a' && characterFound <= 'z')
		   System.out.println("The character found is lowercase.");
		
		if ((int)characterFound >=48 && (int)characterFound <=57)
			System.out.println("The character found is Number.");
		
		if((int)characterFound >=32 && (int)characterFound <=47)
			System.out.println("The character found is Special Character.");

		System.out.println("Good Bye!");
       
	}
}
