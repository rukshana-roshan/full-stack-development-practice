public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Synchronized Deposit Method
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName()
                + " deposited Rs." + amount
                + " | Balance: Rs." + balance);
    }

    // Synchronized Withdraw Method
    public synchronized void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName()
                    + " withdrew Rs." + amount
                    + " | Balance: Rs." + balance);
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " failed to withdraw Rs." + amount
                    + " (Insufficient Balance)");
        }
    }
}
