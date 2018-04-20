// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 9

import java.util.*;
public class TestSummerStats {
public static void main(String[] args) {

   int[][] salaries;
   int employees = 3;
   int years = 4;
   
   salaries = new int[employees][years];
   //creates 2d array of salaries
   for(int i = 0; i < salaries.length; i++) {
      for(int j = 0; j < salaries[i].length; j++) {
         salaries[i][j] = (2000 + (int)(Math.random()*(48000 + 1)));}
      }
   
   System.out.println("Employee Data: ");
   
   for(int i=0; i<years; i++){
   System.out.print("\t\t\t\tYear "+i);}
   System.out.println();
   System.out.println("\t\t\t\t------------------------------------------------------------");
   
   for (int i = 0; i < salaries.length; i++) {
      System.out.print("Employee "+i+":  ");
         for(int j = 0; j < salaries[i].length; j++) {
            salaries[i][j] = (2000 + (int)(Math.random()*(48000 + 1)));
            System.out.printf("$%,d\t\t\t\t",salaries[i][j]);}
            System.out.println();}
            System.out.println();
     //creates object       
   SummerStats test = new SummerStats(employees, years);
   
   int mostMoney = test.mostMoney(salaries);
   System.out.println("Employee "+mostMoney+" made the most money over the years.");
         
   int bestYear = test.highestSalaryYear(salaries);
   System.out.println("Highest salary was made in year "+bestYear);
   
   int totalEarnings = test.totalEarnings(salaries, 1);
   System.out.printf("Total earning by Employee 1 is $%,d",totalEarnings);
   System.out.println();
   
   int allEarnings = test.allEarnings(salaries);
   System.out.printf("Total earnings by all employees is $%,d",allEarnings);
   System.out.println();
   
   int highest = test.highestSalaryPerson(salaries, 3);
   System.out.println("In year 3 Employee "+highest+" has the highest salary.");
   
   System.out.println("The average salary for year: ");
   double [] average = test.averageSalaryEachYear(salaries);
   System.out.println("\t\tYear 0\t\t\tYear 1\t\t\tYear 2\t\t\tYear 3");
   System.out.println("\t\t--------------------------------------------------------");
   System.out.printf("\t\t$%,.2f",average[0]);
   System.out.printf("\t\t$%,.2f",average[1]);
   System.out.printf("\t\t$%,.2f",average[2]);
   System.out.printf("\t\t$%,.2f",average[3]);
   

   }
}
