package Workshop;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.print("Enter Celsius: ");
        celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Fahrenheit = " + fahrenheit);
    }
}