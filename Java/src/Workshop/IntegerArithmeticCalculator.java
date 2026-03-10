package Workshop;

import java.util.Scanner;

public class IntegerArithmeticCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first integer: ");
        a = sc.nextInt();

        System.out.print("Enter second integer: ");
        b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Quotient = " + (a / b));
    }
}