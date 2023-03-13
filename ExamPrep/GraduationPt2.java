package ExamPrep;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double grade = Double.parseDouble(scanner.nextLine());
        int count = 1;

        while (grade >= 4) {
            double avg = grade / count;
            count++;
            double newGrade = Double.parseDouble(scanner.nextLine());
            if (newGrade == 2) {
                System.out.printf("%s has been excluded at %d grade", name, count);
            }
            grade = newGrade+grade;
        }
    }
}
