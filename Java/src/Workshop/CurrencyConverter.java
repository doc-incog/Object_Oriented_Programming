package Workshop;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dollars, rate;

        System.out.print("Enter dollars: ");
        dollars = sc.nextDouble();

        System.out.print("Enter exchange rate: ");
        rate = sc.nextDouble();

        double result = dollars * rate;

        System.out.println("Converted Amount = " + result);
    }
}