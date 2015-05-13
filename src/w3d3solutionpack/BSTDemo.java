package w3d3solutionpack;

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
public Node minimum() // returns node with minimum key value
{
Node current, last = null;
current = root; // start at root
while(current != null) // until the bottom,
{
last = current; // remember node
current = current.leftChild; // go to left child
}
return last;
}
//-------------------------------------------------------------


public Node maximum() // returns node with minimum key value
{
Node current, last = null;
current = root; // start at root
while(current != null) // until the bottom,
{
last = current; // remember node
current = current.rightChild; // go to left child
}
return last;
}

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


 void preOrder(Node localRoot)
   {
   if(localRoot != null)
      {
      System.out.print(localRoot.iData + " ");
      preOrder(localRoot.leftChild);
      preOrder(localRoot.rightChild);
      }
   }
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
void postOrder(Node localRoot)
   {
   if(localRoot != null)
      {
      postOrder(localRoot.leftChild);
      postOrder(localRoot.rightChild);
      System.out.print(localRoot.iData + " ");
      }
   }
Node getRoot()
{
	return root;
}
public int leafNodes(Node p)
{
int count = 0;
if( p != null)
{ if((p.leftChild == null) && (p.rightChild == null))
count = 1;
else
count = count + leafNodes(p.leftChild)
+ leafNodes(p.rightChild);
}
return count;
}

//-------------------------------------------------------------

public boolean delete(int key) // delete node with given key
{                           // (assumes non-empty list)
Node current = root;
Node parent = root;
boolean isLeftChild = true;

while(current.iData != key)        // search for node
   {
   parent = current;
   if(key < current.iData)         // go left?
      {
      isLeftChild = true;
      current = current.leftChild;
      }
   else                            // or go right?
      {
      isLeftChild = false;
      current = current.rightChild;
      }
   if(current == null)             // end of the line,
      return false;                // didn't find it
   }  // end while
// found node to delete

// if deleting node has no children, simply delete it - Case-1 
if(current.leftChild==null &&
                             current.rightChild==null)
   {
   if(current == root)             // if root,
      root = null;                 // tree is empty
   else if(isLeftChild)
      parent.leftChild = null;     // disconnect
   else                            // from parent
      parent.rightChild = null;
   }

// if no right child, replace with left subtree - Case - 2 - delete node has one child
else if(current.rightChild==null)
   if(current == root)
      root = current.leftChild;
   else if(isLeftChild)
      parent.leftChild = current.leftChild;
   else
      parent.rightChild = current.leftChild;

// if no left child, replace with right subtree - Case - 2 - delete node has one child 
else if(current.leftChild==null)
   if(current == root)
      root = current.rightChild;
   else if(isLeftChild)
      parent.leftChild = current.rightChild;
   else
      parent.rightChild = current.rightChild;

else  // two children, so replace with inorder successor - Case - 3 - delete node has two children
   {
   // get successor of node to delete (current)
   Node successor = getSuccessor(current);

   // connect parent of current to successor instead
   if(current == root)
      root = successor;
   else if(isLeftChild) // Case 3a-successor has no children and put the successor in the delnode position
      parent.leftChild = successor;
   else
      parent.rightChild = successor;

   // Case 3b - connect successor to current's left child - 
   successor.leftChild = current.leftChild;
   }  // end else two children
// (successor cannot have a left child)
return true;                                // success
}  // end delete()
//-------------------------------------------------------------
//returns node with next-highest value after delNode
//goes to right child, then right child's left descendents
private Node getSuccessor(Node delNode)
{
Node successorParent = delNode;
Node successor = delNode;
Node current = delNode.rightChild;   // go to right child
while(current != null)               // until no more
   {                                 // left children,
   successorParent = successor;
   successor = current;
   current = current.leftChild;      // go to left child
   }
                                     // if successor not
if(successor != delNode.rightChild)  // Case 3c-Successor is left Decendent of right child of delnode,
   {                                 // make connections
   successorParent.leftChild = successor.rightChild;
   successor.rightChild = delNode.rightChild;
   }
return successor;
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
   int c =theTree.leafNodes(theTree.getRoot());
   System.out.println("\nMinimum Value : " + theTree.minimum().iData);
   System.out.println("\nMaximum Value : " + theTree.maximum().iData);
  System.out.println("\nNumber of leaf nodes : " + c);
  System.out.println("\nNode deleted 12 is " + theTree.delete(12));
  System.out.println("\nInorder Traversal is : ");
  theTree.inOrder(theTree.getRoot());
   }  // end main()
//-------------------------------------------------------------

}  // end class TreeApp
////////////////////////////////////////////////////////////////
