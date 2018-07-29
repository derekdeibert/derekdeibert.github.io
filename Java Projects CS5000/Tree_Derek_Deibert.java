// Name:       Derek Deibert 
// Class:      CS5040
// Term:       Summer 2018
// Instructor: Dr. Haddad
// Assignment: 4

public interface Tree_Derek_Deibert<E> extends Iterable <E> {
   /**Return true if hte element is in the tree */
   public boolean search(E e);
   
   /**Insert element e into the binary search tree.
    * Return true if hte element is inserted successfully. */
   
   //Insert element e into BST, return true if inserted correctly
   public boolean insert(E e);
   
   //delete specified element e from tree, return true if element is deleted.
   public boolean delete(E e);
   
   //Inorder traversal from root
   public void inorder();
   
   //Postorder traversal from root
   public void postorder();
   
   //Preorder traversal from root
   public void preorder();
   
   //Returns size of tree
   public int getSize();
   
   //returns true if tree is empty
   public boolean isEmpty();
   
}
   
   