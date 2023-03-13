package L4ForLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < n; i++) {
            int left = Integer.parseInt(scanner.nextLine());
            sumLeft = sumLeft + left;
        }
        for (int i = 0; i < n; i++) {
            int right = Integer.parseInt(scanner.nextLine());
            sumRight = sumRight + right;
        }

        if (sumLeft == sumRight) {
            System.out.println(" Yes, sum = " + sumLeft);
        } else if (sumLeft > sumRight) {
            System.out.println(" No, diff = " + (sumLeft - sumRight));
        } else {
            System.out.println(" No, diff = " + (sumRight - sumLeft));
        }
    }
}
