package L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class ExOnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minuteOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());


        if (hourOfArrival == hourOfExam) {
            if (minuteOfArrival == minuteOfExam) {
                System.out.println("On time");
            } else if (minuteOfArrival < minuteOfExam) {
                if (minuteOfExam - minuteOfArrival <= 30) {
                    System.out.println("On time");
                    System.out.printf("%d minutes before the start", minuteOfExam - minuteOfArrival);
                } else {
                    System.out.println("Early");
                    System.out.printf("%d minutes before the start", minuteOfExam - minuteOfArrival);
                }
            } else {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", minuteOfArrival - minuteOfExam);
            }
        } else if (hourOfArrival < hourOfExam) {
            if (minuteOfArrival == minuteOfExam) {
                System.out.println("Early");
                System.out.printf("%d:00 hours before the start", hourOfExam - hourOfArrival);
            } else if (minuteOfArrival > minuteOfExam) {
                if (hourOfExam - hourOfArrival == 1) {
                    if (60 - minuteOfArrival + minuteOfExam <= 30) {
                        System.out.println("On time");
                        System.out.printf("%d minutes before the start", 60 - minuteOfArrival + minuteOfExam);
                    } else {
                        System.out.println("Early");
                        System.out.printf("%d minutes before the start", 60 - minuteOfArrival + minuteOfExam);
                    }
                } else {
                    System.out.println("Early");
                    if (60 - minuteOfArrival + minuteOfExam < 10) {
                        System.out.printf("%d:0%d hours before the start", hourOfExam - hourOfArrival, 60 - minuteOfArrival + minuteOfExam);
                    } else {
                        System.out.printf("%d:%d hours before the start", hourOfExam - hourOfArrival, 60 - minuteOfArrival + minuteOfExam);
                    }

                }
            } else if (minuteOfArrival < minuteOfExam) {
                System.out.println("Early");
                if (minuteOfExam - minuteOfArrival < 10) {
                    System.out.printf("%d:0%d hours before the start", hourOfExam - hourOfArrival, minuteOfExam - minuteOfArrival);
                } else {
                    System.out.printf("%d:%d hours before the start", hourOfExam - hourOfArrival, minuteOfExam - minuteOfArrival);
                }
            }
        } else if (hourOfArrival > hourOfExam) {
            if (minuteOfArrival == minuteOfExam) {
                System.out.println("Late");
                System.out.printf("%d:00 hours after the start", hourOfArrival - hourOfExam);
            } else if (minuteOfArrival > minuteOfExam) {
                System.out.println("Late");
                if (minuteOfArrival - minuteOfExam < 10) {
                    System.out.printf("%d:0%d hours after the start", hourOfArrival - hourOfExam, minuteOfArrival - minuteOfExam);
                } else {
                    System.out.printf("%d:%d hours after the start", hourOfArrival - hourOfExam, minuteOfArrival - minuteOfExam);
                }
            } else if (minuteOfArrival < minuteOfExam) {
                if (hourOfArrival - hourOfExam == 1) {
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", 60 - minuteOfExam + minuteOfArrival);
                } else {
                    System.out.println("Late");
                    if (60 - minuteOfExam + minuteOfArrival < 10) {
                        System.out.printf("%d:0%d hours after the start", hourOfArrival - hourOfExam, 60 - minuteOfExam + minuteOfArrival);
                    } else {
                        System.out.printf("%d:%d hours after the start", hourOfArrival - hourOfExam, 60 - minuteOfExam + minuteOfArrival);
                    }
                }
            }
        }
    }
}
