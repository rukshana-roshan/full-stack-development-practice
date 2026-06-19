//04.RightTriangleStarPattern

public class RightTriangleStarPattern {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for stars (odd numbers: 2*i - 1)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}