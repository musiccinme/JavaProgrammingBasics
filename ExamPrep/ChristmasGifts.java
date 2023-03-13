package ExamPrep;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int kids = 0;
        int moneyForToys = 0;
        int adults = 0;
        int moneyForSweaters = 0;

        while (!input.equals("Christmas")) {
            int age = Integer.parseInt(input);
            if (age <= 16) {
                kids++;
            } else {
                adults++;
            }
            moneyForToys = kids * 5;
            moneyForSweaters = adults * 15;
            input = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %d%n", moneyForToys);
        System.out.printf("Money for sweaters: %d", moneyForSweaters);
    }
}
