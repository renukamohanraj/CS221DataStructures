package w3d5homeworksolution;

//demonstrates hash table with linear probing

import java.io.*;
import java.util.Scanner;
////////////////////////////////////////////////////////////////
class DataItem
{                                // (could have more data)
private String iData;               // data item (key)
//--------------------------------------------------------------
public DataItem(String ii)          // constructor
   { iData = ii; }
//--------------------------------------------------------------
public String getKey()
   { return iData; }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////
class HashTable
{
private DataItem[] hashArray;    // array holds hash table
private int arraySize;
private DataItem nonItem;        // for deleted items
int cSize=0;
//-------------------------------------------------------------
public HashTable(int size)       // constructor
   {
   arraySize = size;
   hashArray = new DataItem[arraySize];
   nonItem = new DataItem(null);   // deleted item key is -1
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
public int hashFunc(String key)
   {
	int hc = key.hashCode();
	if (hc<0)
		hc = -(hc);
	int k = hc % arraySize;
	System.out.println("Index " + k);
   return k;       // hash function
   }
//-------------------------------------------------------------
public void insert(DataItem item) // insert a DataItem
// (assumes table not full)
   {
   String key = item.getKey();      // extract key
   int hashVal = hashFunc(key);  // hash the key
                                 // until empty cell or -1,
   while(hashArray[hashVal] != null &&
                   !hashArray[hashVal].getKey().equals(key))
      {
	   hashVal = (hashVal + 1) % arraySize; // goto the next cell
       }
   hashArray[hashVal] = item;    // insert item
   cSize++;
   }  // end insert()
//-------------------------------------------------------------
public DataItem delete(String key)  // delete a DataItem
   {
   int hashVal = hashFunc(key);  // hash the key

   while(hashArray[hashVal] != null)  // until empty cell,
      {                               // found the key?
      if(hashArray[hashVal].getKey().equals(key))
         {
         DataItem temp = hashArray[hashVal]; // save item
         hashArray[hashVal] = nonItem;       // delete item
         cSize--;
         return temp;                        // return item
         }
      hashVal = (hashVal + 1) % arraySize; 
      }
   return null;                  // can't find item
   }  // end delete()
//-------------------------------------------------------------
public DataItem find(String key)    // find item with key
   {
   int hashVal = hashFunc(key);  // hash the key

   while(hashArray[hashVal] != null)  // until empty cell,
      {                               // found the key?
      if(hashArray[hashVal].getKey() == key)
         return hashArray[hashVal];   // yes, return item
      hashVal = (hashVal + 1) % arraySize;       
      }
   return null;                  // can't find item
   }
//-------------------------------------------------------------
int getSize()
{
	return cSize;
}
}  // end class HashTable
////////////////////////////////////////////////////////////////
class HashTableApp
{
public static void main(String[] args) throws IOException
   {
   DataItem aDataItem;
   int size, n, keysPerCell;
   String aKey;
                                 // get sizes
   System.out.print("Enter size of hash table: ");
   size = getInt();
                                // make table
   Scanner in = new Scanner(System.in);
   HashTable theHashTable = new HashTable(size);

 
   while(true)                   // interact with user
      {
      System.out.print("Enter first letter of ");
      System.out.print("show, insert, delete, or find: ");
      char choice = getChar();
      switch(choice)
         {
         case 's':
            theHashTable.displayTable();
            System.out.println("Current size : " + theHashTable.getSize());
            break;
         case 'i':
         System.out.print("Enter key value to insert: ");
            aKey = in.next();
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
            break;
         case 'd':
            System.out.print("Enter key value to delete: ");
            aKey = in.next();
            theHashTable.delete(aKey);
            break;
         case 'f':
            System.out.print("Enter key value to find: ");
            aKey = in.next();
            aDataItem = theHashTable.find(aKey);
            if(aDataItem != null)
               {
               System.out.println("Found " + aKey);
               }
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
}  // end class HashTableApp
////////////////////////////////////////////////////////////////

