package L1FirstStepsInProgramming;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double litersWater = length * width * hight * 0.001;
        double containedWater = litersWater - litersWater * percent / 100;

        System.out.printf("%.2f", containedWater);
    }
}
