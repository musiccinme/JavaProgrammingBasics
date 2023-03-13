package L1FirstStepsInProgramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello SoftUni");
    }

    public static class BirthdayParty {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int rentHall = Integer.parseInt(scanner.nextLine());

            double cake = rentHall * 0.2;
            double drinks = cake - cake * 0.45;
            double animator = rentHall/3;

            double budget = rentHall + cake + drinks + animator;

            System.out.println(budget);
        }
    }
}
