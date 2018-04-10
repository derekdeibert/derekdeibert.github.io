// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 6

import java.util.Scanner;
public class DistinctValues {
                    
                
    /*Used boolean method to test for repeat numbers in the array. */
    public static boolean isSame(int [] number, int i)
    {
        for (int j = 0; j < i; j++)
            if(number[i] == number[j])
                return true;//two numbers are equal
        return false;//two numbers are not equal
    }
}