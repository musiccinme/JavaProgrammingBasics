package L1FirstStepsInProgramming;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double finalPrice = area * 7.61 - area * 7.61 * 0.18;
        double discount = area * 7.61 * 0.18;

        System.out.printf("The final price is: %f lv.", finalPrice);
        System.out.printf("The discount is: %f lv.", discount);
    }
}
