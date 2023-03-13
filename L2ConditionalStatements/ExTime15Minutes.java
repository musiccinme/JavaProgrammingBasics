package L2ConditionalStatements;

import java.util.Scanner;

public class ExTime15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutes15 = minutes + 15;

        if (minutes15 >= 60) {
            hours = hours + 1;
            minutes15 = minutes15 % 60;
        }
        if (hours >= 24){
            hours = hours % 24;
        }

        if (minutes15 <10) {
            System.out.printf("%d:0%d", hours, minutes15);
        } else {
            System.out.printf("%d:%d", hours, minutes15);
        }
    }
}
