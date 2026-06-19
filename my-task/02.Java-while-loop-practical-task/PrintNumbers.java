import java.util.Scanner;

//01.Print numbers from 1 to 100 using a while loop.

public class PrintNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input starting number (user input method)
        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        int i = start;

        // Print from start to 100
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        input.close();
    }
}