package Exam;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.0;

        switch (season) {
            case "spring":
                if(persons<=5) {
                    price = 50 * persons;
                } else {
                    price = 48 * persons;
                } break;
            case "summer":
                if(persons<=5) {
                    price = 48.5 * persons * 0.85;
                } else {
                    price = 45 * persons * 0.85;
                } break;
            case "autumn":
                if(persons<=5) {
                    price = 60 * persons;
                } else {
                    price = 49.5 * persons;
                } break;
            case "winter":
                if(persons<=5) {
                    price = 86 * persons * 1.08;
                } else {
                    price = 85 * persons * 1.08;
                } break;
        }
        System.out.printf("%.2f leva.", price);
    }
}
