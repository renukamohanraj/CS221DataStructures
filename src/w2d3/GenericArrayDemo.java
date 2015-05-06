package w2d3;
class Array<T>
{
private T[] a;                 // ref to array a
//--------------------------------------------------------------
public Array(int size)         // constructor
   {//stackArray = (T[])new Object[maxSize]; 
	a = (T[]) new Object[size]; }        // create array
//--------------------------------------------------------------
public void setElem(int index, T value)  // set value
   { a[index] = value; }
//--------------------------------------------------------------
public T getElem(int index)              // get value
   { return a[index]; }
//--------------------------------------------------------------
}  // end class LowArray
public class GenericArrayDemo {
public static void main(String args[])
{
	// Integer Array
	Array<Integer> iObj = new Array<Integer>(10);
	iObj.setElem(0, 10);
	iObj.setElem(1, 20);
	iObj.setElem(2, 30);
	iObj.setElem(3, 40);
	System.out.println("Value at the index 0 is :" + iObj.getElem(0));
	
	// Character Array
	Array<Character> cObj = new Array<Character>(10);
	cObj.setElem(0, 'W');
	cObj.setElem(1, 'O');
	cObj.setElem(2, 'R');
	cObj.setElem(3, 'D');
	System.out.println("Value at the index 0 is :" + cObj.getElem(0));
	
}
}
