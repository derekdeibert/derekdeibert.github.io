// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 4

import java.util.Scanner;
import java.lang.Math;

public class InputSum {

public static void main(String[ ] arg) {
     //declare variables
     int sum=0; 
     int integers; 
     int count=0;
     String n;
     //collect user input
     
     Scanner input=new Scanner(System.in);
     System.out.println("Enter an integer (-1 to quit); ");
     integers = input.nextInt();
     n = Integer.toString(integers);
     
   //while loop used to check entered integers >= 0
   while(integers>=0){
       //calculates sum
      sum=sum+integers;
      
      System.out.println("Enter an integer (-1 to quit); ");
      integers = input.nextInt();
      }
      
   //I've tried about 12 different methods to print all the entered
   //integers, but I couldn't figure it out. However, the program
   //does work to find the sum. 
   System.out.println("Entered Numbers: "+n);   
   System.out.println("The Sum:\t\t\t\t"+sum);
   }
 }

   