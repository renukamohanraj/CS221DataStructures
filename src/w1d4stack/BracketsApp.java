package w1d4stack;

import java.io.*;                 // for I/O
import java.util.Scanner;
////////////////////////////////////////////////////////////////
class StackX2
{
private int maxSize;
private char[] stackArray;
private int top;
//--------------------------------------------------------------
public StackX2(int s)       // constructor
{
maxSize = s;
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
public boolean isEmpty()    // true if stack is empty
{
return (top == -1);
}
//--------------------------------------------------------------
}  // end class StackX
////////////////////////////////////////////////////////////////
class BracketChecker
{
private String input;                   // input string
//--------------------------------------------------------------
public BracketChecker(String in)        // constructor
{ input = in; }
//--------------------------------------------------------------
public void check()
{
int stackSize = input.length();      // get max stack size
StackX2 theStack = new StackX2(stackSize);  // make stack

for(int j=0; j<input.length(); j++)  // get chars in turn
{
char ch = input.charAt(j);        // get char
switch(ch)
{
case '{':                      // opening symbols
case '[':
case '(':
theStack.push(ch);          // push them
break; // come out from the switch

case '}':                      // closing symbols
case ']':
case ')':
if( !theStack.isEmpty() )   // if stack not empty,
{
char chx = theStack.pop();  // pop and check
if( (ch=='}' && chx!='{') ||
(ch==']' && chx!='[') ||
(ch==')' && chx!='(') )
System.out.println("Error: "+ch+" Mismatching delimiter at "+j);
}
else                        // if stack is prematurely empty and still you have closing delimiter
System.out.println("Error: "+ch+" at "+j);
break;
default:    // no action on other characters
break; // come out from the switch for non-delimiter character
}  // end switch
}  // end for
// at this point, all characters have been processed
if( !theStack.isEmpty() )
System.out.println("Error: missing right delimiter");
}  // end check()
//--------------------------------------------------------------
}  // end class BracketChecker
////////////////////////////////////////////////////////////////
class BracketsApp
{
public static void main(String[] args) throws IOException
{
String input;
while(true)
{
System.out.print("Enter string containing delimiters: ");
Scanner in = new Scanner(System.in);
input = in.next();   // read a string from keyboard
if( input.equals("quit") )   // quit if [Enter]
break;
// make a BracketChecker
BracketChecker theChecker = new BracketChecker(input);
theChecker.check();      // check brackets
}  // end while
System.out.println("Quit");
}  // end main()
//--------------------------------------------------------------
}  // end class BracketsApp
////////////////////////////////////////////////////////////////
