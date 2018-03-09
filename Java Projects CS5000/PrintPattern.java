// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 4

import java.util.Scanner;
public class PrintPattern
{
    public static void main(String[] args) 
    {
         //declared variable n=9, because top and bottom rows have 9 *
        int n = 9;
         
        //the first for loop uses the i variable set to less than n(9).
        //The last part (i=i+2) adds 2 * to each row (1, 3, 5, 7, and 9).
        for (int i = 1; i <= n; i=i+2) 
        {
            for (int j = 1; j < i; j=j+1) 
            {
                System.out.print(" ");//this spaces the stars so they are not all
                                       //alligned to the left.
            }
            
            
            for (int k = i; k <= n; k=k+1) 
            { 
                System.out.print("*"+" "); 
            } 
             
            System.out.println(); 
        } 
         //2nd for loop creates the bottom half of the hourglass.
            //follows similar logic from above, but in reverse. 
        for (int i = 9; i >= 1; i=i-2) 
        {
             for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print("*"+" ");
            }
             
            System.out.println();
        }
        
    }
}
 