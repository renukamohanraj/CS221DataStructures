package w1d4homeworksolution;

////////////////////////////////////////////////////////////////
class StackX
{
private int maxSize;        // size of stack array
private long[] stackArray;
private int top;            // top of stack
//--------------------------------------------------------------
public StackX(int s)         // constructor
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
/*public void push(long j) // put item on top of stack
{
if( !isFull() )
stackArray[++top] = j; 
else
System.out.print("Can’t insert, stack is full");
}*/

//--------------------------------------------------------------
public long pop()           // take item from top of stack
{
return stackArray[top--];  // access item, decrement top
}
/*public long pop() // take item from top of stack
{
if(!isEmpty())
return stackArray[top--]; // access item, decrement top
else 
System.out.print("Can’t Delete, stack is empty");
return maxSize;
}*/

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
public int size()
{
	return top+1;
}
public int get(int x)
{
	return (int) stackArray[x];
}
public void display()
{
	System.out.println();
	for(int i=0;i<size();i++)
		System.out.print(get(i) + " ");
}
//--------------------------------------------------------------
}  // end class StackX 
////////////////////////////////////////////////////////////////
class StackAppHomeWork
{
	public static StackX merge(StackX s1, StackX s2)
	{
		int i;
		int tsize = s1.size()+s2.size();
		StackX s3 = new StackX(tsize);
		for (i=0;i<s1.size();i++)
			s3.push(s1.get(i));
		
		for (int j=0;j<s2.size();j++)
			s3.push(s2.get(j));
		
		return s3;
	}
public static void main(String[] args)
{
StackX theStack = new StackX(10);  // make new stack
theStack.push(20);               // push items onto stack
theStack.push(40);
theStack.push(60);
theStack.push(80);
theStack.push(100);
System.out.println("Size of the stack : " + theStack.size());
theStack.display();
StackX theStack1 = new StackX(10);
theStack1.push(25);               // push items onto stack
theStack1.push(45);
theStack1.push(65);
theStack1.push(85);
theStack1.push(105);
System.out.println("\nSize of the stack : " + theStack1.size());
theStack1.display();
StackX mergeStack = new StackX(50);
mergeStack= merge(theStack,theStack1);
System.out.println("\nSize of the stack : " + mergeStack.size());
mergeStack.display();

/*while(!theStack.isEmpty())     // until it's empty,
{                             // delete item from stack
long value = theStack.pop();
System.out.print(value);      // display it
System.out.print(" ");
}  // end while
System.out.println("");
//theStack.pop();*/


}  // end main()

}  // end class StackAppHomeWork
////////////////////////////////////////////////////////////////
