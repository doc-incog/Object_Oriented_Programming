public class BankAccount {
    // Q3 & Q10: Attributes (Balance is private) [cite: 8-13, 30]
    public String accountNumber;
    private double balance; 
    public String accountHolderName;
    public String accountHolderAddress;

    // Q8: No-argument constructor [cite: 22]
    public BankAccount() {
        System.out.println("User created!");
    }

    // Q7: Parameterized constructor [cite: 21]
    public BankAccount(String accNum, double bal, String name, String addr) {
        this.accountNumber = accNum;
        this.balance = bal;
        this.accountHolderName = name;
        this.accountHolderAddress = addr;
    }

    // Q13: Constructor Overloading (Different parameters) [cite: 39, 40]
    public BankAccount(String name, double bal) {
        this.accountHolderName = name;
        this.balance = bal;
    }

    // Q10: Public getter for private balance 
    public double getBalance() {
        return this.balance;
    }

    // Q5: Deposit and Withdraw methods [cite: 16, 17]
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposited. Current balance: " + balance);
    }

    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }
}