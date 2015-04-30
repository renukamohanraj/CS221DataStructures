package w1d4stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class StackX1
{
private int maxSize;
private char[] stackArray;
private int top;
//--------------------------------------------------------------
public StackX1(int max)    // constructor
   {
   maxSize = max;
   stackArray = new char[maxSize];
   top = -1;
   }
//--------------------------------------------------------------
public void push(char j)  // put item on top of stack
   {
   stackArray[++top] = j;
   }
//--------------------------------------------------------------
public char pop()         // take item from top of stack
   {
   return stackArray[top--];
   }
//--------------------------------------------------------------
public char peek()        // peek at top of stack
   {
   return stackArray[top];
   }
//--------------------------------------------------------------
public boolean isEmpty()  // true if stack is empty
   {
   return (top == -1);
   }
//--------------------------------------------------------------
}  // end class StackX
////////////////////////////////////////////////////////////////
class Reverser
{
private String input;                // input string
private String output;               // output string
//--------------------------------------------------------------
public Reverser(String in)           // constructor
   { input = in; }
//--------------------------------------------------------------
public String doRev()                // reverse the string
   {
   int stackSize = input.length();   // get max stack size
   StackX1 theStack = new StackX1(stackSize);  // make stack

   for(int j=0; j<input.length(); j++)
      {
      char ch = input.charAt(j);     // get a char from input
      theStack.push(ch);             // push it
      }
   output = "";
   while( !theStack.isEmpty() )
      {
      char ch = theStack.pop();      // pop a char,
      output = output + ch;          // append to output
      }
   System.out.println("Is Palindrome : " + input.equals(output));
   return output;
   }  // end doRev()
//--------------------------------------------------------------
}  // end class Reverser
////////////////////////////////////////////////////////////////
class ReverseApp
{
public static void main(String[] args) throws IOException
   {
   String input, output;
   while(true)
      {
     Scanner in = new Scanner(System.in);
	   System.out.print("Enter a string: ");
       input = in.next();          // read a string from kbd
      if( input.equals("quit") )        // quit if [Enter]
         break;
                                    // make a Reverser
      Reverser theReverser = new Reverser(input);
      output = theReverser.doRev(); // use it
      System.out.println("Reversed: " + output);
      }  // end while
   System.out.println("Quit");
   }  // end main()
//--------------------------------------------------------------
}  // end class ReverseApp
////////////////////////////////////////////////////////////////