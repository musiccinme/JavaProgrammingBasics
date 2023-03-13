package Exam;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paperCount = Integer.parseInt(scanner.nextLine());
        int fabricCount = Integer.parseInt(scanner.nextLine());
        double glueLiters = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double price = (paperCount * 5.80 + fabricCount * 7.20 + glueLiters * 1.20);
        double priceTotal =  price - price*discountPercent/100;
        System.out.printf("%.3f", priceTotal);
    }
}
