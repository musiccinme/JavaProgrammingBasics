package L2ConditionalStatements;

import java.util.Scanner;

public class ExWorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double waterResistance = Math.floor(distance/15) * 12.5;
        double resultIvan = distance*timeForOneMeter + waterResistance;

        if (resultIvan<worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", resultIvan);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", resultIvan - worldRecord);
        }
    }
}
