package Exam;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tShirtPrice = Double.parseDouble(scanner.nextLine());
        double sumToReach = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tShirtPrice*0.75;
        double socks = shortsPrice*0.2;
        double shoes = (tShirtPrice + shortsPrice) * 2;
        double price = tShirtPrice + shortsPrice + socks + shoes;
        double totalPrice = price - price*0.15;

        if (totalPrice >= sumToReach) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", totalPrice);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", sumToReach-totalPrice);
        }
    }
}
