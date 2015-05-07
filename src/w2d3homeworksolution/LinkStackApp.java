package w2d3homeworksolution;
class LinkList1<T>
{
class Link<T>
{
public T dData;             // data item
public Link next;              // next link in list
//-------------------------------------------------------------
public Link(T dd)           // constructor
   { dData = dd; }
//-------------------------------------------------------------
public void displayLink()      // display ourself
   { System.out.print(dData + " "); }
}  // end class Link

private Link first;            // ref to first item on list
//-------------------------------------------------------------
public LinkList1()              // constructor
   { first = null; }           // no items on list yet
//-------------------------------------------------------------
public boolean isEmpty()       // true if list is empty
   { return (first==null); }
//-------------------------------------------------------------
public void insertFirst(T dd) // insert at start of list
   {                           // make new link
   Link newLink = new Link(dd);
   newLink.next = first;       // newLink --> old first
   first = newLink;            // first --> newLink
   }
//-------------------------------------------------------------
public T deleteFirst()      // delete first item
   {                           // (assumes list not empty)
   Link temp = first;          // save reference to link
   first = first.next;         // delete it: first-->old next
   return (T) temp.dData;          // return deleted link
   }
//-------------------------------------------------------------
public void displayList()
   {
   Link current = first;       // start at beginning of list
   while(current != null)      // until end of list,
      {
      current.displayLink();   // print data
      current = current.next;  // move to next link
      }
   System.out.println("");
   }
//-------------------------------------------------------------
}  // end class LinkList
////////////////////////////////////////////////////////////////
class LinkStack<T>
{
private LinkList1 theList;
//--------------------------------------------------------------
public LinkStack()             // constructor
   {
   theList = new LinkList1();
   }
//--------------------------------------------------------------
public void push(T j)     // put item on top of stack
   {
   theList.insertFirst(j);
   }
//--------------------------------------------------------------
public T pop()            // take item from top of stack
   {
	if(!isEmpty())
	{
		return (T) theList.deleteFirst();
	}
	return null;
   }
//--------------------------------------------------------------
public boolean isEmpty()       // true if stack is empty
   {
   return ( theList.isEmpty() );
   }
//--------------------------------------------------------------
public void displayStack()
   {
   System.out.print("Stack (top-->bottom): ");
   theList.displayList();
   }
//--------------------------------------------------------------
}  // end class LinkStack

public class LinkStackApp {
	public static void main(String[] args)
    {
    LinkStack<Integer> theStack = new LinkStack<Integer>(); // make stack
    theStack.push(20);                    // push items
    theStack.push(40);

    theStack.displayStack();              // display stack

    theStack.push(60);                    // push items
    theStack.push(80);

    theStack.displayStack();              // display stack

    theStack.pop();                       // pop items
    theStack.pop();
    theStack.displayStack();              // display stack
    theStack.pop();
    theStack.pop();
    System.out.println("Item Deleted : " + theStack.pop());
    theStack.displayStack();              // display stack
    }  // end main()

}
