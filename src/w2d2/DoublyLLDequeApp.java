package w2d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Link2
{
public long dData;                 // data item
public Link2 next;                  // next Link2 in list
public Link2 previous;              // previous Link2 in list
//-------------------------------------------------------------
public Link2(long d)                // constructor
   { dData = d; }
//-------------------------------------------------------------
public void displayLink2()          // display this Link2
   { System.out.print(dData + " "); }
//-------------------------------------------------------------
}  // end class Link2
////////////////////////////////////////////////////////////////
class DoublyLink2edList
{
private Link2 first;               // ref to first item
private Link2 last;                // ref to last item
//-------------------------------------------------------------
public DoublyLink2edList()         // constructor
   {
   first = null;                  // no items on list yet
   last = null;
   }
//-------------------------------------------------------------
public boolean isEmpty()          // true if no Link2s
   { return first==null; }
//-------------------------------------------------------------
public void insertFirst(long dd)  // insert at front of list
   {
   Link2 newLink2 = new Link2(dd);   // make new Link2

   if( isEmpty() )                // if empty list,
      last = newLink2;             // newLink2 <-- last
   else
      first.previous = newLink2;   // newLink2 <-- old first
   newLink2.next = first;          // newLink2 --> old first
   first = newLink2;               // first --> newLink2
   }
//-------------------------------------------------------------
public void insertLast(long dd)   // insert at end of list
   {
   Link2 newLink2 = new Link2(dd);   // make new Link2
   if( isEmpty() )                // if empty list,
      first = newLink2;            // first --> newLink2
   else
      {
      last.next = newLink2;        // old last --> newLink2
      newLink2.previous = last;    // old last <-- newLink2
      }
   last = newLink2;                // newLink2 <-- last
   }
//-------------------------------------------------------------
public Link2 deleteFirst()         // delete first Link2
   {                              // (assumes non-empty list)
   Link2 temp = first;
   if(first.next == null)         // if only one item
      last = null;                // null <-- last
   else
      first.next.previous = null; // null <-- old next
   first = first.next;            // first --> old next
   return temp;
   }
//-------------------------------------------------------------
public Link2 deleteLast()          // delete last Link2
   {                              // (assumes non-empty list)
   Link2 temp = last;
   if(first.next == null)         // if only one item
      first = null;               // first --> null
   else
      last.previous.next = null;  // old previous --> null
   last = last.previous;          // old previous <-- last
   return temp;
   }
//-------------------------------------------------------------
public void displayForward()
   {
   Link2 current = first;          // start at beginning
   while(current != null)         // until end of list,
      {
      current.displayLink2();      // display data
      current = current.next;     // move to next Link2
      }
   System.out.println("");
   }
//-------------------------------------------------------------
}  // end class DoublyLink2edList
////////////////////////////////////////////////////////////////
class Deque
{
DoublyLink2edList theList;
//--------------------------------------------------------------
public Deque(int size)         // constructor
   {
   theList = new DoublyLink2edList();
   }
//--------------------------------------------------------------
public void insertLeft(long j) // put item at left of deque
   {
   theList.insertFirst(j);
   }
//--------------------------------------------------------------
public void insertRight(long j) // put item at right of deque
   {
   theList.insertLast(j);
   }
//--------------------------------------------------------------
public long removeLeft()      // take item from left of deque
   {
   Link2 aLink2 = theList.deleteFirst();
   return aLink2.dData;
   }
//--------------------------------------------------------------
public long removeRight()    // take item from right of deque
   {
   Link2 aLink2 = theList.deleteLast();
   return aLink2.dData;
   }
//--------------------------------------------------------------
public boolean isEmpty()     // true if deque is empty
   { return theList.isEmpty(); }
//--------------------------------------------------------------
public void display()
   {
   System.out.print("Deque: ");
   theList.displayForward();
   }  // end display()
//--------------------------------------------------------------
}  // end class Deque
////////////////////////////////////////////////////////////////

public class DoublyLLDequeApp {
	public static void main(String[] args) throws IOException
    {
    Deque theDeque = new Deque(10);

    while(true)
       {
       long value;
       putLine("");
       if( theDeque.isEmpty() )
          putLine("*** Deque is empty. No deletions. ***");

       putText("Enter first letter of ");
       putLine("insertLeft, InsertRight, ");
       putText("removeLeft, RemoveRight, or display: ");
       int choice = getChar();
       switch(choice)
          {
          case 'd':
             theDeque.display();
             break;
          case 'i':
             putText("Enter value to insert left: ");
             value = getLong();
             theDeque.insertLeft(value);
             theDeque.display();
             break;
          case 'I':
             putText("Enter value to insert right: ");
             value = getLong();
             theDeque.insertRight(value);
             theDeque.display();
             break;
          case 'r':
             value = theDeque.removeLeft();
             System.out.println("Removed left: " + value);
             theDeque.display();
             break;
          case 'R':
             value = theDeque.removeRight();
             System.out.println("Removed right: " + value);
             theDeque.display();
             break;
          default:
             putText("Invalid entry\n");
          }  // end switch
       }  // end while
    }  // end main()
//-------------------------------------------------------------
 public static void putText(String s)
    {
    System.out.print(s);
    System.out.flush();
    }
//-------------------------------------------------------------
 public static void putLine(String s)
    {
    System.out.println(s);
    }
//-------------------------------------------------------------
 public static String getString() throws IOException
    {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
    }
//-------------------------------------------------------------
 public static char getChar() throws IOException
    {
    String s = getString();
    return s.charAt(0);
    }
//-------------------------------------------------------------
 public static long getLong() throws IOException
    {
    String s = getString();
    return (long)Integer.parseInt(s);
    }
////////////////////////////////////////////////////////////////
 }  // end class DequeApp

/*
List      Deque
------------
First ->  Left
Last  ->  Right

There's no need to specify a size in the constructor for a
deque that's based on a list, because (at least in theory)
the list can expand to fill all memory. We'll assume that
you have enough memory that this will never happen. In
a real-word program you might need to check for this
eventually.
*/

