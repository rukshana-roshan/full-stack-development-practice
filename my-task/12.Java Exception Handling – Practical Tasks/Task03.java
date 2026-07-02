import java.util.InputMismatchException;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter student age: ");
            int age = input.nextInt();

            if (age < 18) {
                throw new IllegalArgumentException("Student must be at least 18 years old.");
            }

            System.out.println("Age accepted.");

        } catch (InputMismatchException e) {

            System.out.println("Error: Please enter a valid integer.");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            input.close();

        }
    }
}