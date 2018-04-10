// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 3

import java.util.Scanner;

class Char {

	public static void main(String[ ] arg)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter a letter: ");
	
   char c1=input.next( ).charAt(0);	
    		
	if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'||c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U')
	{
	   System.out.println("Please enter a letter: " +c1);
      System.out.println("You entered: " +c1);
      System.out.println(c1+ " is a vowel."); 
	}
	else if((c1>='a'&&c1<='z')||(c1>='A'&&c1<='Z')){
		System.out.println("Please enter a letter: " +c1);
      System.out.println("You entered: " +c1);
      System.out.println(c1+ " is a consonant.");
      }
	else {
		System.out.println("Please enter a letter: " +c1);
      System.out.println("You entered: " +c1);
      System.out.println(c1+ " is an invalid input");		
	   }
   }
}