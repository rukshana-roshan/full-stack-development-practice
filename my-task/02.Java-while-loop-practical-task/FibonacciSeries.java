import java.util.Scanner;

//Generate Fibonacci series up to n terms.

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number of terms
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();

        int first = 0, second = 1, i = 1;

        System.out.println("Fibonacci Series:");

        // Generate Fibonacci series using while loop
        while (i <= n) {
            System.out.println(first);

            int next = first + second;
            first = second;
            second = next;

            i++;
        }

        input.close();
    }
}
