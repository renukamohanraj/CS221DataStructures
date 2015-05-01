package w1d4stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class StackX4
{
private int maxSize;
private int[] stackArray;
private int top;
//--------------------------------------------------------------
public StackX4(int size)      // constructor
   {
   maxSize = size;
   stackArray = new int[maxSize];
   top = -1;
   }
//--------------------------------------------------------------
public void push(int j)     // put item on top of stack
   { stackArray[++top] = j; }
//-------------------------------------------------------------
public int pop()            // take item from top of stack
   { return stackArray[top--]; }
//--------------------------------------------------------------
public int peek()           // peek at top of stack
   { return stackArray[top]; }
//--------------------------------------------------------------
public boolean isEmpty()    // true if stack is empty
   { return (top == -1); }
//--------------------------------------------------------------
public boolean isFull()     // true if stack is full
   { return (top == maxSize-1); }
//--------------------------------------------------------------
public int size()           // return size
   { return top+1; }
//--------------------------------------------------------------
public int peekN(int n)     // peek at index n
   { return stackArray[n]; }
//--------------------------------------------------------------
public void displayStack(String s)
   {
   System.out.print(s);
   System.out.print("Stack (bottom-->top): ");
   for(int j=0; j<size(); j++)
      {
      System.out.print( peekN(j) );
      System.out.print(' ');
      }
   System.out.println("");
   }
//--------------------------------------------------------------
}  // end class StackX
class ParsePost
{
private StackX4 theStack;
private String input;
//--------------------------------------------------------------
public ParsePost(String s)
   { input = s; }
//--------------------------------------------------------------
public int doParse()
   {
   theStack = new StackX4(20);             // make new stack
   char ch;
   int j;
   int num1, num2, interAns;

   for(j=0; j<input.length(); j++)       // for each char,
      {
      ch = input.charAt(j);              // read from input
      theStack.displayStack(""+ch+" ");  // *diagnostic*
      if(ch >= '0' && ch <= '9')         // if it's a number
         theStack.push((int)(ch-'0') ); //   push it
      else                               // it's an operator
         {
         num2 = theStack.pop();          // pop operands
         num1 = theStack.pop();
         switch(ch)                      // do arithmetic
            {
            case '+':
               interAns = num1 + num2;
               break;
            case '-':
               interAns = num1 - num2;
               break;
            case '*':
               interAns = num1 * num2;
               break;
            case '/':
               interAns = num1 / num2;
               break;
            default:
               interAns = 0;
            }  // end switch
         theStack.push(interAns);        // push result
         }  // end else
      }  // end for
   interAns = theStack.pop();            // get answer
   return interAns;
   }  // end doParse()
}  // end class ParsePost
public class PostFixEvaluation {
	public static void main(String[] args) throws IOException
    {
    String input;
    int output;

    while(true)
       {
       System.out.print("Enter postfix: ");
       Scanner in = new Scanner(System.in);
		input = in.next(); // read a string from console       // read a string from console
       if( input.equals("quit") )       // quit if [Enter]
          break;
                                    // make a parser
       ParsePost aParser = new ParsePost(input);
       output = aParser.doParse();  // do the evaluation
       System.out.println("Evaluates to " + output);
       }  // end while
    }  // end main()
//--------------------------------------------------------------
 }
