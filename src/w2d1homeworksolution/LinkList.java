package w2d1homeworksolution;

public class LinkList {
	 		   private Link first;            // ref to first link on list

		// -------------------------------------------------------------
		   public LinkList()              // constructor
		      {
		      first = null;               // no links on list yet
		      }
		// -------------------------------------------------------------
		   public boolean isEmpty()       // true if list is empty
		      {
		      return (first==null);
		      }
		// -------------------------------------------------------------
		                                  // insert at start of list
		   public void insertFirst(int id, double dd)
		      {                           // make new link
		      Link newLink = new Link(id, dd);
		      newLink.next = first;       // newLink --> old first
		      first = newLink;            // first --> newLink
		      }
		// -------------------------------------------------------------
		   public Link deleteFirst()      // delete first item
		      {                           // (assumes list not empty)
		      Link temp = first;          // save reference to link
		      first = first.next;         // delete it: first-->old next
		      return temp;                // return deleted link
		      }
		// -------------------------------------------------------------
		   public void displayList()
		      {
		      System.out.print("List (first-->last): ");
		      Link current = first;       // start at beginning of list
		      while(current != null)      // until end of list,
		         {
		         current.displayLink();   // print data
		         current = current.next;  // move to next link
		         }
		      System.out.println("");
		      }
		// -------------------------------------------------------------
		   	public void MiniMax() {
			// TODO Auto-generated method stub
			 int min = first.iData;
			   int max = first.iData;
			   for(Link current = first.next; current!=null;current=current.next){
				   if (current.iData < min)
				   {
					   min = (int) current.iData;
				   }
				   if (current.iData > max)
				   {
					   max = (int) current.iData;
				   }
			   }
				   
			   System.out.println(" Minimum Value = " + min +"\n Maximum Value =" + max);
		}
		 // -------------------------------------------------------------
		   	public int size()
		   	{
		   		Link current = first;       // start at beginning of list
		   		int count = 0;
			      while(current != null)      // until end of list,
			         {
			          count++;
			    	  current = current.next;  // move to next link
			         }
			      return count;
		   	}
		   }  // end class LinkList

