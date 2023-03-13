package L2ConditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = puzzles * 2.60;
        double dollsPrice = dolls * 3.0;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2.0;

        int allToys = puzzles + dolls + bears + minions + trucks;
        double profit = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;
        if (allToys >= 50) {
            double profitDiscount = profit - profit * 0.25;
            double profitFinal = profitDiscount - profitDiscount * 0.10;
            if (profitFinal >= tripPrice) {
                System.out.printf("Yes! %.2f lv left.", profitFinal - tripPrice);
            }
            else {
                System.out.printf("Not enough money! %.2f lv needed.", tripPrice - profitFinal);
            }
        }
        else {
            double profitFinal = profit - profit * 0.10;
            if (profitFinal >= tripPrice) {
                System.out.printf("Yes! %.2f lv left.", profitFinal - tripPrice);
            }
            else {
                System.out.printf("Not enough money! %.2f lv needed.", tripPrice - profitFinal);
            }
        }

    }
}
