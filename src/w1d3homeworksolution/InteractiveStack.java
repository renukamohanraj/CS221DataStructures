package w1d3homeworksolution;

import java.util.Scanner;

public class InteractiveStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack(10);

		System.out.println("Your options are:");
		System.out.println("push: put something on top of the stack");
		System.out.println("pop: remove the item at the top of the stack");
		System.out.println("peek: look at the item at the top of the stack");
		System.out.println("\nPlease type push, pop, or peek:");

		String line = null;
		while (sc.hasNext()) {
			line = sc.nextLine();
			line = line.toLowerCase();

			if (line.startsWith("push")) {
				if (stack.isFull()) {
					System.out.println("Stack is full, can't push");
				} else {
					System.out.print("please enter the number to push: ");
					stack.push(sc.nextLong());
					sc.nextLine(); // remove the remaining newline 
				}
			} else if (line.startsWith("pop")) {
				if (stack.isEmpty()) {
					System.out.println("Stack is empty, noting to pop");
				} else {
					System.out.println(stack.pop());
				}
			} else if (line.startsWith("peek")) {
				if (stack.isEmpty()) {
					System.out.println("Stack is empty, noting to peek");
				} else {
					System.out.println(stack.peek());
				}
			} else {
				System.out.println("End");
				break;
			}
			System.out.println("\nPlease type push, pop, or peek:");

		}
	}

}
