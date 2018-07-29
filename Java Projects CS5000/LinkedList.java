// Name:          Derek Deibert  
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    1

// This class defines a linked list that stores integer values.

public class LinkedList
{
   public static Node head, tail;
   public static int size;
  
   //constructor method to create a list object with head, tail, and size. 
   public LinkedList()
   {
      head = null;  // list head pointer
      tail = null;  // list tail pointer
      size = 0;     // list size
   }
  
   //method to add a node to the end of list
   public void addLastNode(int data) 
   {
      if (tail == null) 
         head = tail = new Node(data); //empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to new last node
      }
      size++; //increase list size by one
   }
   
   
   //================= your part to complete for assignment 1 =============
   
   //method to add a new node as the first node in the list
   public void addFirstNode(int data)
   {
      if(head == null)
         head = new Node(data);
      else
      {
         Node temp = head;
         head = new Node(data);
         head.next = temp;
         
      }
    size++;
   }
      
   //method to add a node at specific position, namely index
   public void addAtIndex(int index, int data)
   {
      if (index == 0) addFirstNode(data);
      else if (index >= size) addLastNode(data);
      else { 
         Node current = head;
         for (int i = 1; i < index; i++) {
         current = current.next;
         }
         Node temp = current.next;
         current.next = new Node(data);
         (current.next).next = temp;
         size++;
         }
   }
      
   //method to remove the first node from the list
   public Node removeFirstNode()
   {
      if (size == 0) return null; // Nothing to delete
		else {
			Node temp = head; // keep the first node temporarily
			head = head.next; // Move head to point to next node
			size--; // Reduce size by 1
			return temp; // Return the deleted element
		}   
      
   }
      
   //method to remove the last node from the list
   public void removeLastNode()
  {
      Node previous = head;
      int count = 1;
      int index = size-1;
      
      while(count < index) {
         previous = previous.next;
         count++;
      }
      Node current = previous.next;
      previous.next = current.next;
      current.next = null;
	} 
   
 
      
   //method to remove a node at specific position,namley index
   public void removeAtIndex(int index)
   {
      Node previous = head;
      int count = 1;
      
      while(count < index) {
         previous = previous.next;
         count++;
      }
      Node current = previous.next;
      previous.next = current.next;
      current.next = null;
	} 
   
   //I could not get this method to work. I tried changing it around several different ways,
   //but I kept getting the same error--error: incompatible types: LinkedList.Node cannot be converted to int
   

   /*
   public Node head2, tail2;
   private int size2;
   
   //method copy list
   public LinkedList copyList()
   {  
      
      LinkedList List2= new LinkedList();
      List2 = null;
      head2 = null;
      tail2 = null;
      Node current;
      
      if(size == 0) {
         head2 = tail2 = null;
         return null;
         }
         
      else if (size == 1) {
      
         head2 = tail2 = current;
         addAtIndex(1, current);
         }
         
      else if (size >= 2) {
         current = head;
         for(int i = 0; i <size; i++) {
         current = current.next;
         addAtIndex(i, current);
         }
      }  
      return List2;
   }
   */
   
   //================= end of your part for assignment 1 ==============

   //method to print out the list
   public void printList() 
   {
      if (head == null)  // if an empty list
         System.out.println("List is empty...");
      else               // if non-empty list
      {
         Node temp;
         temp = head;
         while (temp != null)
         {
            System.out.print(temp.data + "   ");
            temp = temp.next;
         }
         System.out.println();
      }
   }
  
   //class to create nodes of the list as objects
   public static class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}
