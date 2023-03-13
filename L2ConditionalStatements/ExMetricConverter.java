package L2ConditionalStatements;

import java.util.Scanner;

public class ExMetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String unit1 = scanner.nextLine();
        String unit2 = scanner.nextLine();

//        if (unit1.equals("mm") && unit2.equals("cm")) {
//            number = number / 10;
//        }
//        else if (unit1.equals("mm") && unit2.equals("m")) {
//            number = number / 1000;
//        }
//        else if (unit1.equals("cm") && unit2.equals("mm")) {
//            number = number * 10;
//        }
//        else if (unit1.equals("cm") && unit2.equals("m")) {
//            number = number / 100;
//        }
//        else if (unit1.equals("m") && unit2.equals("mm")) {
//            number = number * 1000;
//        }
//        else if (unit1.equals("m") && unit2.equals("cm")) {
//            number = number * 100;
//        }

        if (unit1.equals("mm")) {
            number = number / 1000;
        }
        else if (unit1.equals("cm")) {
            number = number / 100;
        }

        if (unit2.equals("mm")) {
            number = number * 1000;
        }
        else if (unit2.equals("cm")) {
            number = number * 100;
        }
        else {
            number = number * 1;
        }

        System.out.printf("%.3f", number);
    }
}
