package w3d2;

class Employee
{
	int id;
	String name;
	Employee leftChild,rightChild;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void displayEmployee()
	{
		System.out.println(id + ", " + name);
	}
}

class EmployeeOpr
{
	Employee root;
	EmployeeOpr()
	{
		root = null;
	}
	public boolean find(int key)      // find Employee with given key
	   {                           // (assumes non-empty tree)
		Employee  current = root;               // start at root
	   while(current.id != key)        // while no match,
	      {
	      if(key < current.id)         // go left?
	         current = current.leftChild;
	      else                            // or go right?
	         current = current.rightChild;
	      if(current == null)             // if no child,
	         return false;                 // didn't find it
	      }
	   return true;                    // found it
	   }  // end find()
	
	public void insert(int x, String n)
	   {
	   Employee newEmployee = new Employee(x,n);    // make new Employee
	  
	   if(root==null)                // no Employee in root
	      root = newEmployee;
	   else                          // root occupied
	      {
	      Employee current = root;       // start at root
	      Employee parent;
	      while(true)                // (exits internally)
	         {
	         parent = current;
	         if(newEmployee.id < current.id)  // go left?
	            {
	            current = current.leftChild;
	            if(current == null)  // if end of the line,
	               {                 // insert on left
	               parent.leftChild = newEmployee;
	               return;
	               }
	            }  // end if go left
	         else                    // or go right?
	            {
	            current = current.rightChild;
	            if(current == null)  // if end of the line
	               {                 // insert on right
	               parent.rightChild = newEmployee;
	               return;
	               }
	            }  // end else go right
	         }  // end while
	      }  // end else not root
	   }  // end insert()
	//-------------------------------------------------------------
	void inOrder(Employee localRoot)
	   {
	   if(localRoot != null)
	      {
	      inOrder(localRoot.leftChild);
	      System.out.println(localRoot.id + " , " +localRoot.name);
	      inOrder(localRoot.rightChild);
	      }
	   }
	//-------------------------------------------------------------
	Employee getRoot()
	{
		return root;
	}
}
public class EmployeeBST {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeOpr eo = new EmployeeOpr();
		eo.insert(100, "Renuka");
		eo.insert(90, "Ramya");
		eo.insert(130, "Mohan");
		eo.insert(115, "Ram");
		eo.insert(76, "Suresh");
		System.out.println("In-order traversal");
		eo.inOrder(eo.getRoot());
        System.out.println("\nEmployee Exist(100) : " + eo.find(100));
        System.out.println("\nEmployee Exist(1000) : " + eo.find(1000));
	}
	

}
