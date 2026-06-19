
//Task 09 Create a program using switch statement to display day names based on day number.

import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input day number
        System.out.print("Enter day number (1-7): ");
        int day = input.nextInt();

        // Switch statement to display day name
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number! Please enter 1 to 7.");
        }

        input.close();
    }
}
