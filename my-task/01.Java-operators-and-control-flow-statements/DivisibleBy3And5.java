
//Task 12 Create a program to check whether a number is divisible by both 3 and 5.

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check divisibility
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is NOT divisible by both 3 and 5.");
        }

        input.close();
    }
}
