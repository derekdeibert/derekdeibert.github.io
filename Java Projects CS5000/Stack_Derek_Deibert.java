// Name:          Derek Deibert  
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    2

public class Stack_Derek_Deibert {
   private  Node head, tail;
   private int size;
   
    public Stack_Derek_Deibert()
   {
      head = null;  // list head pointer
      tail = null;  // list tail pointer
      size = 0;     // list size
   }
   
   public void push(int data) {
      if (tail == null) 
         head = tail = new Node(data); //empty stack
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to new last node
      }
      size++; //increase list size by one
   }

   public Node pop() 
   {
      if (size == 0) return null; // Nothing to remove
		else if (size == 1) { // Only one element in the list
			Node temp = head;
			head = tail = null; // list becomes empty
			size = 0;
			return temp;
		}
		else {
			Node current = head;

			for (int i = 1; i < size - 1; i++)
				current = current.next;		
			  
			current.next = null;
			tail = current;
			size--;
			return current; //removes top item in stack
		}

   }
   
   public int top() {//returns top item in stack following the Last in, First out model
      return tail.data;
      }

  public int size() { //returns number of items in stack
      return size;
      }
      
  public boolean isEmpty() {//returns boolean value of T/F is stack is empty
      if(size == 0) return true;
      else return false;
      }
      
  public void printStack() 
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

   
   public class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   } 
   
   //End Part 1--------------------------------------------------------------
   
   public static class Node2//created new node to work with strings
   {
      private String data;  //data field
      private Node2 next; //link field
       
      public Node2(String item) //constructor method
      {
         data = item;
         next = null;
      }
   } 
   
   
   private  Node2 head2, tail2;//created new initial variables of String/Node2 class
   public void pushString(String x) {
      if (tail2 == null) 
         head2 = tail2 = new Node2(x); //empty list
      else 
      {
         tail2.next = new Node2(x); //link new node as last node
         tail2 = tail2.next; //make tail pointer points to new last node
      }
      size++; //increase list size by one
   }
  
   public void printStackReverse() 
   {
      if (tail2 == null)  // if an empty list
         System.out.println("List is empty...");
      else               // if non-empty list
      {
         Node2 temp;
         temp = head2;
         while (temp != null)
         {
            System.out.print(temp.data);
            temp = temp.next;
         }
         System.out.println();
      }
   }

    public static String reverseWords(String s) {
   
   String arr[] = s.split(" ");//creates string array for each individual word in the entered string. 
   String finalStr = "";
   for(int i = arr.length -1; i>=0; i--) {//starts at end of array, which will then become the beginning of new array. 
      finalStr += arr[i]+ " ";
      }
   
   return finalStr;
   }
  
   //End Part 2 ---------------------------------------------------
   private Node3 head3, tail3;//new initial variables to work with char.
   public static class Node3//created new node to work with char.
   {
      private char data;  //data field
      private Node3 next; //link field
       
      public Node3(char item) //constructor method
      {
         data = item;
         next = null;
      }
   } 
   
   public static String checkParentheses (char[] x) {
      Stack_Derek_Deibert stack = new Stack_Derek_Deibert();
      char c;
      
      for(int i = 0; i<x.length; i++) {
      c = x[i];
      if(c == '(')//if there is a left parenthesee it gets pushed into the stack
         stack.pushChar(c);
         
      else if(c == ')')
         if(stack.isEmpty()) return "Invalid Expression";
         else stack.popChar();//if there is a right parenthesee the last item in the stack
      }                       //gets removed (the left parenthesee). However, if the stack
                              //is empty (and we have a right parenthesee) then the expression invalid.
      
      if(stack.isEmpty() == true) return "Valid Expression";//assumes even number of left and right parentheses.
      else return "Invalid Expression";
         
   } 
      
   public Node3 popChar() //removes top item in stack
   {
      Node3 empty = new Node3(' ');
      if (size == 0) return empty; // Nothing to remove
		else if (size == 1) { // Only one element in the list
			Node3 temp = head3;
			head3 = tail3 = null; // list becomes empty
			size = 0;
			return empty;
		}
		else {
			Node3 current = head3;

			for (int i = 1; i < size - 1; i++)
				current = current.next;		
			  
			current.next = null;
			tail3 = current;
			size--;
			return current;
		}

   }
   
   
   public void pushChar(char x) { //places items in stack
      
      if (tail3 == null) 
          head3 = tail3 = new Node3(x); //empty list
      else 
      {
         tail3.next = new Node3(x); //link new node as last node
         tail3 = tail3.next; //make tail pointer points to new last node
      }
      size++; //increase list size by one
   }

   public void printStackParen() 
   {
      if (tail3 == null)  // if an empty list
         System.out.println("List is empty...");
      else               // if non-empty list
      {
         Node3 temp;
         temp = head3;
         while (temp != null)
         {
            System.out.print(temp.data);
            temp = temp.next;
         }
         System.out.println();
      }
   }


}  