import java.util.Scanner;

//06.Count the digits in a number.

public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = 0;

        // Handle case when number is 0
        if (num == 0) {
            count = 1;
        } else {
            // Count digits using while loop
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        input.close();
    }
}
