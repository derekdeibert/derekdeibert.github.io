// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 6

import java.util.Scanner;

public class WeeklyHours {

public static void main(String[] args) {
  char a;
  Scanner input = new Scanner(System.in);
 
  do {
  int [][] matrix = new int [3][7];
  System.out.print("             Mon Tue Wed Thu Fri Sat Sun");
  System.out.println();
  
  for(int row = 0; row < matrix.length; row++) {
  System.out.print("Employee "+row +"  "); //prints 'Employee' then row number
   for(int column = 0; column<matrix[row].length; column++){
      matrix[row][column] = (int)(Math.random()*10);
      System.out.print("  "+matrix[row][column]+" ");//properly spaces matrix 
      
   }
   System.out.println();
  } 
  System.out.println();
  System.out.println("Employee#        Weekly Hours");
  System.out.println("-----------------------------------------");
  System.out.println("Employee 0            " +addHours(matrix, 0)); 
  System.out.println("Employee 1            " +addHours(matrix, 1));
  System.out.println("Employee 2            " +addHours(matrix, 2));
  
  System.out.println("Do you want to run again? (Y/N) ");
  a = input.next().charAt(0);
   } while (a == 'Y' || a == 'y');
}


public static int addHours(int[][] m, int row) { //addHours method adds all the hours together in the array
   int total = 0;                                  //for a specific row
   for(int column = 0; column<m[row].length; column++) {
   total += m[row][column];
   }
   return total;
  
}
}