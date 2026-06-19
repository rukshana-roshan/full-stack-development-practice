//Task 01 – Pattern Printing

public class Pattern {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for columns (stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

    }
}
