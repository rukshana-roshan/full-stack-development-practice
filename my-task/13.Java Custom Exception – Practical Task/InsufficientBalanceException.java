// File: InsufficientBalanceException.java
// Custom exception class for insufficient balance scenarios

public class InsufficientBalanceException extends Exception {
    
    // Constructor with a custom error message
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
