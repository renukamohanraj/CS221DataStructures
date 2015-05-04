package w2d1;

class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
	}
	public String toString()
	{
		String value = "";
		return value + this.data + "  ";
	}
}

public class SampleSLL {
	public static void main(String args[]) {
    Node start = new Node(5); // First Node
    System.out.println("Start Node : " + start);
    Node current = start;
    for(int i=0;i<5;i++) // Creation of Multiple nodes using loop
    {
    	current.next = new Node(10 + (i*i));
    	current = current.next;
    }
    current = start;
    while(current!=null) // Display the values of all the nodes
    {
    	 System.out.println(current);
    	 current = current.next;
    }
 // Searching of a node in the list
    int sKey = 26;
	current = start;
	boolean status = false;
	for(current=start; current!=null; current=current.next)
	{
		if(current.data==sKey){
			status = true;
			break;
		}
			
	}
	if(!status){
		System.out.println("Search Key not is found");
	}
	else{
		System.out.println("Search Key is found");
	}
	// Deletion of a node
	int delNode = 5;
	Node previous=null;
	for(current=start; current!=null; previous = current,current=current.next)
	{
		if(current.data==delNode){
			if(current == start)
			{
				start = start.next;
			}
			else{
				previous.next = current.next;
			}
		}
			
	}
	current = start;
    while(current!=null) // Display the values of all the nodes
    {
    	 System.out.println(current);
    	 current = current.next;
    }
	}
    	    
}
