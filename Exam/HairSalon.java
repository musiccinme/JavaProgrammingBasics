package Exam;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goalForTheDay = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int income = 0;
        int haircutIncome = 0;
        int colorIncome = 0;
        int fullIncome = 0;

        while (!input.equals("closed")) {
            if (input.equals("haircut")){
                String type = scanner.nextLine();
                switch (type) {
                    case "mens":
                        income = 15; break;
                    case "ladies":
                        income = 20; break;
                    case "kids":
                        income = 10; break;
                }
                haircutIncome += income;
            } else if (input.equals("color")) {
                String type = scanner.nextLine();
                switch (type) {
                    case "touch up":
                        income = 20; break;
                    case "full color":
                        income = 30; break;
                }
                colorIncome += income;
            }
            fullIncome = haircutIncome + colorIncome;
            if(fullIncome >= goalForTheDay){
                break;
            }


            input = scanner.nextLine();
        }
        if (fullIncome >= goalForTheDay){
            System.out.println("You have reached your target for the day!");
       } else {
            System.out.printf("Target not reached! You need %dlv. more.%n", goalForTheDay - fullIncome);
     }
        System.out.printf("Earned money: %dlv.", fullIncome);
    }
}
