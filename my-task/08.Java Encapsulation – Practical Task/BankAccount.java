public class BankAccount {

    // Private attributes
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Getter and Setter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Rs:" + amount + " Deposited Successfully.");
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Rs:" + amount + " Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    // Display Method
    public void displayAccountDetails() {

        System.out.println("\nAccount Details");
        System.out.println("-------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : Rs:" + balance);
    }

    // Main Method
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Set account details
        account.setAccountNumber(1001);
        account.setAccountHolderName("Rukshana");
        account.setBalance(10000);

        // Deposit and Withdraw
        account.deposit(5000);
        account.withdraw(2000);

        // Display updated details
        account.displayAccountDetails();
    }
}