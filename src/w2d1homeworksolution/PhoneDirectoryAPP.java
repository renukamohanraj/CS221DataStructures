package w2d1homeworksolution;

class Directory {
	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.pno = pno;
	}

	// -------------------------------------------------------------
	public void displayDirectory() // display ourself
	{
		System.out.print("{" + name + ", " + pno + "} ");
	}
}

class DirectoryOpr {
	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		first = null; // no Directorys on list yet
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directorys
	{
		return first == null;
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) // insert at front of list
	{
		Directory newDirectory = new Directory(name, pno); // make new Directory

		if (isEmpty()) // if empty list,
			last = newDirectory; // newDirectory <-- last
		newDirectory.next = first; // newDirectory --> old first
		first = newDirectory; // first --> newDirectory
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		Directory newDirectory = new Directory(name, pno); // make new Directory
		if (isEmpty()) // if empty list,
			first = newDirectory; // first --> newDirectory
		else
			last.next = newDirectory; // old last --> newDirectory
		last = newDirectory; // newDirectory <-- last
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{ // (assumes non-empty list)
		Directory temp = first;
		if (first.next == null) // if only one item
			last = null; // null <-- last
		first = first.next; // first --> old next
		return temp;
	}

	public int size() {
		Directory current = first; // start at beginning of list
		int count = 0;
		while (current != null) // until end of list,
		{
			count++;
			current = current.next; // move to next link
		}
		return count;
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Directory current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayDirectory(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	public Directory find(String key)      // find link with given key
    {                           // (assumes non-empty list)
		Directory current = first;              // start at 'first'
    while(!current.name.equalsIgnoreCase(key))        // while no match,
       {
       if(current.next == null)        // if end of list,
          return null;                 // didn't find it
       else                            // not end of list,
          current = current.next;      // go to next link
       }
    return current;                    // found it
    }
}

public class PhoneDirectoryAPP {
	public static void main(String args[]) {
		DirectoryOpr obj = new DirectoryOpr();
		obj.insertFirst("Renuka", 641435678);
		obj.insertFirst("Anjana", 641435679);
		obj.insertLast("Mohanraj", 645908876);
		obj.displayList();
		obj.deleteFirst();
		obj.displayList();
		Directory temp = obj.find("Renuka");
		temp.displayDirectory();
		System.out.println("\nSize = " + obj.size());
	}

}
