import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        // Grade calculation using else-if
        if (marks >= 75 && marks <= 100) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 65) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 55) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 40) {
            System.out.println("Grade: D");
        } 
        else if (marks >= 0) {
            System.out.println("Grade: F (Fail)");
        } 
        else {
            System.out.println("Invalid marks entered!");
        }

        input.close();
    }
}
