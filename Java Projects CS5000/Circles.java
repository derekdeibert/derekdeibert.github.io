// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;

public class Circles {

  public static void main(String[] args){
    //Collecting user input for Circle 1.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Circle 1 x-coordinate of the center: ");
    double X1 = input.nextDouble();
    System.out.print("Enter Circle 1 y-coordinate of the center: ");
    double Y1 = input.nextDouble();
    System.out.print("Enter Circle 1 radius ");
    double radius1 = input.nextDouble();
    
    //Collecting user input for Circle 2.
    System.out.print("Enter Circle 2 x-coordinate of the center: ");
    double X2 = input.nextDouble();
    System.out.print("Enter Circle 2 y-coordinate of the center: ");
    double Y2 = input.nextDouble();
    System.out.print("Enter Circle 2 radius ");
    double radius2 = input.nextDouble(); 
      
    //Calculates distance between circle centers.   
    double distance = Math.pow((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1), 0.5);
    
    //If the radius of the 2nd circle is larger than the first circle
    //and the distance between the centers is less than the difference
    //of the radii, then Circle 1 is inside Circle 2. 
    if (radius2 >= radius1 && distance <= (radius2 - radius1)){
        System.out.println("Circle 1 is inside Circle 2.");
    }
    
    //The opposite of above if statement is true.
    else if (radius1 >= radius2 && distance <= (radius1 - radius2) ) {
        System.out.println("Circle 2 is inside Circle 1.");
    }
    
    //However, if the distance between the centers is greater than the
    //sum of the radii, then the circles do not overlap.
    else if (distance > (radius1 + radius2)){
        System.out.println("Circle 2 does not overlap Circle 1.");
    }
    
    //If above statements are not true than the circles have to 
    //overlap.
    else {
        System.out.println("Circle 2 overlaps Circle 1.");}
    }
}