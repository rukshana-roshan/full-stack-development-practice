import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int result = num1 / num2;

            System.out.println("Answer = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");

        } catch (InputMismatchException e) {

            System.out.println("Error: Please enter valid integer numbers.");

        }

        input.close();
    }
}