package L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour!= 10 &&
                hour!= 11 &&
                hour!= 12 &&
                hour!= 13 &&
                hour!= 14 &&
                hour!= 15 &&
                hour!= 16 &&
                hour!= 17 &&
                hour!= 18 || day.equals("Sunday")
        ) {
            System.out.println("closed");
        } else {
            System.out.println("open");
        }
    }
}
