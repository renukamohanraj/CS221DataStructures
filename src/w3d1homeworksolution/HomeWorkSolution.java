package w3d1homeworksolution;

import java.util.Arrays;

public class HomeWorkSolution {
	private static String reverse = "";
	static String binary = "";
		public static void main(String[] args) {
			int x[]={5,10,12,15,7,0};
			System.out.println("IsAnagram : " + isAnagram("listen","silnt"));
			System.out.println("Binary Number :" + binaryConverter(7));
			System.out.println("Searching of 12 is : " + search(x,6,12));
			String str = "renuka";
			String  revString = reverseString(str);
			
			if(revString.equals(str)) {
				System.out.println("The string '" + str + "' is pallindrome:");
			}
			else {
				System.out.println("The string '" + str + "' is not pallindrome:");
			}
		 	
		}
		
		//Q.No : 1 
		public static boolean search(int[] x, int size, int n) { 
			 if (size > 0) { 
			 if (x[size-1] == n) { 
			 return true; 
			 } else { 
			 return search(x, size-1, n); 
			 } 
			 } 
			 return false; 
			}
		// Q.No: 2
		public static String binaryConverter(int dec) {
			
			if(dec == 0) {
				return binary;
			}
			else {
				binary = (dec%2) + binary;
				return binaryConverter(dec/2);
			}
		}
		
		//Q.No:3
		public static String reverseString(String str) {
			if(str.length() == 0) {
				return reverse;
			}
			else {
				reverse = reverse + str.charAt(str.length()-1);
				return reverseString(str.substring(0,str.length()-1));
			}
		}

		// Q.No:4
		public static boolean isAnagram(String s1, String s2)
		{
			char word1[] = s1.toLowerCase().toCharArray();
			char word2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(word1);
			Arrays.sort(word2);
			return Arrays.equals(word1, word2);
		}
		
		}
	

