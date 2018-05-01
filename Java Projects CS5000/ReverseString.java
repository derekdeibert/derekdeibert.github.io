// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 11

import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverseString {

public static void main(String[] args) {
      //input scanner
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter a string: ");
   String userInput = input.nextLine(); //collects user input as String
   
      //print user entered string
   System.out.print("Entered String:\t");
   System.out.println(userInput);
   
      //prints out reversed string
   System.out.print("Reversed String:\t");
   reverse(userInput);
   
   }
   
public static void reverse(String a) {
        /*If the string is null or length is less than or equal to 1, the 
        method just prints out the string. If the string is >=2 then this method
        prints out the last letter of the string first, then creates a substring 
        that is reversed from the index of 0 to the index of the last letter.*/
        if ((a == null) || (a.length() <= 1))
           System.out.println(a);
        
        else
        {
            System.out.print(a.charAt(a.length()-1));
            reverse(a.substring(0 , a.length()-1));
        }
    }

   
}
