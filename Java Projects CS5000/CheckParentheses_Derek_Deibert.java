// Name:          Derek Deibert  
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    2
import java.util.*;

//This is a test class to check if an expression that a user enters is valid.
public class CheckParentheses_Derek_Deibert extends Stack_Derek_Deibert {

public static void main(String[] args){
   Stack_Derek_Deibert stack = new Stack_Derek_Deibert(); //create new stack object
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter an expression: ");
   String string = input.nextLine();//collects user input as a string
   
   char[] chars = string.toCharArray();//converts string to char array
   
   String p = stack.checkParentheses(chars); //check is user entered char array is valid
   
   System.out.println("Input expression:\t"+string);
   System.out.println("Judgment:\t\t\t"+p);

   }
}
  