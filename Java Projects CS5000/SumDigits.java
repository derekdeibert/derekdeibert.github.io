// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 1

import java.util.Scanner;

public class SumDigits {
   private static Scanner sc;
   
   public static void main(String[] args){
      int Number, Remainder, Sum = 0;
      sc = new Scanner(System.in);
      System.out.println("Enter any number LESS THAN 10,000");
      Number = sc.nextInt();
   
      while(Number > 0) {
         Remainder = Number % 10;
         Sum = Sum + Remainder;
         Number = Number / 10;
      }
      System.out.format("Sum of the digits of entered number:" + Sum);
   }
}