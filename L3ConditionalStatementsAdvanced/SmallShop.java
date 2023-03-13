package L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (product.equals("coffee") && city.equals("Sofia")) {
            System.out.println(quantity * 0.5);
        } else if (product.equals("coffee") && city.equals("Plovdiv")) {
            System.out.println(quantity * 0.4);
        } else if (product.equals("coffee") && city.equals("Varna")) {
            System.out.println(quantity * 0.45);
        } else if (product.equals("water") && city.equals("Sofia")) {
            System.out.println(quantity * 0.80);
        } else if (product.equals("water") && city.equals("Plovdiv")) {
            System.out.println(quantity * 0.70);
        } else if (product.equals("water") && city.equals("Varna")) {
            System.out.println(quantity * 0.70);
        } else if (product.equals("beer") && city.equals("Sofia")) {
            System.out.println(quantity * 1.20);
        } else if (product.equals("beer") && city.equals("Plovdiv")) {
            System.out.println(quantity * 1.15);
        } else if (product.equals("beer") && city.equals("Varna")) {
            System.out.println(quantity * 1.10);
        } else if (product.equals("sweets") && city.equals("Sofia")) {
            System.out.println(quantity * 1.45);
        } else if (product.equals("sweets") && city.equals("Plovdiv")) {
            System.out.println(quantity * 1.30);
        } else if (product.equals("sweets") && city.equals("Varna")) {
            System.out.println(quantity * 1.35);
        } else if (product.equals("peanuts") && city.equals("Sofia")) {
            System.out.println(quantity * 1.60);
        } else if (product.equals("peanuts") && city.equals("Plovdiv")) {
            System.out.println(quantity * 1.50);
        } else if (product.equals("peanuts") && city.equals("Varna")) {
            System.out.println(quantity * 1.55);
        }
    }
}
