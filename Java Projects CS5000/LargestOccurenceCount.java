// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 4

import java.util.Scanner;

public class LargestOccurenceCount {
public static void main(String[] args){
   //declaring variables
   int largest=0;
   int occurrence = 0;
   int number;
   String x;
   //collecting user input
   Scanner input = new Scanner(System.in);
   System.out.print("Enter positive interger values: ");
   number=input.nextInt();
   x=Integer.toString(number);
   do{
      System.out.print("Enter positive interger values: ");
      number=input.nextInt();
      //If the number is greater than the largest variable (>0) this 
      //if statement will make the number entered equal to the largest
      if(number>largest){
         occurrence=0;
         largest = number;
         }
         
      //if the number is equal to the largest variable this if statement will 
      //update the occurrence of that number.
      if(number==largest){
         occurrence++;
         }
        
     } while(number !=0);
     
     System.out.println("You entered:\t" +x +","+number);
     System.out.println("Largest Value: " +largest);
     System.out.println("Occurences: \t"+occurrence);
     }
}
   
