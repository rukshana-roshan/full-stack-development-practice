import java.util.Scanner;

//02.Print all odd numbers between 1 and 50.

public class OddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input range from user
        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        System.out.println("Odd numbers between " + start + " and " + end + ":");

        int i = start;

        // Print odd numbers using while loop
        while (i <= end) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        input.close();
    }
}
