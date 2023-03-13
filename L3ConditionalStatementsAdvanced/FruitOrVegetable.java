package L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        switch (product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit"); break;
            case "carrot":
            case "tomato":
            case "cucumber":
            case "pepper":
                System.out.println("vegetable"); break;
            default:
                System.out.println("unknown"); break;
        }
    }
}
