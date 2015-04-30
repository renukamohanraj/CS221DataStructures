package w1d4stack;

////////////////////////////////////////////////////////////////
class StackY
{
private int maxSize;        // size of stack array
private long[] stackArray;
private int top;            // top of stack
//--------------------------------------------------------------
public StackY(int s)         // constructor
{
maxSize = s;             // set array size
stackArray = new long[maxSize];  // create array
top = -1;                // no items yet
}

//--------------------------------------------------------------
public void push(long j)    // put item on top of stack
{
stackArray[++top] = j;     // increment top, insert item
}

//--------------------------------------------------------------
public long pop()           // take item from top of stack
{
return stackArray[top--];  // access item, decrement top
}

//--------------------------------------------------------------
public long peek()          // peek at top of stack
{
return stackArray[top];
}
//--------------------------------------------------------------
public boolean isEmpty()    // true if stack is empty
{
return (top == -1);
}
//--------------------------------------------------------------
public boolean isFull()     // true if stack is full
{
return (top == maxSize-1);
}

public String toString()
{
   String out = "";	
	for (int i=top; i>=0;i--)
		out = out + stackArray[i] + " ";
		
	return "[ " + out + "]";
}

//--------------------------------------------------------------
}  // end class StackX 
////////////////////////////////////////////////////////////////
class StackApp
{
	
public static void main(String[] args)
{
StackY theStack = new StackY(10);  // make new stack
theStack.push(20);               // push items onto stack
theStack.push(40);
theStack.push(60);
theStack.push(80);
theStack.push(100);
while(!theStack.isEmpty())     // until it's empty,
{                             // delete item from stack
long value = theStack.pop();
System.out.print(value);      // display it
System.out.print(" ");
}  // end while
System.out.println("");
//theStack.pop();

StackY theStack1 = new StackY(10);
theStack1.push(25);               // push items onto stack
theStack1.push(45);
theStack1.push(65);
theStack1.push(85);
theStack1.push(105);

System.out.println(theStack1);

}  // end main()

}  // end class StackApp
////////////////////////////////////////////////////////////////
