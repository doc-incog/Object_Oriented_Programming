public class Customer {
    // Private attributes including a BankAccount object [cite: 35]
    private String customerId;
    private String name;
    private BankAccount account;

    // Parameterized constructor [cite: 36]
    public Customer(String id, String name, BankAccount account) {
        this.customerId = id;
        this.name = name;
        this.account = account;
    }

    // Getter [cite: 36]
    public String getName() { return name; }

    public static void main(String[] args) {
        // Q12: Instantiate multiple objects to demonstrate use [cite: 37]
        BankAccount aliceAcc = new BankAccount("001", 500.0, "Alice", "123 Main St");
        Customer c1 = new Customer("C101", "Alice", aliceAcc);

        System.out.println("Customer Name: " + c1.getName());
        System.out.println("Initial Balance: " + aliceAcc.getBalance());
        aliceAcc.depositMoney(200);
    }
}