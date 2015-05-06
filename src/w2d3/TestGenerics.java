package w2d3;

import java.util.ArrayList;

public class TestGenerics {
	// Generic Types
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>(10); // It holds only Integer Value
		Stack<Object> stk = new Stack<Object>(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		System.out.println("Peek Element : " + s.peek());
		stk.push("Hello");
	    stk.push(10);
	    Stack<String> x = new Stack<String>(10); 
	}

}
