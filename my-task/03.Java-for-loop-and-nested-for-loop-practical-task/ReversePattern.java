//Task 02 – Reverse Pattern Printing
public class ReversePattern {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop for rows
        for (int i = n; i >= 1; i--) {

            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

    }
}