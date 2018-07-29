// Name:       Derek Deibert 
// Class:      CS5040
// Term:       Summer 2018
// Instructor: Dr. Haddad
// Assignment: 4

public class TestBSTDelete_Derek_Deibert {
   public static void main(String[] args) {
      //create new tree
      BST_Derek_Deibert<String> tree = new BST_Derek_Deibert();
      tree.insert("George");
      tree.insert("Michael");
      tree.insert("Tom");
      tree.insert("Adam");
      tree.insert("Jones");
      tree.insert("Peter");
      tree.insert("Daniel");
      printTree(tree);
      
      System.out.print("\nAfter delete George: ");
      tree.delete("George");//uses Delete method
      printTree(tree);
      
      System.out.print("\nAfter delete Adam: ");
      tree.delete("Adam");
      printTree(tree);
      
      System.out.print("\nAfter delete Michael: ");
      tree.delete("Michael");
      printTree(tree);
    }
    public static void printTree(BST_Derek_Deibert tree) {
      //traverse tree
      System.out.print("Inorder (sorted): ");
      tree.inorder();
      System.out.print("\nPostorder: ");
      tree.postorder();
      System.out.print("\nPreorder: ");
      tree.preorder();
      System.out.print("\nThe number of nodes is "+tree.getSize());
      System.out.println();
    }
}