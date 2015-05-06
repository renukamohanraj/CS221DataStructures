package w2d2homeworksolution;
class Link
{
public long dData;                  // data item
public Link next;                   // next link in list
//-------------------------------------------------------------
public Link(long dd)                // constructor
   { dData = dd; }
//-------------------------------------------------------------
public void displayLink()           // display this link
   { System.out.print(dData + " "); }
}  // end class Link
////////////////////////////////////////////////////////////////
class SortedList
{
private Link first;                 // ref to first item
//-------------------------------------------------------------
public SortedList()                 // constructor
   { first = null; }
//-------------------------------------------------------------
public boolean isEmpty()            // true if no links
   { return (first==null); }
//-------------------------------------------------------------
public void insert(long key)        // insert, in order
   {
   Link newLink = new Link(key);    // make new link
   Link previous = null;            // start at first
   Link current = first;
                                    // until end of list,
   while(current != null && key > current.dData)
      {                             // or key > current,
      previous = current;
      current = current.next;       // go to next item
      }
   if(previous==null)               // at beginning of list
      first = newLink;              // first --> newLink
   else                             // not at beginning
      previous.next = newLink;      // old prev --> newLink
   newLink.next = current;          // newLink --> old currnt
   }  // end insert()
//-------------------------------------------------------------
public Link remove()           // return & delete first link
   {                           // (assumes non-empty list)
   Link temp = first;               // save first
   first = first.next;              // delete first
   return temp;                     // return value
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
   }
}  // end class SortedList
////////////////////////////////////////////////////////////////
class PriorityQ
{
private SortedList theList;
//-------------------------------------------------------------
public PriorityQ()               // constructor
   {
   theList = new SortedList();
   }
//-------------------------------------------------------------
public void insert(long item)    // insert item
   {
   theList.insert(item);
   }
//-------------------------------------------------------------
public long remove()             // remove minimum item
   {
   Link aLink = new Link(0);
   aLink = theList.remove();
   return aLink.dData;
   }
//-------------------------------------------------------------
public boolean isEmpty()         // true if queue is empty
   {
   return theList.isEmpty();
   }
//-------------------------------------------------------------
}  // end class PriorityQ

public class PriorityLLQueueAPP {
	 public static void main(String[] args)
     {
     PriorityQ thePQ = new PriorityQ();

     thePQ.insert(30);
     thePQ.insert(50);
     thePQ.insert(10);
     thePQ.insert(40);
     thePQ.insert(20);

     while( !thePQ.isEmpty() )
        {
        long item = thePQ.remove();
        System.out.print(item + " ");  // 10, 20, 30, 40, 50
        }  // end while
     System.out.println("");
     }  // end main()
//-------------------------------------------------------------


}
