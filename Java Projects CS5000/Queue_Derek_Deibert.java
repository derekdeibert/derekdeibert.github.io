// Name:          Derek Deibert  
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    3

public class Queue_Derek_Deibert {

Node front, rear;
private int size;
   //create an empty queue
   public Queue_Derek_Deibert() {
      front = null;
      rear=null;
      size = 0;
   }
   
   public void enqueue(int data) {
      Node newNode = new Node(data);
      
      if(front == null) {
         front = newNode;
         rear = newNode;
      }
      else {
      rear.next = newNode;
      rear = rear.next;
      }
      size++;//increse size of queue
   }
   //returns value in front of queue and deletes it from queue
   public int dequeue() {
      if(size == 0) return 0;
      else {
      Node current = front;
      front = front.next;
      current.next = null;
      size--;
      return current.data;
      }
   }
   //just returns the value in the front of the queue, but doesn't delete it from queue
   public int front() {
      return front.data;
      }
   //returns size of queue
   public int size() {
      return size;
      }
    
   public boolean isEmpty() {
      if(size == 0) return true;
      else return false;
      }


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
   
   public void printQueue() 
   {
      if (front == null)  // if an empty list
         System.out.println("List is empty...");
      else               // if non-empty list
      {
         Node temp;
         temp = front;
         while (temp != null)
         {
            System.out.print(temp.data + "   ");
            temp = temp.next;
         }
         System.out.println();
      }
   }
}

