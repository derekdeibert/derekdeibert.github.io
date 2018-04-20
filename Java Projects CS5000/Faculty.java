public class Faculty extends Employee {

   private String office, rank;
   private Date dateHired;
   
   public Faculty(String name, String address, String phoneNumber, int salary, String office, String rank){
      super(name, address, phoneNumber, salary); 
      this.dateHired = new Date(1999, 2, 14);//returns a specific date
      this.office = office;
      this.rank = rank;
      }
      
   public String getOffice() {
      return this.office;
      }
  
   public String getRank() {
      return this.rank;
      }
         //returns date specified above
   public String getDateHired(){
      return dateHired.getMonth()+"/"+dateHired.getDay()+"/"+dateHired.getYear();
      }
      
   public String toString() {
      return super.toString()+"\n\tOffice:\t\t"+getOffice()+"\n\tRank:\t\t\t"+getRank();
      }
 }
      