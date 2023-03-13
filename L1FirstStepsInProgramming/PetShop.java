package L1FirstStepsInProgramming;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int otherAnimals = Integer.parseInt(scanner.nextLine());
        double price = dogs * 2.50 + otherAnimals * 4;

        System.out.printf("%f lv.", price);
    }
}
