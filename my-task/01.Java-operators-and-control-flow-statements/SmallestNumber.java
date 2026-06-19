import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // Find smallest number using if-else
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Smallest number is: " + num1);
        } 
        else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Smallest number is: " + num2);
        } 
        else {
            System.out.println("Smallest number is: " + num3);
        }

        input.close();
    }
}
