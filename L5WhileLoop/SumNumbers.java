package L5WhileLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int input = 0;

        while (input < n) {
            input += Integer.parseInt(scanner.nextLine());
        }

        System.out.println(input);
    }
}
