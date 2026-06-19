import java.util.Scanner;

//04.Print the multiplication table of a given number using a while loop.

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i = 1;

        // Print multiplication table using while loop
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        input.close();
    }
}