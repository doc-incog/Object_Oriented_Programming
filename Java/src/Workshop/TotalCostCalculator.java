package Workshop;

import java.util.Scanner;

public class TotalCostCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double quantity, price;

        System.out.print("Enter quantity: ");
        quantity = sc.nextDouble();

        System.out.print("Enter price per item: ");
        price = sc.nextDouble();

        double total = quantity * price;

        System.out.println("Total Cost = " + total);
    }
}