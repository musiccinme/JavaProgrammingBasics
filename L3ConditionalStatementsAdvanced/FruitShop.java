package L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (fruit.equals("banana")) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.printf("%.2f", quantity*2.50); break;
                case "Saturday":
                case "Sunday":
                    System.out.printf("%.2f", quantity*2.70); break;
                default:
                    System.out.println("error"); break;
            }
        } else if (fruit.equals("apple")) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.printf("%.2f", quantity*1.20); break;
                case "Saturday":
                case "Sunday":
                    System.out.printf("%.2f", quantity*1.25); break;
                default:
                    System.out.println("error"); break;
            }
        } else if (fruit.equals("orange")) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.printf("%.2f", quantity*0.85); break;
                case "Saturday":
                case "Sunday":
                    System.out.printf("%.2f", quantity*.90); break;
                default:
                    System.out.println("error"); break;
            }
        } else if (fruit.equals("grapefruit")) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.printf("%.2f", quantity*1.45); break;
                case "Saturday":
                case "Sunday":
                    System.out.printf("%.2f", quantity*1.60); break;
                default:
                    System.out.println("error"); break;
            }
        } else if (fruit.equals("kiwi")) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.printf("%.2f", quantity*2.70); break;
                case "Saturday":
                case "Sunday":
                    System.out.printf("%.2f", quantity*3.00); break;
                default:
                    System.out.println("error"); break;
            }
        } else if (fruit.equals("pineapple")) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.printf("%.2f", quantity*5.50); break;
                case "Saturday":
                case "Sunday":
                    System.out.printf("%.2f", quantity*5.60); break;
                default:
                    System.out.println("error"); break;
            }
        } else if (fruit.equals("grapes")) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.printf("%.2f", quantity*3.85); break;
                case "Saturday":
                case "Sunday":
                    System.out.printf("%.2f", quantity*4.20); break;
                default:
                    System.out.println("error"); break;
            }
        } else {
            System.out.println("error");
        }
    }
}
