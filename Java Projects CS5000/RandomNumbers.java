// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 3

import java.util.Random;

public class RandomNumbers {

public static void main(String[] args) {
   //n1 will give me a random number between 25 and 85 inclusive
   int n1 = 25 + (int)(Math.random()*60);
   //n2 will give me a random number between -10 and 20
   int n2 = -10 + (int)(Math.random()*30);
   //n3 will give me a random number between -50 and -30
   int n3 = -50 + (int)(Math.random()*20);
   //nL is the left limit for my floating number, nR is the right limit
   //n4 will give me a random float between 0 and 17.9999, while n5 will
   //truncate the number to 4 decimal places.
   float nL = 0.0000F;
   float nR = 17.9999F;
   float n4 = nL + new Random().nextFloat()*(nR-nL);  
   double n5 = Math.floor(n4*10000.0)/10000.0;
   
   
   System.out.println("a) A random integer between 25 and 85 (inclusive): \t\t" +n1);
   System.out.println("b) A random integer between -10 and 20 (inlclusive): \t\t" +n2);
   System.out.println("c) A random integer between -50 and -30 (inlclusive): \t" +n3);
   System.out.println("d) A random float between 0.0 and 17.9999 (inlclusive):\t" +n5);
   }
}

