package ExamPrep;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int percentDiscountPaper = Integer.parseInt(scanner.nextLine());
        double priceDesigner = Double.parseDouble(scanner.nextLine());
        int percentPayedTeam = Integer.parseInt(scanner.nextLine());

        double priceBook = pricePerPage * 899 + pricePerCover * 2;
        double priceWDiscount = priceBook  - priceBook * percentDiscountPaper/100;
        double priceWDesigner = priceWDiscount + priceDesigner;
        double priceForA = priceWDesigner - priceWDesigner * percentPayedTeam/100;

        System.out.printf("Avtonom should pay %.2f BGN.", priceForA);
    }
}
