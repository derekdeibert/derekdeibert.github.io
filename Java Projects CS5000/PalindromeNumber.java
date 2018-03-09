// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 2


import java.util.Scanner;

public class PalindromeNumber {

public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
   //User input for 5 digit number.
   System.out.print("Enter a 5 digit number:");
   int number = input.nextInt();
   //Dividing the number by 10000 will give us the first digit. Example, 45654/10000=4
   int firstNumber = number/10000;
   int a = number%10000;//Gives the remainder when dividing by 10000.Example 45654%10000=5654
   int secondNumber = a/1000; //Divide remainder by 1000 gives 2nd digit. Example 5645/1000=5
   int b = a%1000; //gives remainder when dividing by 1000, Example 5654%1000=654
   int c = b%100; //gives remainder when dividing by 100, Example 654%100=54
   int fourthNumber = c/10; //dividing by 10 will yield a 2 digit number. Example 54/10=5
   int fifthNumber = c%10; //the remainder when dividing by 10 will yield a 1 digit number that is the last digit. 
                           //example 54%10=4
if (firstNumber == fifthNumber && secondNumber == fourthNumber)
      System.out.print("Your number " +number +" IS a palindrome");
      //if the first digit and the fifth digit are the same, and the 
      //second and fourth are the same, the number is a palindrome.
      
if(firstNumber != fifthNumber)
      System.out.print("Your number " +number +" is NOT a palindrome");
      //If the numbers are not equal, then it is not a palindrome. 
   
   }
}
   