// Class:      CS5000/01
// Term:       Spring 2018
// Name:       Derek Deibert
// Instructor: Dr. Haddad
// Assignment: 8

//public class Account {
    //public static void main(String[] args) {
      // }
//}

class Account {
    private int id = 0;
    private double balance = 0.0;
    private double initialBalance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public double getFinalBalance() {
         return this.balance + initialBalance;
    }
    
    //public void setId(int id) {
        //this.id = id;
    //}

   /* public void setBalance(double balance) {
        this.balance = balance;
    }*/
    public void setInitialBalance(double initialBalance) {
         this.initialBalance = initialBalance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public String toString() {
    return ("Account ID: \t\t" +getId()+"\n" +"Balance: \t\t\t$"+getFinalBalance()+"\n"+"Interest Rate: \t"+getAnnualInterestRate()+"%"+"\n"+"Date Created: "+getDateCreated());
    }
    
}