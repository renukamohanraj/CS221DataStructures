package w1d5queue;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo {

		public static void main(String[] args) {
			// FIFO Queue
			Queue<String> queue = new LinkedList<String>();
			queue.offer("Java");
	        queue.offer("DotNet");
	        queue.offer("PHP");
	        queue.offer("HTML");
	        System.out.println("Top Element: " + queue.element()); 
	        System.out.println("Queue: " + queue); 
	        	        
	       System.out.println("remove: " + queue.remove());
	       	     	       	       
	        System.out.println("Top Element: " + queue.element());
	        System.out.println("poll: " + queue.poll());
	         System.out.println("Remove : " + queue.remove());
	        System.out.println("Top Element: " + queue.peek());
	        System.out.println("Queue: " + queue); 
	        queue.removeAll(queue);
	        System.out.println(queue.size());
	        System.out.println("Top Element: " + queue.peek());// return null
	        //System.out.println("Top Element: " + queue.element());// Throw NoSuchElement Exception
	        
	        Deque<Integer> deque = new LinkedList<Integer>();
	        deque.offerFirst(10);
	        deque.offerLast(10);
	        deque.offerFirst(5);
	        deque.offerLast(25);
	        System.out.println("DQueue List :" + deque);
	        System.out.println("Removed from first:" + deque.removeFirst());
	        System.out.println("Removed from Last :"+ deque.removeLast());
	       
		}

}
