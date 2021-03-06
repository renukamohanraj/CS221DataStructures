package w2d3;

public class Stack<T> {
	private int maxSize; // size of stack array
	private T[] stackArray;
	private int top; // top of stack
	// --------------------------------------------------------------

	@SuppressWarnings("unchecked")
	public Stack(int s) // constructor
	{
		maxSize = s; // set array size
		stackArray = (T[])new Object[maxSize]; // create array
		top = -1; // no items yet
	}

	// --------------------------------------------------------------
	public void push(T j) // put item on top of stack
	{
		stackArray[++top] = j; // increment top, insert item
	}

	// --------------------------------------------------------------
	public T pop() // take item from top of stack
	{
		return stackArray[top--]; // access item, decrement top
	}

	// --------------------------------------------------------------
	public T peek() // peek at top of stack
	{
		return stackArray[top];
	}

	// --------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return (top == -1);
	}

	// --------------------------------------------------------------
	public boolean isFull() // true if stack is full
	{
		return (top == maxSize - 1);
	}

}
