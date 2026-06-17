
import java.util.Scanner;

public class calculator {
    public static void main() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int add=num1+num2;
        System.out.println("Addition:" + add);
        

        Scanner input1 = new Scanner (System.in);
        System.out.println("Enter first number:");
        int num3 = input1.nextInt();
        System.out.println("Enter second number:");
        int num4 = input.nextInt();
        int sub=num3-num4;
        System.out.println("Substraction:" + sub);

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter first number:");
        int num5 = input2.nextInt();
        System.out.println("Enter second number:");
        int num6 = input2.nextInt();
        int multiplication=num5*num6;
        System.out.println("Multiplication:" + multiplication);

        Scanner input3 = new Scanner (System.in);
        System.out.printf("Enter first number:");
        double num7 = input3.nextDouble();
        System.out.printf("Enter second number:");
        double num8 = input3.nextDouble();
        double Div=num7/num8;
        System.out.printf("Division: %.2f%n" , Div);

        Scanner input4 = new Scanner (System.in);
        System.out.println("Enter first number:");
        int num9 = input4.nextInt();
        System.out.println("Enter second number:");
        int num10 = input4.nextInt();
        double Div2=num9/num10;
        System.out.println("Division:" + Div2);
        
    
    }
    
        

         
     
}
        
    

