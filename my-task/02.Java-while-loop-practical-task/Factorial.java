import java.util.Scanner;

//07.Find the factorial of a number.

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i = 1;
        long factorial = 1;

        // Calculate factorial using while loop
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        input.close();
    }
}
