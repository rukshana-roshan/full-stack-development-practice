import java.util.Scanner;

//10.Create a menu-driven calculator using a while loop that continues until the user chooses to exit.

public class MenuCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        double num1, num2, result;

        while (true) {

            // Display menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // Exit condition
            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }

            // Input numbers
            System.out.print("Enter first number: ");
            num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            num2 = input.nextDouble();

            // Perform operations
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }
        }

        input.close();
    }
}
