// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 11

import java.util.*;
import java.io.*;

public class SumDigits {   
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter a number: ");
      int number = input.nextInt();
      
      int sum = sumDigits(number, 0);
      
      System.out.println();
      System.out.println("Entered Number:\t"+number);
      System.out.println("Digits Sum:\t\t\t"+sum);
      
      
   }
   
public static int sumDigits(int n, int sum) {    
    /* If the number entered is 0, then the method returns 0 (base case). 
       If the number is not zero is then I used the modulo operator to divide each number
       by 10 and add it to the sum (which starts as 0). I had to add the sum = 0 as an argument
       in the method because if it was within the method it would always return 0, regardless
       of number entered. 
     */
      if (n == 0)  {
        return sum;
    } else {
        sum = sum + n % 10;  //recursive variable to keep the digits sum
        n= n/10;
        return sumDigits(n, sum); //returning sum to print it.
    }
   }
} 
   