public class Person {

   public String name, address, phoneNumber;
   
   public Person(String name, String address, String phoneNumber) {
      this.name = name;
      this.address = address;
      this.phoneNumber = phoneNumber;
      }
      //returns name
   public String getName() {
      return this.name;
      }
      //returns address
   public String getAddress() {
      return this.address;
      }
      //returns phone number
   public String getPhoneNumber() {
      return this.phoneNumber;
      }
      //prints information
   public String toString(){
      return ("\tName:\t\t\t"+getName()+"\n\tAddress:\t\t"+getAddress()+"\n\tPhone#:\t\t"+getPhoneNumber());
      }
      
   }

   