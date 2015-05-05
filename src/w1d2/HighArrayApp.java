package w1d2;

class HighArray
{
private long[] a;                 // ref to array a
private int nElems;               // number of data items
//-----------------------------------------------------------
public HighArray(int max)         // constructor
   {
   a = new long[max];                 // create the array
   nElems = 0;                        // no items yet
   }
//-----------------------------------------------------------
public boolean find(long searchKey)
   {                              // find specified value
   int j;
   for(j=0; j<nElems; j++)            // for each element,
      if(a[j] == searchKey)           // found item?
         break;                       // exit loop before end
   if(j == nElems)                    // gone to end?
      return false;                   // yes, can't find it
   else
      return true;                    // no, found it
   }  // end find()
//-----------------------------------------------------------
public void insert(long value)    // put element into array
   {
  if (nElems == a.length)
	   System.out.println("Array is full");
   else
   {
   a[nElems] = value;             // insert it
   nElems++;
   }// increment size
   }
public void insert(int p, long value)
{
	if (nElems == a.length)
		   System.out.println("Array is full");
	     int length = nElems;  
		 for(int k=length-1; k>=p; k--) 
		 {
	         a[length] = a[k];
		     length--;
		 }
		 a[p]=value;
	      nElems++; 
	
}
//-----------------------------------------------------------
public boolean delete(long value)
   {
   int j;
   for(j=0; j<nElems; j++)        // look for it
      if( value == a[j] )
         break;
   if(j==nElems)                  // can't find it
      return false;
   else                           // found it
      {
      for(int k=j; k<nElems; k++) // move higher ones down
         a[k] = a[k+1];
      nElems--;                   // decrement size
      return true;
      }
   }  // end delete()
//-----------------------------------------------------------
public void display()             // displays array contents
   {
	System.out.println("The List is :");
   for(int j=0; j<nElems; j++)       // for each element,
      System.out.print(a[j] + " ");  // display it
   System.out.println("");
   }
public String toString()
{
	String out = null;
	 for(int j=0; j<nElems; j++) 
	 
		 out = out + a[j] + " ";
	 return out;
}
//-----------------------------------------------------------
public int size()
{
	return nElems;
}
}  // end class HighArray
////////////////////////////////////////////////////////////////
class HighArrayApp
{
public static void main(String[] args)
   {
   int maxSize = 20;            // array size
   HighArray arr;                // reference to array
   arr = new HighArray(maxSize); // create the array

   arr.insert(77);               // insert 10 items
   arr.insert(99);
   arr.insert(44);
   arr.display();
   arr.insert(1,78);
   arr.insert(55);
   arr.insert(2,79);
   arr.display();
   arr.insert(22);
   arr.insert(88);
   arr.insert(11);
   arr.insert(00);
   arr.insert(66);
   arr.insert(33);
  
  // arr.insert(30);
  // arr.display();                // display items
   System.out.println(arr);
   System.out.println("Size of the array is :" + arr.size());

   int searchKey = 99;           // search for item
   if( arr.find(searchKey) )
      System.out.println("Found " + searchKey);
   else
      System.out.println("Can't find " + searchKey);

  arr.delete(66);               // delete 3 items
   arr.delete(55);
   arr.delete(99);

  // arr.display();                // display items again
   System.out.println("Size of the array is :" + arr.size());
   }  // end main()
}  // end class HighArrayApp
