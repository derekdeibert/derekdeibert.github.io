// Name:          Derek Deibert   
// Class:         CS 5040      
// Term:          Summer 2018 
// Instructor:    Dr. Haddad
// Assignment:    2
import java.util.*;
public class TestStack_Derek_Deibert extends Stack_Derek_Deibert
{
   public static void main (String[] args)
   {
   Stack_Derek_Deibert myStack = new Stack_Derek_Deibert();
   Scanner input = new Scanner(System.in);
   System.out.println("Enter 5 positive integers: ");
   int[] array = new int[5];
   for(int i = 0; i<5;i++) {
      array[i] = input.nextInt();
      myStack.push(array[i]);
   }
   
   System.out.println("Testing method push()");
   System.out.print("My test values are: ");
   myStack.printStack();
   
   System.out.println("Testing method pop()");
   System.out.println("Removing top node");
   System.out.print("List content before removal:\t");
   myStack.printStack();
   myStack.pop();
   System.out.print("List content after removal:\t");
   myStack.printStack();
   System.out.println();
   
   System.out.println("Testing method top()");
   System.out.println("Method should return the top node of the stack");
   System.out.print("Stack before method:\t");
   myStack.printStack();
   int x = myStack.top();
   System.out.println("Top node:\t\t\t\t:"+x);
   System.out.println();
   
   System.out.println("Testing method size()");
   System.out.println("Method should return the size of the stack");
   System.out.print("Stack before method:\t");
   myStack.printStack();
   int y = myStack.size();
   System.out.println("Size:\t\t\t\t\t:"+y);
   System.out.println();
   
   System.out.println("Testing method isEmpty()");
   System.out.println("Method should return boolean value if stack is empty or not");
   System.out.print("Stack before method:\t");
   myStack.printStack();
   boolean z = myStack.isEmpty();
   System.out.println("Size:\t\t\t\t\t:"+z);
   System.out.println();
   }
   
   
}