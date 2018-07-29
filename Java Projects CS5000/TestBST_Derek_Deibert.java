// Name:       Derek Deibert 
// Class:      CS5040
// Term:       Summer 2018
// Instructor: Dr. Haddad
// Assignment: 4

public class TestBST_Derek_Deibert {

   public static void main(String[] args) {
   //create a BST
   BST_Derek_Deibert<String> tree = new BST_Derek_Deibert();
   tree.insert("George");
   tree.insert("Michael");
   tree.insert("Tom");
   tree.insert("Adam");
   tree.insert("Jones");
   tree.insert("Peter");
   tree.insert("Daniel");
   
   //traverse tree
   System.out.print("Inorder (sorted): ");
   tree.inorder();
   System.out.print("\nPostorder: ");
   tree.postorder();
   System.out.print("\nPreorder: ");
   tree.preorder();
   System.out.print("\nThe number of Nodes is "+tree.getSize());
   
   //search for an element
   System.out.print("\nIs Peter in the tree: "+
   tree.search("Peter"));
   
   //get a path from the root to peter
   System.out.print("\nA path from the root to Peter is: ");
   java.util.ArrayList<BST_Derek_Deibert.TreeNode<String>> path = tree.path("Peter");
   for(int i = 0; path != null && i< path.size(); i++)
      System.out.print(path.get(i).element+" ");
   
   Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
   BST_Derek_Deibert<Integer> intTree = new BST_Derek_Deibert<>(numbers);
   System.out.print("\nInorder (sorted): ");
   intTree.inorder();
   }
}