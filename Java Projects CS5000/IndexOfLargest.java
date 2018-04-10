// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 6

import java.util.Scanner;

public class IndexOfLargest {
	
	public static void I1() {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10]; // Create an array of length ten
      String a;
		
		
      
      do{System.out.println("Enter ten integers: ");//Collects 10 integers from user
      
      for (int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();}//Defines array "numbers" as the 10 integers the user enters.
         
		System.out.print("Entered Integers: \t\t");
      for (int i = 0; i < numbers.length; i++){
			System.out.print(+numbers[i]+" ");}//used for statement to print all numbers in array
      System.out.println();
      System.out.println("Index of Largest Value: " +findIndex(numbers));//called findIndex method to display index of largest number
	   
         
      System.out.println("Do you want to continue? (Y/N): ");//ends loop if user enters N
         a =input.next();
      } while (a != "N");
    }
      
     
	public static int findIndex(int[] array) {
		int largest = array[0];
		int maximumIndex = 0;
		for (int i = 1; i < array.length; i=i+1) {
			if (array[i] > largest) {//If the integer at index i is larger than the integer at index 0,
				largest = array[i];     //then the index of that number becomes the "largest" variable.
				maximumIndex = i;//Maximum index is i (which could also just be 9 since we are only entering 10 numbers)
			}
		}
		return maximumIndex;
	}
}