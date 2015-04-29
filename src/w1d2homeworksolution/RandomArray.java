package w1d2homeworksolution;

import java.util.Arrays;

class Rarray
{
private long[] a;                 // ref to array a
private int nElems;               // number of data items
//-----------------------------------------------------------
public Rarray(int max)         // constructor
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
   a[nElems] = value;             // insert it
   nElems++;                      // increment size
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
	try
	{
	
   for(int j=0; j<nElems; j++)       // for each element,
      System.out.print(a[j] + " ");  // display it
   System.out.println("");
	}
	catch(Exception e)
	{
		System.out.println("\nList is Empty");
	}
   }
public int[] removedup()
{
	int end = a.length;
	
    for(int i = 0; i < end; i++){
        for(int j = i + 1; j < end; j++){
            if(a[i] == a[j]){                  
                int shiftLeft = j;
                for(int k = j+1; k < end; k++, shiftLeft++){
                    a[shiftLeft] = a[k];
                }
                end--;
                j--;
            }
        }
    }

    int[] temp = new int[end];
    for(int i = 0; i < end; i++){
        temp[i] = (int) a[i];
    }
    return temp;
}
public void removeAll()
{
	a=null;
}
public int getValue(int i)
{
	return (int) (a[i]);
}
public int[] subList(int si,int ei)
{
	int temp[] = new int[ei-si+1];
	for (int i=si,j=0;i<=ei;i++,j++)
	{
		temp[j]=(int) a[i];
	}
	return temp;
		
}

//-----------------------------------------------------------
}  // end class HighArray
public class RandomArray {
	public static void main(String[] args)
	   {
	   int maxSize = 50;            // array size
	   Rarray arr;                // reference to array
	   arr = new Rarray(maxSize);
	   for(int i=0;i<maxSize;i++)
	   {
		   arr.insert(Math.round(Math.random()*100));
	   }
	   	   arr.display();
	   	   int[] x = arr.removedup();
	   	   for(int i=0;i<x.length;i++)
	   	   System.out.print(x[i]+" ");
	   	   
	   	   int[] set = arr.subList(3, 5);
	   	   System.out.println("\nSub set =" + Arrays.toString(set));
	   	arr.removeAll();
	    arr.display();
	   	   	
	   }
	
}
