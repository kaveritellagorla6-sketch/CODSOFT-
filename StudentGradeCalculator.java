import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;
        double percentage = total / 3.0;

        String grade;

        if (percentage >= 90)
            grade = "A";h
        else if (percentage >= 75)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else
            grade = "D";

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}