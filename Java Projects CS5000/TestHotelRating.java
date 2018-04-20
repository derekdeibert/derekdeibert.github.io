// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 9

import java.util.*;
import java.util.Arrays;
public class TestHotelRating {

public static void main(String[] args) {
   //Declare variables
   int [][] ratings;  
   int hotels = 3;
   int years = 4;
   //cretes 2D array of Hotel Ratings
   ratings = new int[hotels][years];
   for (hotels = 0; hotels < ratings.length; hotels++) {
      for(years = 0; years < ratings[hotels].length; years++) {
         ratings[hotels][years] = (int)((Math.random() * 100) % 5 +1);}
   }
   //Create object
   HotelRating test = new HotelRating(hotels, years);
         /* Prints index of 5 star hotels using method in HotelRating class. */
         int[] location = test.fiveStarHotels(ratings);
         System.out.print("Five star hotel indices: ");
         for(int i =0; i<12; i++){if(location[i]>=0){ //Used if statment to print the indexes
         System.out.print(location[i]+", ");}}
         System.out.println();
         
        /* Prints average rating of each hotel using method in HotelRating class. */
         System.out.print("Average Ratings are: ");
         System.out.println();
         double[] averages = test.averageRatings(ratings);
         for(int i =0; i<averages.length; i++){
            System.out.println("\t\t\tHotel "+i+": "+averages[i]);}
            
        /* Prints index of 4 or more star hotels using method in HotelRating class. */
         int [] fourStars = test.fourOrMoreStars(ratings);
         System.out.print("Four or more stars hotel indices: ");
         for(int i =0; i<12; i++){if(fourStars[i]>=0){
            System.out.print(fourStars[i]+", ");}}
            System.out.println();
            
         boolean anyFiveStar = test.anyFiveStars(ratings);
         System.out.println("Any five star hotel?  "+anyFiveStar);
         
         int bestHotel = test.bestHotel(ratings);
         System.out.println("Index of best hotel: "+bestHotel);
         
         int worstHotel = test.worstHotel(ratings);
         System.out.println("Index of worst hotel: "+worstHotel);
       
         System.out.println("Ratings Chart: ");
         test.printChart(ratings, hotels, years);
     }
         
           
  
  
  
  
  
   
   
   
   
  }
