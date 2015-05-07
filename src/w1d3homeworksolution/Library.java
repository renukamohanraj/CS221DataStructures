package w1d3homeworksolution;

import java.util.ArrayList;
import java.util.Collections;

public class Library  implements Comparable{
    
    private int bookID;
    private String ISBN;
    private String bookName;
    private double price;

    public Library(int bookID, String ISBN, String bookName, double price) {
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }
    // Sorting of number type 
   /* public int compareTo(Object obj)
	{
    	Library  AObj = (Library)obj;
		if (this.price > AObj.price) 
		return 1;
		else 
			if (this.price < AObj.price) 
				return -1;
			else 
				return 0;
	}*/
    // Sorting for the String type
    public int compareTo(Object obj)
	{
    	Library  AObj = (Library)obj;
		return (this.bookName.compareTo(AObj.bookName));
		
	}
    @Override
    public String toString() {
        return  "BookID=" + bookID + ", ISBN=" + ISBN + ", BookName=" + bookName + ", Price=" + price ;
    }
    
        public static void main(String[] args){
        ArrayList<Library> library = new ArrayList<Library>();
        System.out.println("Elements in the List");
        library.add(new Library(1234, "978-234-124", "Java Beginners Tutorial", 55.50));
        library.add(new Library(3453, "345-890-765", "Data Structure using Java", 30.45));
        library.add(new Library(4187, "785-900-876", "Java8 Features", 75.90));
        for(int i = 0; i < library.size(); i++){
        	int sno = i+1;
            System.out.println(sno  + " " + library.get(i));
        }
        System.out.println(" Total Books = " + library.size());
       // library.remove(1);
        
     // Sorting of Books using price
        Collections.sort(library);
        
        System.out.println("Elements in the List");
        for(int i = 0; i < library.size(); i++){
        	int sno = i+1;
            System.out.println(library.get(i));
        }
        
        System.out.println("Is List Empty: " + library.isEmpty());
    }
}