// File: BankAccount.java
// BankAccount class with attributes and withdrawal method

public class BankAccount {
    // Attributes
    public  String accountNumber;
    public String accountHolderName;
    public double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter methods (optional, for displaying info)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Withdraw method that throws InsufficientBalanceException
    public void withdraw(double amount) throws InsufficientBalanceException {
        // Check if withdrawal amount exceeds available balance
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available balance: $" + balance + ", Requested: $" + amount
            );
        }
        // Perform withdrawal and update balance
        balance -= amount;
        System.out.println("Withdrawal successful! Amount withdrawn: $" + amount);
        System.out.println("Remaining balance: $" + balance);
    }
}