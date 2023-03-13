package Exam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int studentsCount = 0;
        double topCount = 0.0;
        double topGrades = 0.0;
        double secondCount = 0.0;
        double secondGrades = 0.0;
        double thirdCount = 0.0;
        double thirdGrades = 0.0;
        double failCount = 0.0;
        double failGrades = 0.0;
        double grade = 0.0;


        while (studentsCount < students) {
            grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5) {
                topCount++;
                topGrades += grade;
            } else if (grade >= 4) {
                secondCount ++;
                secondGrades += grade;
            } else if (grade >= 3) {
                thirdCount++;
                thirdGrades += grade;
            } else if (grade < 3) {
                failCount ++;
                failGrades += grade;
            }
            grade += grade;
            studentsCount++;
        }
        double allGrades = topGrades + secondGrades + thirdGrades + failGrades;
        System.out.printf("Top students: %.2f%s%n", topCount/students*100, "%");
        System.out.printf("Between 4.00 and 4.99: %.2f%s%n", secondCount/students*100, "%");
        System.out.printf("Between 3.00 and 3.99: %.2f%s%n", thirdCount/students*100, "%");
        System.out.printf("Fail: %.2f%s%n", failCount/students*100, "%");
        System.out.printf("Average: %.2f", allGrades/students);
    }
}
