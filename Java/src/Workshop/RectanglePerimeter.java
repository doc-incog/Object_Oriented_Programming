package Workshop;

import java.util.Scanner;

public class RectanglePerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length, width;

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter = " + perimeter);
    }
}