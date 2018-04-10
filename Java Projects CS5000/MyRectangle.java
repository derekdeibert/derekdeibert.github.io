// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 5

import java.util.Scanner;

public class MyRectangle {
	
	//isValid method to test whether the sum of the height and width is >= 30               
   public static boolean isValid(double width, double height) {
      if(width+height>=30){
         return true;
      }
      else {
         return false;}
   }
  
   //Area class to compute the area of entered values
   public static double Area(double width, double height) {
      double area = width * height;
      if(isValid(width, height)){
         return area;
      }
      else {
         return 0;}
   }
    //Perimeter class to compute the perimeter.  
   public static double Perimeter(double width, double height) {
      double perimeter = (2*width) + (2*height);
      if(isValid(width, height)){
         return perimeter;
      }
      else {
         return 0;}   
   }
 
   public static void R1()
   {
      Scanner input = new Scanner(System.in);//collects user input
      System.out.print("Enter width: ");
      double width=input.nextDouble();
      
      System.out.print("Enter height: ");
      double height=input.nextDouble();
      
      double area=Area(width, height);//calling area method
      double perimeter=Perimeter(width, height);//calling perimeter method
      
      //While the isValid method is NOT true, "Rectangle is invalid" will print and prompt the 
      //user to new inputs. When the inputs are valid (when isValid method is true) it will
      //print the area and perimeter. 
      while(!isValid(width, height)) {
         System.out.println("Rectangle is invalid");
        //recollect user input for width and height
         System.out.println("Enter width: ");
         width = input.nextDouble();
         System.out.println("Enter height: ");
         height = input.nextDouble();
         
         area=Area(width, height);//calling area method
         perimeter=Perimeter(width, height);//calling perimeter method
      }
         int rP=(int) area;
         int rA=(int) perimeter;
         
      System.out.println("This is a valid rectangle.");
      System.out.println("The area is " +rA);
      System.out.println("The perimeter is " +rP);
   } 
}   


     
     
         
         
     
         
         
         

   
     
     
     
     
     
     
     
 
