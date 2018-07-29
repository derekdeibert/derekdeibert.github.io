// Name:          Derek Deibert  
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    3

import java.util.*;

public class TestQueue_Derek_Deibert {

   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   Queue_Derek_Deibert myQueue = new Queue_Derek_Deibert();
   
   System.out.print("Enter 6 integers: ");
   int[] numbers = new int[6];
   
   
   for(int i = 0;i<numbers.length;i++) {
      numbers[i] = input.nextInt();
      myQueue.enqueue(numbers[i]);
      }
      
   System.out.println("Testing method enqueue(): ");
   System.out.print("Queue is:\t\t\t\t\t");
   myQueue.printQueue();
   System.out.println();
   
   System.out.println("Testing method dequeue(): ");
   System.out.print("Queue before method is:\t");
   myQueue.printQueue();
   System.out.print("Queue after method is:\t");
   myQueue.dequeue();
   myQueue.printQueue();
   System.out.println();
   
   System.out.println("Testing method front(): ");
   System.out.print("Queue before method is:\t");
   myQueue.printQueue();
   int first = myQueue.front();
   System.out.print("Integer at the front of the queue:\t"+first);
   System.out.println();
   System.out.println();
   
   System.out.println("Testing method size(): ");
   System.out.print("Queue before method is:\t");
   myQueue.printQueue();
   int size = myQueue.size();
   System.out.print("Size of queue:\t\t\t\t"+size);
   System.out.println();
   System.out.println();
   
   System.out.println("Testing method isEmpty(): ");
   System.out.print("Queue before method is:\t");
   myQueue.printQueue();
   boolean empty = myQueue.isEmpty();
   System.out.print("Is queue empty?:\t\t\t"+empty);
   System.out.println();
   
   }
   
}