package L1FirstStepsInProgramming;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPerKg = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        double raspberriesPerKg = (strawberriesPerKg - strawberriesPerKg * 0.5);
        double orangesPerKg = (raspberriesPerKg - raspberriesPerKg * 0.4);
        double bananasPerKg = (raspberriesPerKg - raspberriesPerKg * 0.8);

        double raspberriesPrice = (strawberriesPerKg - strawberriesPerKg * 0.5) * raspberries;
        double orangesPrice = (raspberriesPerKg - raspberriesPerKg * 0.4) * oranges;
        double bananasPrice = (raspberriesPerKg - raspberriesPerKg * 0.8) * bananas;
        double strawberriesPrice = strawberriesPerKg * strawberries;




        double neededMoney = strawberriesPrice + raspberriesPrice + orangesPrice + bananasPrice;

        System.out.printf("%.2f", neededMoney);
    }
}
