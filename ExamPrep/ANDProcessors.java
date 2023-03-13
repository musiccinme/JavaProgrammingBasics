package ExamPrep;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cpuToMake = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int hours = 8 * workers * workDays;
        double cpuMade = Math.floor(hours/3);

        if (cpuMade >= cpuToMake) {
            double profit = cpuMade - cpuToMake;
            System.out.printf("Profit: -> %.2f BGN", profit * 110.10);
        } else {
            double loss = cpuToMake - cpuMade;
            System.out.printf("Losses: -> %.2f BGN", loss * 110.10);
        }

    }
}
