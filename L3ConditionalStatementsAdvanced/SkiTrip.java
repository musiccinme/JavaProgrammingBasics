package L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        int nights = days - 1;

        if (roomType.equals("room for one person") && review.equals("positive")) {
            System.out.printf("%.2f", nights*18 + nights*18*0.25);
        } else if (roomType.equals("room for one person") && review.equals("negative")) {
            System.out.printf("%.2f", nights*18*0.9);


        } else if (days < 10 && roomType.equals("apartment") && review.equals("positive")) {
            System.out.printf("%.2f", nights*25*0.7 + nights*25*0.25);
        } else if (days < 10 && roomType.equals("apartment") && review.equals("negative")) {
            System.out.printf("%.2f", nights*25*0.7*0.9);
        } else if (days >= 10 && days <= 15 && roomType.equals("apartment") && review.equals("positive")) {
            System.out.printf("%.2f", nights*25*0.65*1.25);
        } else if (days >= 10 && days <= 15 && roomType.equals("apartment") && review.equals("negative")) {
            System.out.printf("%.2f", nights*25*0.65*0.9);
        } else if (days > 15 && roomType.equals("apartment") && review.equals("positive")) {
            System.out.printf("%.2f", nights*25*0.5*1.25);
        } else if (days > 15 && roomType.equals("apartment") && review.equals("negative")) {
            System.out.printf("%.2f", nights*25*0.5*0.9);


        } else if (days < 10 && roomType.equals("president apartment") && review.equals("positive")) {
            System.out.printf("%.2f", nights*35*0.9*1.25);
        } else if (days < 10 && roomType.equals("president apartment") && review.equals("negative")) {
            System.out.printf("%.2f", nights*35*0.9*0.9);
        } else if (days >= 10 && days <= 15 && roomType.equals("president apartment") && review.equals("positive")) {
            System.out.printf("%.2f", nights*35*0.85*1.25);
        } else if (days >= 10 && days <= 15 && roomType.equals("president apartment") && review.equals("negative")) {
            System.out.printf("%.2f", nights*35*0.85*0.9);
        } else if (days > 15 && roomType.equals("president apartment") && review.equals("positive")) {
            System.out.printf("%.2f", nights*35*0.8*1.25);
        } else if (days > 15 && roomType.equals("president apartment") && review.equals("negative")) {
            System.out.printf("%.2f", nights*35*0.8*0.9);
        }
    }
}
