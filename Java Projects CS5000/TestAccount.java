public class TestAccount {
    public static void main(String[] args) {
        Account myObject = new Account(123456, 10000);
        myObject.setAnnualInterestRate(2.50);
        myObject.setInitialBalance(10000);
        myObject.withdraw(3500);
        myObject.deposit(500);
        System.out.println(myObject);
            System.out.println();
        Account myAccount = new Account(583729, 20000);
        myAccount.setAnnualInterestRate(3.8);
        myAccount.setInitialBalance(20000);
        myAccount.withdraw(2500);
        myAccount.deposit(750);
        System.out.println(myAccount);
        
        Account yourAccount = new Account(182731, 3200000);
        yourAccount.setAnnualInterestRate(1.8);
        yourAccount.setInitialBalance(3200000);
        yourAccount.withdraw(12500);
        yourAccount.deposit(1200);
        System.out.println(yourAccount);
    
    
    }
}