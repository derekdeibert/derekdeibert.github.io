// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 4

import java.util.Scanner;

public class PasswordTest {
public static void main(String[] args){

   //collecting user input
   Scanner input=new Scanner(System.in);
   System.out.print("Enter your password: ");
   String password = input.nextLine();
   
   //Declaring variables
   int passwordLength=password.length();
   boolean upperCheck=false;
   boolean lowerCheck=false;
   boolean letterDigitCheck=false;
   boolean digitCheck=false;
   //created while loop that depends on users entering a password
   //of at least 8 characters.
   while(paswordLength>= 8){
      //used for loop to examine each character of the string
      for(int i=0; i<=passwordLength;i++){
      char n = password.charAt(i);
      //checks if 1 or more charactrs is upperc ase
      if(Character.isUpperCase(n)==true){
      upperCheck = true;}
      //Checks if 1 or more characters is lower case
      if(Character.isLowerCase(n)==true) {
      lowerCheck = true;}
      //Checks if one more characters is neither a digit or letter
      if(Character.isLetter(n)==false && Character.isDigit(n)==false){
      letterDigitCheck =true;}
      //checks if one or more character is a digit
      if(Character.isDigit(n)==true) {
      digitCheck=true;}
      //final if statement to determine if password has met all the 
      //requirements
      if(upperCheck==true && lowerCheck==true && letterDigitCheck==true) {
      System.out.println("Entered Password: " +password);
      System.out.println("Verdict: \t\t\tValid Password");}
      }
   }
      
      //if password does not meet the requirements, this will print
      System.out.println("Entered Password: " +password);
      System.out.println("Verdict: \t\t\tInvalid Password");
      
      
   }
}
      
      