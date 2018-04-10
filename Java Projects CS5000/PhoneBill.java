// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;

public class PhoneBill {

public static void main(String[] args) {

   
double minutesRateR = 0.20;
double monthlyFeeR = 10.00;
double monthlyChargeP = 25.00;
double dayChargeP = 0.10;
double nightChargeP = 0.05;
double amountDue;



      Scanner input = new Scanner(System.in);
      System.out.println ( "Enter the account number:");
         int accountNumber = input.nextInt();
      System.out.println();
 
      System.out.print ("Enter the service type - R for Regular, P for Premium:");
         char service = input.next().charAt(0);
      System.out.println();

      if (service == 'R')
      {
         System.out.print("Enter the number of minutes service used:");
         int minutesUsedR = input.nextInt();
         System.out.println();
        
         if (minutesUsedR <= 50)
         amountDue = 10;
         
         else 
         amountDue =(((minutesRateR - 50) * minutesUsedR)+ monthlyFeeR);
            
         System.out.println("Account Number: " +accountNumber);
         System.out.println("Service Type: " +service);
         System.out.println("Minutes Used: " +minutesUsedR);
         System.out.println("Amount Due: " +amountDue);
      }
      
      else if(service=='p' || service=='P')
      {
         System.out.print("Enter the number of minutes used from 6AM to 6PM:");
            int dayMinutesUsedP = input.nextInt();
            System.out.println();
            
         System.out.print("Enter the number of minutes used from 6PM to 6AM:");
            int nightMinutesUsedP = input.nextInt();
            System.out.println();
            
         if (dayMinutesUsedP <= 75 || nightMinutesUsedP <= 100)
            amountDue = monthlyChargeP;
         else 
            amountDue = (monthlyChargeP + (dayMinutesUsedP - 75)*0.10 + (nightMinutesUsedP - 100)*0.05);
            
         System.out.println("Account Number: " +accountNumber);
         System.out.println("Service Type: " + service);
         System.out.println("Number of Day minutes used: " +dayMinutesUsedP);
         System.out.println("Number of Night minutes used: " +nightMinutesUsedP);
         System.out.println("Amount Due: " +amountDue);
         
         }
    }
}