package w3d5homeworksolution;

//demonstrates hash table with quadratic probing
//to run this program: C:>java HashQuadApp
import java.io.*;
////////////////////////////////////////////////////////////////
class DataItem
{                                 // (could have more items)
private int iData;                // data item (key)
//--------------------------------------------------------------
public DataItem(int ii)           // constructor
   { iData = ii; }
//--------------------------------------------------------------
public int getKey()
   { return iData; }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////
class HashTable
{
DataItem[] hashArray;             // array is the hash table
int arraySize;
DataItem nonItem;                 // for deleted items
int cSize=0; // Counting of elements
//-------------------------------------------------------------
HashTable(int size)               // constructor
   {
   arraySize = size;
   hashArray = new DataItem[arraySize];
   nonItem = new DataItem(-1);
   }
//-------------------------------------------------------------
public void displayTable()
   {
   System.out.print("Table: ");
   for(int j=0; j<arraySize; j++)
      {
      if(hashArray[j] != null)
         System.out.print(hashArray[j].getKey() + " ");
      else
         System.out.print("** ");
      }
   System.out.println("");
   }
//-------------------------------------------------------------
public int hashFunc(int key)
   {
   return key % arraySize;
   }
//-------------------------------------------------------------
                                  // insert a DataItem
public void insert(int key, DataItem item)
// (assumes table not full and array size is prime number)
   {
   int hashVal = hashFunc(key);   // hash the key
   int stepNumber = 1;            // 1, 2, 3, ...
                                  // until empty cell or del
   while(hashArray[hashVal] != null &&
                       hashArray[hashVal].getKey() != -1)
      {
      hashVal += stepNumber*stepNumber; // add step # squared
      stepNumber++;

      hashVal %= arraySize;       // for wraparound
      }
   hashArray[hashVal] = item;     // insert item
   cSize++;
   }  // end insert()
//-------------------------------------------------------------
public DataItem delete(int key)   // delete a DataItem
   {
   int hashVal = hashFunc(key);       // hash the key
   int stepNumber = 1;

   while(hashArray[hashVal] != null)  // until empty cell,
      {                               // is correct hashVal?
      if(hashArray[hashVal].getKey() == key)
         {
         DataItem temp = hashArray[hashVal]; // save item
         hashArray[hashVal] = nonItem;       // delete item
         cSize--;
         return temp;                        // return item
         }
      hashVal += stepNumber*stepNumber; // add step # squared
      stepNumber++;
      hashVal %= arraySize;       // for wraparound
      }
   return null;                   // can't find item
   }  // end delete()
//-------------------------------------------------------------
public DataItem find(int key)     // find item with key
// (assumes table not full)
   {
   int hashVal = hashFunc(key);       // hash the key
   int stepNumber = 1;                // 1, 2, 3, ...
   while(hashArray[hashVal] != null)  // until empty cell,
      {                               // is correct hashVal?
      if(hashArray[hashVal].getKey() == key)
         return hashArray[hashVal];   // yes, return item
      hashVal += stepNumber*stepNumber; // add step # squared
      stepNumber++;
      hashVal %= arraySize;           // for wraparound
      }
   return null;                   // can't find item
   }
//-------------------------------------------------------------
int getSize()
{
	return cSize;
}
//-------------------------------------------------------------
boolean isEmpty()
{
	return (cSize==0);
}

}  // end class HashTable
////////////////////////////////////////////////////////////////
class HashQuadApp
{
public static void main(String[] args) throws IOException
   {
   int aKey;
   DataItem aDataItem;
   int size, n;
                               // get sizes
   System.out.print("Enter size of hash table: ");
   size = getInt();
   System.out.print("Enter initial number of items: ");
   n = getInt();
                               // make table
   HashTable theHashTable = new HashTable(size);

   for(int j=0; j<n; j++)      // insert data
      {
      aKey = (int)(java.lang.Math.random() * 2 * size);
      aDataItem = new DataItem(aKey);
      theHashTable.insert(aKey, aDataItem);
      }

   while(true)                 // interact with user
      {
      System.out.print("Enter first letter of ");
      System.out.print("show, insert, delete, or find: ");
      char choice = getChar();
      switch(choice)
         {
         case 's':
            theHashTable.displayTable();
            System.out.println("Current size : " + theHashTable.getSize());
            System.out.println("IsEmpty : "+ theHashTable.isEmpty());
   
            break;
         case 'i':
            System.out.print("Enter key value to insert: ");
            aKey = getInt();
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aKey, aDataItem);
            break;
         case 'd':
            System.out.print("Enter key value to delete: ");
            aKey = getInt();
            theHashTable.delete(aKey);
            break;
         case 'f':
            System.out.print("Enter key value to find: ");
            aKey = getInt();
            aDataItem = theHashTable.find(aKey);
            if(aDataItem != null)
               System.out.println("Found " + aKey);
            else
               System.out.println("Could not find " + aKey);
            break;
         default:
            System.out.print("Invalid entry\n");
         }  // end switch
      }  // end while
   }  // end main()
//--------------------------------------------------------------
public static String getString() throws IOException
   {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   String s = br.readLine();
   return s;
   }
//--------------------------------------------------------------
public static char getChar() throws IOException
   {
   String s = getString();
   return s.charAt(0);
   }

//-------------------------------------------------------------
public static int getInt() throws IOException
   {
   String s = getString();
   return Integer.parseInt(s);
   }
//--------------------------------------------------------------
}  // end class HashQuadApp
////////////////////////////////////////////////////////////////
