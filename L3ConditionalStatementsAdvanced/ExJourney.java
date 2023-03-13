package L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class ExJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeAccommodation = "";
        double spentMoney = 0.0;

        if(budget <= 100){
            destination = "Bulgaria";
            if(season.equals("summer")){
                typeAccommodation = "Camp";
                spentMoney = budget*0.3;
            } else {
                typeAccommodation = "Hotel";
                spentMoney = budget*0.7;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if(season.equals("summer")){
                typeAccommodation = "Camp";
                spentMoney = budget*0.4;
            } else {
                typeAccommodation = "Hotel";
                spentMoney = budget*0.8;
            }
        } else {
            destination = "Europe";
            typeAccommodation = "Hotel";
            spentMoney = budget*0.9;
            }
        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", typeAccommodation, spentMoney);
    }
}
