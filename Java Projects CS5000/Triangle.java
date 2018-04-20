import java.util.*;

public class Triangle 
   extends GeometricObject {
   
   double side1, side2, side3;
   //default triangle, no args
   public Triangle(){
      side1 = 1.0;
      side2 = 1.0;
      side3 = 1.0;
   }
   //user enters side lengths
   public Triangle(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      }
    //returns side1 (from what user enters)  
   public double getSide1() {
      return this.side1;
      }
   //returns side2 (from what user enters)    
   public double getSide2() {
      return this.side2;
      }
    //returns side3 (from what user enters)   
   public double getSide3() {
      return this.side3;
      }
     //returns area of Triangle 
   public double getArea() {
      double s    = (side1 + side2 + side3)/2;
      double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
      return area;
      }
     //returns perimeter of triangle 
   public double getPerimeter() {
      double perimeter = (side1 + side2 + side3);
      return perimeter;
      }
      //returns a string representation of the triangle's attributes.
   public String toString() {
      return ("Side 1:\t\t"+getSide1()+"\n"+"Side 2:\t\t"+getSide2()+"\n"+"Side 3:\t\t"+getSide3()+"\n"+"Area:\t\t\t"+getArea()+"\n"+"Perimeter:\t"+getPerimeter()+"\n\n");
      }
  }     

      
      