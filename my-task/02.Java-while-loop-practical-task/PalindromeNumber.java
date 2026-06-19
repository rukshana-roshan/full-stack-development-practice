import java.util.Scanner;

//08.Check whether a number is palindrome or not.

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int original = num;
        int reverse = 0;

        // Reverse the number using while loop
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // Check palindrome
        if (original == reverse) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }

        input.close();
    }
}
