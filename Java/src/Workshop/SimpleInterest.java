package Workshop;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal, rate, time;

        System.out.print("Enter principal: ");
        principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        rate = sc.nextDouble();

        System.out.print("Enter time: ");
        time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + interest);
    }
}