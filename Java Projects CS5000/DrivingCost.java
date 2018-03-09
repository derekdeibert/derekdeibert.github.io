// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 1

import java.util.Scanner;

public class DrivingCost {
   private static Scanner sc;
   
   public static void main(String[] args){
      double miles;
      double mpg;
      double gas;
      double dollars;
      
      sc = new Scanner(System.in);
      System.out.println("Enter the Distance of your trip in miles");
      miles = sc.nextInt();
      
      sc = new Scanner(System.in);
      System.out.println("Enter the fuel efficiency of your car in miles per gallon");
      mpg = sc.nextInt();
      
      sc = new Scanner(System.in);
      System.out.println("Enter the price of gas");
      gas = sc.nextInt();
      
      
   dollars = mpg * gas;
      System.out.println("The cost of your trip is" +dollars);
      }
}

 //This program only works for whole number values.
 //I tried changing the type from double to float, but that didn't work.
 //Do you have any suggestions? I feel like there is an easy fix, but I can't figure it out. 
 
  