// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 7

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxAvg {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//Declare Variables
char c;
int[][] Grades = new int [4][4];
int [] all = minMaxAvg(Grades); //printing all array gives random values like [I@75b84c92
String everything = Arrays.toString(all);//printing 'everything' gives a string with all zeros

do{
System.out.println("Grades: ");
for(int row = 0; row < Grades.length; row++) {
   for(int column = 0; column<Grades[row].length; column++){
      
      Grades[row][column] = (int)(Math.random()*100);//each value in array will be a random number between 0 and 100.
       System.out.print(+Grades[row][column]+"\t");     
   }
   
   System.out.println();
   
  }
  System.out.println();
  System.out.println("Highest grade: \t"+getMax(Grades));
  System.out.println("Lowest grade: \t\t"+getMin(Grades));
  System.out.printf("Class average: \t%.2f ",getAverage(Grades)/16); 
  System.out.println();
  //System.out.println(all);  //Array returns all 0 values
  System.out.println("Do you wish to continue? (Y/N) ");
   c = input.next().charAt(0); 
 } while(c == 'Y' || c == 'y');
}

public static int[] minMaxAvg(int [][] a){//I tried using 1 method to find the min, max, and avg,
int [] all = new int [3];                 //however, I kept getting zeros in my array that was
int total = 0;                            //returned. I cannot figure out what is wrong, especially
int maxValue = a[0][0];                   //since I know my code works and compiles. 
int minValue = a[0][0];
for(int i = 0; i < a.length; i++) {
   for(int j = 0; j < a[0].length; j++) {
   if(a[j][i] > maxValue) {
      maxValue = a[j][i];}
   all[0] = maxValue;
   if(a[j][i] < minValue) {
   minValue =a[j][i];}
   all[1] = minValue;
   total += a[i][j];
   all[2] = total;}
   }
 return all;
}
   
   
public static double getAverage(int[][] a) { //used this code to find the sum of all values in 
double total=0;                              //the Grades array (then divided by 16 to find
for(int i = 0; i < a.length; i++) {          //the average in main method).
   for(int j = 0; j < a[0].length; j++) {
   total += a[i][j]; }
   }
   return total;
  }
  
public static int getMax(int[][] a) {  //Used to find Max value. Compared each value in the array
int maxValue = a[0][0];                //to the first value a[0][0]. If the new value was larger
for(int i = 0; i < a.length; i++) {    //it became the maxValue variable.
   for(int j = 0; j < a[0].length; j++) {
      if(a[j][i] > maxValue) {
      maxValue = a[j][i];}
      }
   }
   return maxValue;
 }
 
public static int getMin(int[][] a) {  //Same reasoning as the getMax method above only in reverse.
int minValue = a[0][0];
for(int i = 0; i < a.length; i++) {
   for(int j = 0; j < a[0].length; j++) {
   if(a[j][i] < minValue) {
   minValue =a[j][i];}
   }
  }
   return minValue;
 
  }
}

