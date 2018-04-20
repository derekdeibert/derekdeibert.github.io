// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 9

import java.util.*;
public class SummerStats {
   
public static int mostMoney(int[][] a) {  /* Found the average of each column, placed them in a 1d array (averages) */ 
   double[] totals = new double[3];          
   double rowTotal = 0.0;
   double rowTotal1 = 0.0;
   double rowTotal2 = 0.0;
   
   
   for(int i = 0; i<4; i++){
      rowTotal += a[0][i];
      totals[0] = rowTotal;}
      
   for(int j = 0; j<4; j++){
      rowTotal1 += a[1][j];
      totals[1] = rowTotal1;}
      
   for(int k = 0; k<4; k++){
      rowTotal2 += a[0][k];
      totals[2] = rowTotal2;}
   
   int indexOfBest=0; //used to find index of best year
   double best = totals[0];
   for(int i =0; i < 3; i++) {
      if(totals[i] >= best){
         best = totals[i];
         indexOfBest = i;}
   
      } return indexOfBest;
   }
   
public static int highestSalaryYear(int[][] a) {
   int best = a[0][0];
   int indexOfBest = 0;
   //used nested for loops to compare each element in array. 
   for(int i = 0; i<a.length; i++) {
      for(int j = 0; j<a[i].length; j++) {
         if(a[i][j] > best){//if whatever element is greater than the best element, it then becomes the best element. 
            best = a[i][j];
            indexOfBest = j;}
            }
      }
      return indexOfBest;
   }
   
public static int totalEarnings(int[][] a, int m) {
   int rowTotal = 0;
   
   for(int i = 0; i<4; i++){
      rowTotal += a[m][i];}
      return rowTotal;
   }
   
public static int allEarnings(int[][] a) {
   int sum = 0;
   for(int i = 0; i<a.length; i++) {
      for(int j = 0; j<a[i].length; j++) {
         sum = sum + a[i][j];}
      } return sum;
   }
   
public static int highestSalaryPerson(int[][] a, int m) {
   int best = a[0][0];
   int indexOfBest = 0;
   for(int i = 0; i<a.length; i++) {
      for(int j = 0; j<a[i].length; j++) {
         if(a[i][m] > a[0][0]){
            best = a[i][m];
            indexOfBest = i;}
            }
         } return indexOfBest;        
   }

public static double[] averageSalaryEachYear(int[][] a){
   double[] averages = new double[4];
   double rowTotal = 0.0;
   double rowTotal1 = 0.0;
   double rowTotal2 = 0.0;
   double rowTotal3 = 0.0;
   //found the average of salaries for each year
   for(int i = 0; i<3; i++){
      rowTotal += a[i][0];
      averages[0] = (rowTotal/4);}
      
   for(int j = 0; j<3; j++){
      rowTotal1 += a[j][1];
      averages[1] = rowTotal1/4;}
      
   for(int k = 0; k<3; k++){
      rowTotal2 += a[k][2];
      averages[2] = rowTotal2/4;}
      
   for(int k = 0; k<3; k++){
      rowTotal3 += a[k][3];
      averages[3] = rowTotal3/4;}
    //created array to hold the averages  
   return averages;
   }
 //created obejct to use in test class  
public SummerStats (int r, int c){
   int [][] salaries;  
   salaries = new int[r][c];
   
   for (r = 0; r < salaries.length; r++) {
      for(c = 0; c < salaries[r].length; c++) {
         salaries[r][c] = (int)((Math.random() * 48000) +2000);}
      }
  }
}

