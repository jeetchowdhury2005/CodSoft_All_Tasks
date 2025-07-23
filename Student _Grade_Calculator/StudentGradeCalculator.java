import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        String grade;
        System.out.print("Enter the number of subjects: ");
        int subjects = input.nextInt();
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter the marks for subject" + i + " (out of 100): ");
            int marks = input.nextInt();
            total += marks;
        }
        double average = (total / subjects);
        if (average >= 90) {
            grade = "O";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks Obtained: " + total + " out of " + (subjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        input.close();
    }
}