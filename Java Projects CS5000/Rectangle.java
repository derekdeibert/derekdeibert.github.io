// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 8

class Rectangle {

public double width = 1.0;
public double height = 1.0;

//creates no-arg rectangle
public Rectangle() {
   width = 1.0;
   height = 1.0;
   }
 
public Rectangle(double newHeight, double newWidth) {
   width = newWidth;
   height = newHeight;
   }
 
public double getWidth() {
   return this.width;
   }
   
public double getHeight() {
   return this.height;
   }
   
public double getArea() {
   return width * height;
   }
   
public double getPerimeter() {
   return 2*width + 2*height;
   }
   
public String toString() {
   return ("Rectangle is "+getWidth()+" unit(s) wide and "+getHeight()+" unit(s) high.");
   } 
 }