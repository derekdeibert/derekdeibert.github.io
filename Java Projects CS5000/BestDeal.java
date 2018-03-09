// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;

public class BestDeal {

public static void main(String[] args) {
   //User input for cost of weight of boxes of apples.
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the cost of the large box of apples: ");
      double largeBoxCost = input.nextDouble();
   System.out.println();
   
   System.out.println("Enter weight of the large box of apples: ");
      double largeBoxWeight = input.nextDouble();
   
   System.out.println("Enter the cost of the small box of apples: ");
      double smallBoxCost = input.nextDouble();
      
   System.out.println("Enter the weight of the small box of apples: ");
      double smallBoxWeight = input.nextDouble();
   
   //Finding unit cost(price($)/1 pound) for each box
   double unitRateSmallBox = (smallBoxCost/smallBoxWeight);
   double unitRateLargeBox = (largeBoxCost/largeBoxWeight);
   
   if (unitRateSmallBox < unitRateLargeBox)
      {
      System.out.println("Small Box Weight: "+smallBoxWeight);
      System.out.println("Small Box Cost: "+smallBoxCost);
      System.out.println("Large Box Weight: "+largeBoxWeight);
      System.out.println("Large Box Cost: "+largeBoxCost);
      System.out.println("Judgement: The Small Box is the better deal.");
      }
   if (unitRateSmallBox > unitRateLargeBox)
      {
      System.out.println("Small Box Weight: "+smallBoxWeight);
      System.out.println("Small Box Cost: "+smallBoxCost);
      System.out.println("Large Box Weight: "+largeBoxWeight);
      System.out.println("Large Box Cost: "+largeBoxCost);
      System.out.println("Judgement: The Large Box is the better deal.");
      }

   if (unitRateSmallBox == unitRateLargeBox)
      {
      System.out.println("Small Box Weight: "+smallBoxWeight);
      System.out.println("Small Box Cost: "+smallBoxCost);
      System.out.println("Large Box Weight: "+largeBoxWeight);
      System.out.println("Large Box Cost: "+largeBoxCost);
      System.out.println("Judgement: The boxes are the same price.");
      }
      
   }
}
