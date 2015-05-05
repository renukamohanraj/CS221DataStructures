package w2d1;

public class LinkList2App {

		   public static void main(String[] args)
		      {
		      LinkList2 theList = new LinkList2();  // make list

		      theList.insertFirst(22, 2.99);      // insert 4 items
		      theList.insertFirst(44, 4.99);
		      theList.insertFirst(66, 6.99);
		      theList.insertFirst(88, 8.99);

		      theList.displayList();              // display list

		      Link f = theList.find(55);          // find item
		      if( f != null)
		         System.out.println("Found link with key " + f.iData);
		      else
		         System.out.println("Can't find link");

		      Link d = theList.delete(88);        // delete item
		      if( d != null )
		         System.out.println("Deleted link with key " + d.iData);
		      else
		         System.out.println("Can't delete link");

		      theList.displayList();              // display list
		      }  // end main()
		   }  // end class LinkList2App
