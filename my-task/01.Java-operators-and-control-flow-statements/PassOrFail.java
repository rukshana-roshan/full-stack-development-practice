
//Task 06 Create a program to check whether a student is pass or fail based on marks.

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter student marks: ");
        int marks = input.nextInt();

        // Check pass or fail
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else if (marks >= 0) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Invalid marks!");
        }

        input.close();
    }
}
