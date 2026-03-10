package Workshop;

import java.util.Scanner;

public class CylinderVolume {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius, height;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume = " + volume);
    }
}