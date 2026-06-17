import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num3 = input.nextInt();

        System.out.print("Enter second number: ");
        int num4 = input.nextInt();

        if (num3 > num4) {
            System.out.println("Largest number is: " + num3);
        } else if (num4 > num3) {
            System.out.println("Largest number is: " + num4);
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}
    
    

