//05.DiamondPattern

public class DiamondPattern {
    public static void main(String[] args) {

        int n = 5;

        // Top half of diamond
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half of diamond
        for (int i = n - 1; i >= 1; i--) {

            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}