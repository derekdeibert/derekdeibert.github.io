public class Employee extends Person {

   private int salary;
   private Date dateHired;
   
   public Employee(String name, String address, String phoneNumber, int salary) {
      super(name, address, phoneNumber);
      this.salary = salary;
      this.dateHired = new Date();//no arg returns current date
      }
   
   public int getSalary() {
      return this.salary;
      }
         //returns date in Month/Day/Year format
   public String getDateHired(){
      return dateHired.getMonth()+"/"+dateHired.getDay()+"/"+dateHired.getYear();
      }
      
   public String toString() {
      return super.toString()+"\n\tSalary:\t\t$"+getSalary()+"\n\tDate Hired:\t"+getDateHired();
      }
         
   
} 
