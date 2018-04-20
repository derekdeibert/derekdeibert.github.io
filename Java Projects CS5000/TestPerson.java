public class TestPerson {

public static void main(String[] args) {
      //prints Person Object
   Person testPerson = new Person("Derek Deibert", "1590 Lexington Avenue, New York, NY", "6103906428");
   System.out.println("Person Object:");
   System.out.print(testPerson);
   System.out.println();
      //prints Student Object
   Student testStudent = new Student("Derek Deibert", "1590 Lexington Avenue, New York, NY", "6103906428", "Junior");
   System.out.println("Student Object:");
   System.out.print(testStudent);
   System.out.println();
      //prints Employee Object
   Employee testEmployee = new Employee("Joe", "123 Sassafrass Lane, Tuckahoe, NY", "1234323232", 45000);
   System.out.println("Employee Object:");
   System.out.print(testEmployee);
   System.out.println();
   
   Faculty testFaculty = new Faculty("Sue", "456 Houston Street, NY, NY", "8378921029", 89000, "A-314", "Professor");
   System.out.println("Faculty Object:");
   System.out.print(testFaculty);
   System.out.println();
   
   Staff testStaff = new Staff("Jessica", "189 W. 4th Street, Los Angeles, CA", "903-902-901", 102323, "Supervisor");
   System.out.println("Staff Object:");
   System.out.print(testStaff);
   System.out.println();
   }
}