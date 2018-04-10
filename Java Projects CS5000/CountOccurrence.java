// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 6

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         //declaring variables
        int [] values = new int[100]; //1D array 
        int integers;
        int count = 0;
        //collecting user input for the integers
        System.out.print("Enter integers between 1 and 100 OR enter 0 to quit: ");
        
        do
        {
            integers = input.nextInt();
            values[count] = integers;//puts entered integers in to array
            count += 1; // count increases by 1 for every integer entered
        }
        while (integers != 0);//sentinel loop which terminates when the user enters 0

        Count(values);//calls Count method from below. 
      }

    public static void Count(int [] list) {
        for (int i = 1; i <= 100; i=i+1) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j=j+1) {
                if (list[j] == i)
                    count += 1;
            }
            if (count != 0)
                /*the first %d will be the letter i from above, the second %d will the count
                  and the %s will either be "times" or "time" depending on the count. If the count
                  is >1 it is "times," if not then it is "time."*/
                System.out.printf("%d occurred\t %d %s%n", 
                    i, count, count > 1 ? "times" : "time");
        } 
    }
}
