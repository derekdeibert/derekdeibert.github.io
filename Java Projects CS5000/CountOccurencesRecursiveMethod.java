// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 11

import java.util.*;
import java.lang.*;
import java.io.*;

public class CountOccurences {   
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a string: ");
      String userInput = input.nextLine(); //collects user input as String
      
   System.out.print("Which character would you like to count? ");
      char character = input.next().charAt(0); //collects user input about which character to count
      String C = Character.toString(character);
      
   System.out.println();
   System.out.println("Entered String:\t\t\t"+userInput);
   System.out.println("Entered Character:\t\t"+character);
   System.out.println("Occurences of letter:\t"+countChar(userInput,C));
   }
   
public static int countChar(String a, String character) {
    /*If the length of the string is 0, then the method returns 0.
      If the length of the string is greater than 0 the the method creates a substring
      that looks at the first two characters of the substring to see if they are equal 
      to the character the user input to count. It then re-runs the method again until the string is 
      looked at completely. */
    
    if(a.length()==0) {
        return 0;
    }

    if ((a.substring(0,1).equals(character))) {
        return 1 + countChar(a.substring(1), character);
    }

    return countChar(a.substring(1), character);
   }
}
   
   

