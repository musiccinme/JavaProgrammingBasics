package Exam;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        for (int a = 1; a < 10; a++){
            for (int b = 9; b >= a; b--){
                for (int c = 0; c < 10; c++ ){
                    for (int d = 9; d > c; d--) {
                        if((a+b+c+d == a*b*c*d) && (n%10 == 5)) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            flag = true;
                            break;
                        } else if ( ((a*b*c*d) / (a+b+c+d) == 3) && (n % 3 == 0) ) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            flag = true;
                            break;
                        }
                        if (flag) {
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (flag) {
        } else {
            System.out.println("Nothing found");
        }
    }
}
