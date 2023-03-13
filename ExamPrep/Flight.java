package ExamPrep;

import java.util.Scanner;

public class Flight {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int companies = Integer.parseInt(keyboard.nextLine());
        String maxCompanyAveragePassengersName = "";
        int maxCompanyAveragePassengers = 0;
        for (int i = 0; i < companies; i++) {
            String companyName = keyboard.nextLine();
            String input = keyboard.nextLine();

            int companyAveragePassengers = 0;
            int flights = 0;
            while (!input.equals("Finish")) {
                companyAveragePassengers += Integer.parseInt(input);
                input = keyboard.nextLine();

                flights++;
            }

            companyAveragePassengers /= flights;

            System.out.printf("%s: %d passengers.%n", companyName, companyAveragePassengers);

            if (companyAveragePassengers > maxCompanyAveragePassengers) {
                maxCompanyAveragePassengers = companyAveragePassengers;
                maxCompanyAveragePassengersName = companyName;
            }
        }

        System.out.printf("%s has most passengers per flight: %d", maxCompanyAveragePassengersName, maxCompanyAveragePassengers);
    }
}
