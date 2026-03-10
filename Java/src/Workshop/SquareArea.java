package Workshop;

import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double side;

        System.out.print("Enter side: ");
        side = sc.nextDouble();

        double area = side * side;

        System.out.println("Area = " + area);
    }
}