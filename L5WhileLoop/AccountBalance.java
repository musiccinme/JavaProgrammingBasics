package L5WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double balance = 0.0;

        while (!input.equals("NoMoreMoney")) {
            double increase = Double.parseDouble(input);
            if (increase < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            balance += increase;
            System.out.printf("Increase: %.2f%n", increase);


            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", balance);
    }
}
