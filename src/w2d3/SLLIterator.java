package w2d3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
  A linked list is a sequence of nodes with efficient
element insertion and removal. This class 
   contains a subset of the methods of the standard
   java.util.LinkedList class.
*/
class LinkedList
{  
   /** 
     Constructs an empty linked list.
   */
	private class Node
	   {  
	      public Object data;
	      public Node next;
	  }
	private Node first;
  public LinkedList()
  {  
      first = null;
   }
 
   /**
      Returns the first element in the linked list.
     @return the first element in the linked list
   */
   public Object getFirst()
  {  
      if (first == null) 
         throw new NoSuchElementException();
     return first.data;
   }

   /**
     Removes the first element in the linked list.
      @return the removed element
   */
  public Object removeFirst()
   {  
     if (first == null) 
         throw new NoSuchElementException();
      Object element = first.data;
     first = first.next;
    return element;
   }

   /**
      Adds an element to the front of the linked list.
      @param element the element to add
  */
   public void addFirst(Object element)
   {  
      Node newNode = new Node();
      newNode.data = element;
      newNode.next = first;
      first = newNode;
  }
   
   /**
    Returns an iterator for iterating through this list.
      @return an iterator for iterating through this list
   */
   ListIterator listIterator()
   {  
     return  new LinkedListIterator();
   }
  
   // Implementation of ListIterator
  private class LinkedListIterator implements ListIterator
   {  
     /**
        Constructs an iterator that points to the front
         of the linked list.
     */
	  private Node position;
      private Node previous;
      public LinkedListIterator()
      {  
        position = null;
        previous = null;
      }
      
     /**
        Moves the iterator past the next element.
        @return the traversed element
      */
      public Object next()
     {  
       if (!hasNext())
            throw new NoSuchElementException();
        previous = position; // Remember for remove

       if (position == null)
            position = first;
         else
            position = position.next;

        return position.data;
      }
     
      /**
        Tests if there is an element after the iterator 
        position.
         @return true if there is an element after the iterator 
         position
      */
      public boolean hasNext()
     {  
       if (position == null)
           return first != null;
         else
            return position.next != null;
      }
     
     /**
      Adds an element before the iterator position
        and moves the iterator past the inserted element.
       @param element the element to add
     */
     public void add(Object element)
      {  
      if (position == null)
         {
          addFirst(element);
            position = first;
         }
         else
         {  
            Node newNode = new Node();
            newNode.data = element;
           newNode.next = position.next;
            position.next = newNode;
           position = newNode;
        }
         previous = position;
      }
      
     /**
       Removes the last traversed element. This method may
        only be called after a call to the next() method.
     */
      public void remove()
     {  
        if (previous == position)
            throw new IllegalStateException();

         if (position == first)
         {
           removeFirst();
        }
        else 
         {  
            previous.next = position.next;
        }
         position = previous;
      }
     
      /**
      Sets the last traversed element to a different 
      value. 
       @param element the element to set
    */
      public void set(Object element)
      {
         if (position == null)
           throw new NoSuchElementException();
         position.data = element;
     }

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}
    
  }
}
public class SLLIterator {

	public static void main(String args[])
	{
		LinkedList ll = new LinkedList();
		ListIterator it = ll.listIterator();
		ListIterator it1 = ll.listIterator();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		it.next();
		it.add(12);
		it.set(11);
		System.out.println("Elements in the list are :" );
			while(it1.hasNext())
			System.out.print(it1.next() + " ");
		/*ll.addFirst(40);
			System.out.println(it.next());
			it.remove();*/
		
	}
	
}
