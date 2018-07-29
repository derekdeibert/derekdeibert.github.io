// Name:       Derek Deibert 
// Class:      CS5040
// Term:       Summer 2018
// Instructor: Dr. Haddad
// Assignment: 4
import java.util.Scanner;
public class RemoveDuplicates_Derek_Deibert {
   public static void main(String[] args) {
      BST_Derek_Deibert tree = new BST_Derek_Deibert();
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a string: ");
      String text = input.nextLine();
      
      //splits string into substrings by space and places substrings into an array
      String[] arr = text.split(" ");
      
      for(int i = 0; i < arr.length; i++) {
         tree.insert(arr[i]);//inserts strings into tree
      }
      System.out.print("Original text: ");
      System.out.println();
      System.out.println(text);
      
      System.out.print("Processed text: ");
      System.out.println();
      tree.inorder();
      

   }
   
}