// Name:       Derek Deibert 
// Class:      CS5040
// Term:       Summer 2018
// Instructor: Dr. Haddad
// Assignment: 4

public class BST_Derek_Deibert<E extends Comparable<E>>
      extends AbstractTree_Derek_Deibert<E> {
   protected TreeNode<E> root;
   protected int size = 0;
   
   //create a default binary search tree(BST).
   public BST_Derek_Deibert() {
   }
   //creat a binary search tree from an array of objects
   public BST_Derek_Deibert(E[] objects) {
      for(int i = 0; i < objects.length; i++)
         insert(objects[i]);
         
   }
   @Override /**return true if the element is in the tree*/
   public boolean search(E e) {
      TreeNode<E> current = root; //start from root
      
      while(current != null) {
         if(e.compareTo(current.element) < 0) {
            current = current.left;
         }
         else if(e.compareTo(current.element) > 0) {
            current = current.right;
         }
         else //element matches current.element
            return true;
      }
      return false;
   }
   
   @Override /**Insert element e into the BST. 
      * Return true if the element is inserted succcessfully. */
      
   public boolean insert(E e) {
      if(root == null)
         root = createNewNode(e); //create new root
         
      else {
         //Locate the parent node
         
         TreeNode<E> parent = null;
         TreeNode<E> current = root;
         while(current != null)
            if(e.compareTo(current.element) < 0) {
               parent = current;
               current = current.left;
            }
            else if(e.compareTo(current.element) > 0) {
               parent = current;
               current = current.right;
            }
            else
               return false; //Dupliicate node not inserted 
               
            if(e.compareTo(parent.element) < 0)
               parent.left = createNewNode(e);
            else
               parent.right = createNewNode(e);
        }
        
        size ++;
        return true; //element inserted successfully
       }
       
       protected TreeNode<E> createNewNode(E e) {
         return new TreeNode<>(e);
       }
       @Override /**Inorder traversal from the root*/
       public void inorder() {
         inorder(root);
       }
       
       /**Inorder traversal from a subtree */
       protected void inorder(TreeNode<E> root) {
         if(root == null) return;
         inorder(root.left);
         System.out.print(root.element + " ");
         inorder(root.right);
       }
       
       @Override /**postorder Traversal from the root*/
       public void postorder() {
         postorder(root);
       }
       
       //Postorder traversal from a subtree
       protected void preorder(TreeNode<E> root) {
         if(root==null) return;
         postorder(root.left);
         postorder(root.right);
         System.out.print(root.element + " ");
       }
       
       @Override /** Preorder traversal from teh root */
       public void preorder() {
         preorder(root);
       }
       
       protected void postorder(TreeNode<E> root) {
         if(root == null) return;
         System.out.print(root.element + " ");
         preorder(root.left);
         preorder(root.right);
       }
       
       /**This inner class is static, because it does not access any instance members
       defined in its outer class. */ 
       
       public static class TreeNode<E extends Comparable<E>> {
       
         protected E element; 
         protected TreeNode<E> left;
         protected TreeNode<E> right;
         
         public TreeNode(E e) {
            element = e;
         }
       }
       
       @Override /**Get the number of nodes in the tree */
       public int getSize() {
         return size;
       }
       
       /**returns the root of the tree*/
       public TreeNode<E> getRoot() {
         return root;
       }
       
       /**Returns a path from the root leading to the specified element */
       public java.util.ArrayList<TreeNode<E>> path(E e) {
         java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
         TreeNode<E> current = root; //start from root
         
         while(current != null) {
            list.add(current); //add the node to the list
            if(e.compareTo(current.element) < 0) {
               current = current.left;
            }
            else if(e.compareTo(current.element) > 0) {
               current = current.right;
            }
            else
               break;
          }
          
          return list; 
        }
        
        @Override /**Delete an element from the binary search tree.
        *Return true if the element is deleted successfully.
        *Return false if the element is not in the tree */
        
        public boolean delete(E e) {
         //Locate the node to be deleted and also locate its parent node
         TreeNode<E> parent = null;
         TreeNode<E> current = root;
         while(current != null) {
            if(e.compareTo(current.element) < 0) {
               parent = current;
               current = current.left;
            }
            else if(e.compareTo(current.element) > 0) {
               parent = current;
               current = current.right;
            }
            
            else
               break; 
         }
         
         if(current == null)
            return false;
            
         if(current.left == null) {
            //connect teh parent with the right child of hte current node
            if(parent == null) {
               root = current.right;
            }
            else {
               if(e.compareTo(parent.element) <0)
                  parent.left = current.right;
               
               else
                  parent.right = current.right;
            }
          }
          else {
            //case 2: the current node has a left child.
            //locate the rightmost node in the left subtree of
            //the current node and also its parent.
            TreeNode<E> parentOfRightMost= current;
            TreeNode<E> rightMost = current.left;
            
            while(rightMost.right != null) {
               parentOfRightMost = rightMost;
               rightMost = rightMost.right; //keep going to the right.
            }
            
            //replace the element in current by the element in rightMost
            current.element = rightMost.element;
            
            //eliminate rightmost node
            if(parentOfRightMost.right == rightMost)   
               parentOfRightMost.right = rightMost.left;
            else
               //special case: parentOfRightMost == current;
               parentOfRightMost.left = rightMost.left;
          }
          
          size--;
          return true; //element deleted successfully
        }
        
        @Override /**obtain an iterator. Use inorder. */
        public java.util.Iterator<E> iterator() {
         return new InorderIterator();
        }
        
        //Innter class InorderIterator
        private class InorderIterator implements java.util.Iterator<E> {
         //Store teh elements in a list
         private java.util.ArrayList<E> list = new java.util.ArrayList<>();
         private int current = 0; //point to the current element in the list
         
         public InorderIterator() {
            inorder();
         }
         
         //inorder traversal from teh root
         private void inorder() {
            inorder(root);
         }
         
         //Inorder traversal from a subtree
         private void inorder(TreeNode<E> root) {
            if(root == null) return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
         }
         
         @Override //more elements for traversing?
         public boolean hasNext() {
         if(current<list.size())
            return true;
            
          return false;
         }
         
         @Override //get the current element and move to the next
         public E next() {
            return list.get(current++);
         }
         
         @Override //remove the current element
         public void remove() {
            delete(list.get(current));
            list.clear();
            inorder();
         }
       }
       
       //remove all elements from teh tree
       public void clear() {
         root = null;
         size = 0;
       }
     }
        

        
       
       
       
       