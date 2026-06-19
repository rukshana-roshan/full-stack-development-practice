import java.util.Scanner;

//03.Find the sum of all even numbers from 1 to n.

public class EvenSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input value of n
        System.out.print("Enter value of n: ");
        int n = input.nextInt();

        int i = 1;
        int sum = 0;

        // Calculate sum of even numbers
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }

        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);

        input.close();
    }
}
