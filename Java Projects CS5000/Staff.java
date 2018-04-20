public class Staff extends Employee {

   private String title;
   private Date dateHired;
   
   public Staff(String name, String address, String phoneNumber, int salary, String title) {
      super(name, address, phoneNumber, salary);
      this.dateHired = new Date(2010, 6, 28);
      this.title = title;
      }
      
   public String getTitle() {
      return this.title;
      }
      
   public String getDateHired(){
      return dateHired.getMonth()+"/"+dateHired.getDay()+"/"+dateHired.getYear();
      }
      
   public String toString() {
      return super.toString()+"\n\tTitle:\t\t"+getTitle();
      }
   }