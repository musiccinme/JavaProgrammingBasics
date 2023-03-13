package L2ConditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double costumePriceTotal = extras * costumePrice;
        if (extras >= 150) {
            costumePriceTotal = costumePriceTotal * 0.9;
        }
        double price = decor + costumePriceTotal;
        if (price <= budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - price);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", price - budget);
        }
    }
}
