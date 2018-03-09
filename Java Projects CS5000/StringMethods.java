// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;

public class StringMethods {

public static void main(String[] args) {

//Collects user input for Strings 1 and 2. I said at least 
//3 characters so that my substring command would work. 
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a string of at least 3 characters: ");
      String string1 = input.next();
      
   System.out.println("Enter another string of at least 3 characters: ");
      String string2 = input.next();
   
   //Finds length of String 1   
   int string1Length = string1.length();
   //Finds length of String 2
   int string2Length = string2.length();
   //Converts String 1 to Uppercase
   String string1Upper = string1.toUpperCase();
   //Converts String 2 to Lowercase
   String string2Lower = string2.toLowerCase();
   //Creates substring of all the characters after the third in String 1
   String string1Sub = string1.substring(2);
   
   System.out.println(" a) Length of String 1: \t" +string1Length +" Characters");
   System.out.println(" b) Length of String 2: \t" +string2Length +" Characters");
   System.out.println(" c) Concatenation: \t\t\t" +string1 +" " +string2);
   
   //I decided to use an if statement do the equal, not equal
   //outputs. I kept getting errors when I would try to compare
   //the strings in a single print output. 
   if (string1Length == string2Length) {
   System.out.println(" d) Equal Strings?" +" \t\t\tEqual");
   }
   
   if (string1Length != string2Length) {
   System.out.println(" d) Equal Strings?" +" \t\t\tNot Equal");
   }
   
   System.out.println(" e) Uppercase String 1: \t" +string1Upper);
   System.out.println(" f) Lowercase String 2: \t" +string2Lower);
   System.out.println(" g) Valid Substring: \t\t" +string1Sub);
   
   
   }
}
      
   
      