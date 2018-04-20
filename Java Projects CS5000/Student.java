public class Student extends Person {

   public String collegeYear;
   
   public Student(String name, String address, String phoneNumber, String collegeYear) {
      super(name, address, phoneNumber);
      this.collegeYear = collegeYear;
      }
      
   public String getCollegeYear() {
      return this.collegeYear;
      }
      
   public String toString() {
      return (super.toString()+"\n\tStatus:\t\t"+getCollegeYear());
   }
}