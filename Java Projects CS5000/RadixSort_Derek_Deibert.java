// Name:          Derek Deibert  
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    3
import java.lang.Math;
import java.util.Scanner;
public class RadixSort_Derek_Deibert extends Queue_Derek_Deibert {
   
   public static void main(String[] args) {
      int[] numbers = new int[6]; 
      Scanner s = new Scanner(System.in);
      System.out.print("Enter 6 positive integers: ");
      for(int i = 0; i<6; i++) {
         
         numbers[i] = s.nextInt();}
      
      System.out.print("Inputs before sorting:\t"); 
         for(int i = 0; i<6; i++) {
         System.out.print(numbers[i]+"\t\t");}
         System.out.println(" ");
      int[] x = radixSort(numbers);
      
      System.out.print("Inputs after sorting:\t");
      for(int i = 0; i<6; i++) {
      System.out.print(x[i]+"\t\t");
      }    
   }
     
   public static int[] radixSort(int[] input) {
      int exp = countDigits(input); //exp is the number of digits in the largest number the user enters

      //Create queues for sorting
      Queue_Derek_Deibert Q0 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q1 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q2 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q3 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q4 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q5 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q6 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q7 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q8 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert Q9 = new Queue_Derek_Deibert();
      Queue_Derek_Deibert last = new Queue_Derek_Deibert();

   int start = 1;
   int[] p = input;
   int[] digits = extractDigit(input, start);
   //loop runs for values entered that are less than 100 digits
   while(start <= 100) {
      /*Places numbers into queues based on the digit being processed.*/
      for(int i = 0; i < 6; i++) {
         if(digits[i] == 0) Q0.enqueue(p[i]);
         else if(digits[i] == 1) Q1.enqueue(p[i]);
         else if(digits[i] == 2) Q2.enqueue(p[i]);
         else if(digits[i] == 3) Q3.enqueue(p[i]);
         else if(digits[i] == 4) Q4.enqueue(p[i]);
         else if(digits[i] == 5) Q5.enqueue(p[i]);
         else if(digits[i] == 6) Q6.enqueue(p[i]);
         else if(digits[i] == 7) Q7.enqueue(p[i]);
         else if(digits[i] == 8) Q8.enqueue(p[i]);
         else Q9.enqueue(p[i]);
         }
      //creates a new queue (last) populated in order from the queues used above   
     while (Q0.size() != 0) {
         last.enqueue(Q0.dequeue());
         int size =Q0.size();
         size--;}
     while (Q1.size() != 0) {
         last.enqueue(Q1.dequeue());
         int size =Q1.size();
         size --;}
     while (Q2.size() != 0) {
         last.enqueue(Q2.dequeue());
         int size =Q2.size();
         size --;}
     while (Q3.size() != 0) {
         last.enqueue(Q3.dequeue());
         int size =Q3.size();
         size --;}  
     while (Q4.size() != 0) {
         last.enqueue(Q4.dequeue());
         int size =Q4.size();
         size --;} 
     while (Q5.size() != 0) {
         last.enqueue(Q5.dequeue());
         int size =Q5.size();
         size --;} 
     while (Q6.size() != 0) {
         last.enqueue(Q6.dequeue());
         int size =Q6.size();
         size --;}
     while (Q7.size() != 0) {
         last.enqueue(Q7.dequeue());
         int size =Q7.size();
         size --;}
     while (Q8.size() != 0) {
         last.enqueue(Q8.dequeue());
         int size =Q8.size();
         size --;}
     while (Q9.size() != 0) {
         last.enqueue(Q9.dequeue());
         int size =Q9.size();
         size --;}
         //create new array from the values in the queue last
         for(int i = 0; i<6; i++) {
            p[i] = last.dequeue();}

      start++;
      digits = extractDigit(p, start);
      } 

   return p;
}

   
   public static int countDigits(int[] input) { //returns an int value of the number of digits in the largest number
      int max = input[0];//first value is temporarily the max value
      int count = 0;
      for(int i = 0; i<input.length; i++) {
         if(input[i] > max) {
            max = input[i];
         }
      }
      while(max > 0) {
         max = max /10;
         count++;
      }
      return count;  
   }
   

   
   public static int[] extractDigit(int[] input, int exp) {
   int[] input2 = new int[input.length];
   int x = (int)Math.pow(10, exp);
   int y = (int)Math.pow(10, exp - 1);
      for(int i = 0; i < input.length; i++) {
         input2[i] = (input[i] % x)/(y);
         }
      return input2;
   }

}