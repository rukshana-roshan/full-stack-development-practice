// File: BankApplication.java
// Main class to run the application

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        // Create a BankAccount object with sample details
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.00);

        // Display account information
        System.out.println("=== Bank Account Details ===");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Current Balance: $" + account.getBalance());
        System.out.println("=============================");

        // Accept withdrawal amount from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();

        // Call withdraw() method inside try-catch block
        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            // Display error message when exception occurs
            System.out.println("Error: " + e.getMessage());
            // Program continues running (does not terminate unexpectedly)
        } finally {
            scanner.close(); // Close scanner resource
        }

        // Display final result
        System.out.println("\nFinal Account Balance: $" + account.getBalance());
        System.out.println("Transaction completed.");
    }
}