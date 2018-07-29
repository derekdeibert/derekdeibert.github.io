// Name:          Derek Deibert   
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    1

//This is to test class LinkedList. Create and print out a simple list

import java.util.Scanner;

public class myTest
{
   public static void main (String[] args)
   {
      LinkedList myList = new LinkedList(); //create a list object
   
      for (int i=1; i <= 5; i++) //add 5 nodes to the list
      {
         myList.addLastNode(i);
      } 
      
      System.out.println("Testing method addLastNode()");
      System.out.println("Adding 100 as last node.");
      System.out.print("List conent before adding 100 is:\t");
      myList.printList();
      myList.addLastNode(100);
      System.out.print("List content after adding 100 is:\t");
      myList.printList();
      System.out.println();
      //testing method 1 complete
      
      System.out.println("Testing method addFirstNode()");
      System.out.println("Adding 9 as first node.");
      System.out.print("List conent before adding 9 is:\t");
      myList.printList();
      myList.addFirstNode(9);
      System.out.print("List content after adding 9 is:\t");
      myList.printList();
      System.out.println();
      //testing method 2 complete
      
      System.out.println("Testing method addAtIndex()");
      System.out.println("Adding 7 at index 4");
      System.out.print("List content before adding 7 is:\t");
      myList.printList();
      myList.addAtIndex(4, 7);
      System.out.print("List content after adding 7 is:\t");
      myList.printList();
      System.out.println();
      //testing method 3 complete
      
      System.out.println("Testing method removeFirstNode()");
      System.out.println("Removing 9 as the first node");
      System.out.print("List content before removing 9 is:\t");
      myList.printList();
      myList.removeFirstNode();
      System.out.print("List content after removing 9 is:\t");
      myList.printList();
      System.out.println();
      //testing method 3 complete
      
      System.out.println("Testing method removeLastNode()");
      System.out.println("Removing 100 as the last node");
      System.out.print("List content before removing 100 is:\t");
      myList.printList();
      myList.removeLastNode();
      System.out.print("List content after removing 100 is:\t\t");
      myList.printList();
      System.out.println();
      //testing method 4 complete
      
      System.out.println("Testing method removeAtIndex");
      System.out.println("Removing 3 at index 2");
      System.out.print("List content before removing 3 is:\t");
      myList.printList();
      myList.removeAtIndex(2);
      System.out.print("List content after removing 3 is:\t");
      myList.printList();
      System.out.println();
      //testing method 5 complete
     } 
}
    
