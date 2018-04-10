// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 6

import java.util.Scanner;

public class MatrixAddition {

public static void main(String[] args) {

//Declare variables
int[][] matrixA = new int[3][3];
int[][] matrixB = new int[3][3];
char c;

Scanner input = new Scanner(System.in);
//Used do/while loop with sentinel value of c 
do{
//Collects user entered integers for matrix A
System.out.println("Enter "+matrixA.length +" rows and "+matrixA[0].length +" columns: ");
for(int row = 0; row < matrixA.length; row++){
   for(int column = 0; column < matrixA[row].length; column++) {
      matrixA[row][column] = input.nextInt();} 
   }
//Collects user entered integers for matxtrix B  
System.out.println("Enter "+matrixB.length +" rows and "+matrixB[0].length +" columns: ");
for(int row = 0; row < matrixB.length; row++){
   for(int column = 0; column < matrixB[row].length; column++) {
      matrixB[row][column] = input.nextInt();} 
   }


System.out.println("Matrix A: ");//Prints Matrix A
for(int row = 0; row < matrixA.length; row++){
   for(int column = 0; column < matrixA[row].length; column++) {
      System.out.print(matrixA[row][column]+"\t");} 
    System.out.println();
    }

System.out.println("Matrix B: "); //Prints Matrix B 
for(int row = 0; row < matrixB.length; row++){
   for(int column = 0; column < matrixB[row].length; column++) {
      System.out.print(matrixB[row][column]+"\t");} 
    System.out.println();
   }
System.out.println("Matrix A + B: ");//Prints sum of A + B 
 for(int i=0;i < matrixA.length; i++){
 int[][] sum = addMatrix(matrixA, matrixB);//creates new matrix (sum) from method below.
   for (int k = 0; k < sum[i].length; k++){
   
      System.out.print(+sum[i][k]+"\t");}
      System.out.println();
     }
 System.out.println("Do you wish to continue? (Y/N) ");
   c =input.next().charAt(0); 
 }while(c != 'n' || c != 'N');//Sentinel value of N or n
}


public static int[][] addMatrix(int[][] a, int[][] b) {
   int[][] sum = new int[a.length][a[0].length];//creates new matrix with the parameters of 
                                                //the first matrix in the method
   
   for(int row = 0; row < a.length; row++){
      for(int column = 0; column < a[0].length; column++) {
      
      sum[row][column] = a[row][column] + b[row][column];}
      }
      return sum;//returns new matrix (sum) when method is called. 
}
          


  
  }
 