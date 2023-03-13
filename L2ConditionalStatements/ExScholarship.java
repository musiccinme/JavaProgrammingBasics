package L2ConditionalStatements;

import java.util.Scanner;

public class ExScholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minimalWage = Double.parseDouble(scanner.nextLine());

        double socialScholarship = Math.floor(minimalWage*0.35);
        double excellentScholarship = Math.floor(averageScore*25);

        if (averageScore < 4.5){
            System.out.println("You cannot get a scholarship!");
        }
        else if (income < minimalWage && averageScore < 5.5) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        }
        else if (income < minimalWage && averageScore >= 5.5) {
            if (socialScholarship > excellentScholarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
            }
        }
        else if (income >= minimalWage && averageScore >= 5.5) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }
        else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
