import java.util.Scanner;

public class Grade_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        while (numStudents <= 0) {
            System.out.println("Number of students should be greater than 0.");
            System.out.print("Enter the number of students: ");
            numStudents = scanner.nextInt();
        }

        double totalGrade = 0;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            double grade = scanner.nextDouble();

            while (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                System.out.print("Enter the grade for student " + i + ": ");
                grade = scanner.nextDouble();
            }

            totalGrade += grade;
        }

        double averageGrade = totalGrade / numStudents;
        System.out.println("Average grade: " + averageGrade);

        scanner.close();
    }
}
