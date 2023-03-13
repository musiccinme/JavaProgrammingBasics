package L4ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int moneyEvenBirthdays = 0;
        int moneyFromToys = 0;
        int count = 0;

        for (int i = 1; i <= age; i++) {
            if (i%2 == 0) {
                moneyEvenBirthdays += count*10 + 10;
                count++;
            } else {
                moneyFromToys += toyPrice;
            }
        }

        int total = moneyEvenBirthdays - count + moneyFromToys;
        double diff = Math.abs(total - washingMachinePrice);

        if (total >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
