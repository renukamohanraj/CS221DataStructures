package w2d1;

public class Link {
	public int iData;              // data item
	   public double dData;           // data item
	   public Link next;              // next link in list
	// -------------------------------------------------------------
	                            
	public Link(int id, double dd) {
		// TODO Auto-generated constructor stub
		iData = id;                 // initialize data
	      dData = dd; 
	}
	// -------------------------------------------------------------
	   public void displayLink()      // display ourself
	      {
	      System.out.print("{" + iData + ", " + dData + "} ");
	      }
	   }  // end class Link
