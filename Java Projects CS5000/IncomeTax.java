// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 2


import java.util.Scanner;

public class IncomeTax {

public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
   //User input for income
   System.out.print("Enter your income:");
   double income = input.nextDouble();
   
   //Used if statements to differentiate income levels and tax brackets.
   if (income <= 50000)
      System.out.println("Your income is $" +income +" and your tax bracket is 5%");
      
   if (income >50000 && income <=100000)
      System.out.println("Your income is $" +income +" and your tax bracket is 15%");
   
   if (income >100000 && income <=150000)
      System.out.println("Your income is $" +income +" and your tax bracket is 20%");
      
   if (income >150000 && income <=250000)
      System.out.println("Your income is $" +income +" and your tax bracket is 30%");
      
   if (income >250000 && income <=500000)
      System.out.println("Your income is $" +income +" and your tax bracket is 35%");
      
   if (income >500000)
      System.out.println("Your income is $" +income +" and your tax bracket is 50%");
   
   }
   
}