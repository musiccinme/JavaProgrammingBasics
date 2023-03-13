package ExamPrep;

import java.util.Scanner;

public class PassengersPerFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int airlinesNum = Integer.parseInt(scanner.nextLine());

        for (int i = airlinesNum; i > 0; i--) {
            String airlines = scanner.nextLine();
            String input = scanner.nextLine();
            double max = Double.MIN_VALUE;

            double passengers = 0.0;
            int flightCount = 0;
            while (!input.equals("Finish")) {
                passengers += Double.parseDouble(input);
                flightCount++;
                input = scanner.nextLine();
            }
            double average = Math.floor(passengers / flightCount);
            System.out.printf("%s: %.0f passengers%n", airlines, average);

        }
    }
}
