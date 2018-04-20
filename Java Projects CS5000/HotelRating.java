// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 9

import java.util.*;
public class HotelRating {

public HotelRating(int r, int c){//created object for use in test class
   int [][] ratings;  
   ratings = new int[r][c];
   
   for (r = 0; r < ratings.length; r++) {
      for(c = 0; c < ratings[r].length; c++) {
         ratings[r][c] = (int)((Math.random() * 100) % 5 +1);}
      }
  }
 
public static int[] fiveStarHotels(int[][] a){
   int [] fiveStarLocation = new int[12];//creates 1d array of 12 integers (3 hotels * 4 years)
   int count = 0;
   for(int i = 0;i<a.length; i++) {
      for(int j = 0; j<a[i].length; j++) {
         if(a[i][j]==5){
         fiveStarLocation[count] = i;
         }
         else fiveStarLocation[count]=-1;
         count++;}//places -1 in array if not a 5 star hotel, this made it easy to print the non-negative values
      }
      return fiveStarLocation;
         
}

public static int bestHotel(int[][] a) {
   double[] averages = new double[3];
   double rowTotal = 0.0;
   double rowTotal1 = 0.0;
   double rowTotal2 = 0.0;
   double rowAverage;
   
   for(int i = 0; i<4; i++){
      rowTotal += a[0][i];
      averages[0] = (rowTotal/4);}//Average of Hotel 0
      
   for(int j = 0; j<4; j++){
      rowTotal1 += a[1][j];
      averages[1] = rowTotal1/4;}//Average of Hotel 1
      
   for(int k = 0; k<4; k++){
      rowTotal2 += a[0][k];
      averages[2] = rowTotal2/4;}//Average of Hotel 2
   
   int indexOfBest=0;
   double best = averages[0];
   for(int i =0; i<3; i++) {//compares each average in the array, returns indes of greatest
      if(averages[i]>=best){
         best = averages[i];
         indexOfBest = i;}
   
   } return indexOfBest;

}

public static int[] fourOrMoreStars(int[][] a){
   int [] fourStars = new int[12];//similar logic to fiveStarHotels method.
   int count = 0;
   for(int i = 0;i<a.length; i++) {
      for(int j = 0; j<a[i].length; j++) {
         if(a[i][j] >= 4){
         fourStars[count] = i;
         }
         else fourStars[count]=-1;
         count++;}
      }
      return fourStars;
         
}

public static double[] averageRatings(int[][] a){
   double[] averages = new double[3];
   double rowTotal = 0.0;
   double rowTotal1 = 0.0;
   double rowTotal2 = 0.0;
   double rowAverage;
   for(int i = 0; i<4; i++){
      rowTotal += a[0][i];
      averages[0] = (rowTotal/4);}//Average of Hotel 0
      
   for(int j = 0; j<4; j++){
      rowTotal1 += a[1][j];
      averages[1] = rowTotal1/4;}//Average of Hotel 1
      
   for(int k = 0; k<4; k++){
      rowTotal2 += a[0][k];
      averages[2] = rowTotal2/4;}//Average of Hotel 2
      
   return averages;
   }

public static int worstHotel(int[][] a) {
   double[] averages = new double[3];//similar logic to bestHotel method
   double rowTotal = 0.0;
   double rowTotal1 = 0.0;
   double rowTotal2 = 0.0;
   double rowAverage;
   for(int i = 0; i<4; i++){
      rowTotal += a[0][i];
      averages[0] = (rowTotal/4);}//Average of Hotel 0
      
   for(int j = 0; j<4; j++){
      rowTotal1 += a[1][j];
      averages[1] = rowTotal1/4;}//Average of Hotel 1
      
   for(int k = 0; k<4; k++){
      rowTotal2 += a[0][k];
      averages[2] = rowTotal2/4;}//Average of Hotel 2
   
   int indexOfWorst = 0;
   double worst = averages[0];
   for(int i =0; i<3; i++) {
      if(averages[i]<=worst){
         worst = averages[i];
         indexOfWorst = i;}
   
      } return indexOfWorst;    
   }

public static void printChart(int[][] a, int r, int c) {
String[][] stars= new String[r][c];
for(int i = 0;i <a.length; i++){
   for(int j = 0;j < a[i].length; j++){
      if(a[i][j] == 1){
         stars[i][j] = "*    ";}//used spaces to allow for proper spacing when printing
      if(a[i][j] == 2){
         stars[i][j] = "**   ";}
      if(a[i][j] == 3){
         stars[i][j] = "***  ";}
      if(a[i][j] == 4){
         stars[i][j] = "**** ";}
      if(a[i][j] == 5){
         stars[i][j] = "*****";}
      }
   } 
   for (int i = 1; i< 5; i++){
   System.out.print("\t\t\t\tYear "+i);}
   System.out.println();
   System.out.println("---------------------------------------------------------------------------");
   for(int i = 0;i <a.length; i++){
         System.out.print("Hotel "+i+":");
         
      for(int j = 0;j < a[i].length; j++){
         
         System.out.print("\t\t"+stars[i][j]+"\t\t\t");}
         System.out.println();
         }
  }    

public static boolean anyFiveStars(int[][] a) {
boolean anyFives = false;

for(int i = 0; i<a.length; i++) {
   for(int j = 0; j<a[i].length; j++){
      if(a[i][j] == 5) {
      anyFives = true;}
      }
   }
 return anyFives;
    
   }
}


      




