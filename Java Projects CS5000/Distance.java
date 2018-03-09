// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 1

import java.util.Scanner;

public class Distance {
   private static Scanner sc;
   
   public static void main(String[] args){
      int x1, y1, x2, y2;
      double dis;
      
      sc = new Scanner(System.in);
      System.out.println("Enter x coordinate for point 1");
      x1 = sc.nextInt();
      
      sc = new Scanner(System.in);
      System.out.println("Enter y coordinate for point 1");
      y1 = sc.nextInt();
      
      sc = new Scanner(System.in);
      System.out.println("Enter x coordinate for point 2");
      x2 = sc.nextInt();
      
      sc = new Scanner(System.in);
      System.out.println("Enter y coordinate for point 2");
      y2 = sc.nextInt();
      
   dis = Math.pow((x2-x1)*(x2-x1)+(y2-y2)*(y2-y1), 0.5);
      System.out.println("The distance between your points is" +dis);
      }
}

//Program works, but I can't figure out how to 
//print the number with more decimal places. It is rounding
//the value to the nearest whole number. 