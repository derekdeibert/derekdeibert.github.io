// Name:          Derek Deibert  
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    2

import java.util.*;

//This is a test class to reverse a string.
public class ReverseString_Derek_Deibert extends Stack_Derek_Deibert {

   public static void main(String[] args) {
   String string;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a string: ");
   string = input.nextLine();//collects user input
   System.out.println();
   System.out.print("Input String:\t\t"+string);
   
   System.out.println();
  
   System.out.print("Reversed String:\t");
   Stack_Derek_Deibert reverse = new Stack_Derek_Deibert();//create an object from the Stack class
   String newString = reverse.reverseWords(string);
   reverse.pushString(newString);
   reverse.printStackReverse();
   
   }
}
