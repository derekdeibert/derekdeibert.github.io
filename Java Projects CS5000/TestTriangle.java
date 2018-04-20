public class TestTriangle {
 
public static void main(String[] args) {

   Triangle testTriangle1 = new Triangle(2.0, 3.0, 3.0);
   System.out.println("Triangle:\ttestTriangle1");
   System.out.print(testTriangle1);
   
   Triangle testTriangle2 = new Triangle(3.0, 4.0, 5.0);
   System.out.println("Triangle:\ttestTriangle2");
   System.out.print(testTriangle2);
   
   Triangle defaultTriangle = new Triangle();
   System.out.println("Triangle:\tdefaultTriangle");
   System.out.print(defaultTriangle);
   }
}