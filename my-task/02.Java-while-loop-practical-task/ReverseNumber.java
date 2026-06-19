import java.util.Scanner;

//05.Reverse a given number

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reverse = 0;

        // Reverse the number using while loop
        while (num != 0) {
            int digit = num % 10;      // get last digit
            reverse = reverse * 10 + digit; // build reverse number
            num = num / 10;            // remove last digit
        }

        System.out.println("Reversed number is: " + reverse);

        input.close();
    }
}
