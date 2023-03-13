package ExamPrep;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hoursSpent = Integer.parseInt(scanner.nextLine());
        int persons = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double pricePerHour = 0.0;

        switch (month) {
            case "march":
            case "april":
            case "may":
               if (dayTime.equals("day")){
                pricePerHour = 10.5;
               } else {
                pricePerHour = 8.4;
               } break;
            case "june":
            case "july":
            case "august":
                if (dayTime.equals("day")){
                    pricePerHour = 12.6;
                } else {
                    pricePerHour = 10.2;
                } break;
        }
        if (persons >= 4) {
            pricePerHour = pricePerHour * 0.9;
        }
        if (hoursSpent >= 5) {
            pricePerHour = pricePerHour * 0.5;
        }
        System.out.printf("Price per person for one hour: %.2f%n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f", pricePerHour*persons*hoursSpent);

    }
}
