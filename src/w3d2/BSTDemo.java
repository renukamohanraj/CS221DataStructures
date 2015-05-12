package w3d2;

class Node
{
public int iData;              // data item (key)
public double dData;           // data item
public Node leftChild;         // this node's left child
public Node rightChild;        // this node's right child

public void displayNode()      // display ourself
   {
   System.out.print('{');
   System.out.print(iData);
   System.out.print(", ");
   System.out.print(dData);
   System.out.print("} ");
   }
} 
class Tree1
{
private Node root;             // first node of tree
//-------------------------------------------------------------
public Tree1()                  // constructor
   { root = null; }            // no nodes in tree yet
//-------------------------------------------------------------
public Node find(int key)      // find node with given key
   {                           // (assumes non-empty tree)
   Node current = root;               // start at root
   while(current.iData != key)        // while no match,
      {
      if(key < current.iData)         // go left?
         current = current.leftChild;
      else                            // or go right?
         current = current.rightChild;
      if(current == null)             // if no child,
         return null;                 // didn't find it
      }
   return current;                    // found it
   }  // end find()
//-------------------------------------------------------------
public void insert(int id, double dd)
   {
   Node newNode = new Node();    // make new node
   newNode.iData = id;           // insert data
   newNode.dData = dd;
   if(root==null)                // no node in root
      root = newNode;
   else                          // root occupied
      {
      Node current = root;       // start at root
      Node parent;
      while(true)                // (exits internally)
         {
         parent = current;
         if(id < current.iData)  // go left?
            {
            current = current.leftChild;
            if(current == null)  // if end of the line,
               {                 // insert on left
               parent.leftChild = newNode;
               return;
               }
            }  // end if go left
         else                    // or go right?
            {
            current = current.rightChild;
            if(current == null)  // if end of the line
               {                 // insert on right
               parent.rightChild = newNode;
               return;
               }
            }  // end else go right
         }  // end while
      }  // end else not root
   }  // end insert()
//-------------------------------------------------------------


 
 void inOrder(Node localRoot)
   {
   if(localRoot != null)
      {
      inOrder(localRoot.leftChild);
      System.out.print(localRoot.iData + " ");
      inOrder(localRoot.rightChild);
      }
   }
//-------------------------------------------------------------

Node getRoot()
{
	return root;
}

//-------------------------------------------------------------
}  // end class Tree

class BSTDemo
{
public static void main(String[] args) 
   {
    Tree1 theTree = new Tree1();
   theTree.insert(50, 1.5);
   theTree.insert(25, 1.2);
   theTree.insert(75, 1.7);
   theTree.insert(12, 1.5);
   theTree.insert(37, 1.2);
   theTree.insert(43, 1.7);
   theTree.insert(30, 1.5);
   Node f = theTree.find(25);
   f.displayNode();
   System.out.println("\nInorder Traversal is : ");
   theTree.inOrder(theTree.getRoot());
     }  // end main()
//-------------------------------------------------------------

}  // end class TreeApp
////////////////////////////////////////////////////////////////
