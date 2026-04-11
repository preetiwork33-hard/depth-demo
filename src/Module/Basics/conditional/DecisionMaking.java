package Module.Basics.conditional;

import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //If Condition
        if (true){
            System.out.println("execute block of code ");
        }
        //  Even or Odd
        System.out.println("Enter value n:");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("n is even");
        } else {
            System.out.println("n is odd");
        }
        //  If-Else Ladder (Grading System)
        System.out.println("Enter marks:");
        int marks = scanner.nextInt();

        if (marks > 70) {
            System.out.println("Grade A");
        } else if (marks > 55) {
            System.out.println("Grade B");
        } else if (marks > 33) {
            System.out.println("Grade C");
        } else if (marks == 33) {
            System.out.println("Just Pass");
        } else {
            System.out.println("Fail - Try to improve");
        }

        // 🔹 Nested IF (Validation System)
        System.out.println("Enter ID:");
        int id = scanner.nextInt();

        scanner.nextLine(); // fix buffer issue

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Exam Marks:");
        int examScore = scanner.nextInt();

        // Re-enter values for validation
        System.out.println("Re-enter ID:");
        int checkId = scanner.nextInt();

        scanner.nextLine(); // fix buffer again

        System.out.println("Re-enter Name:");
        String checkName = scanner.nextLine();

        System.out.println("Re-enter Exam Marks:");
        int checkMarks = scanner.nextInt();

        // Validation using nested if
        if (id == checkId) {
            if (name.equals(checkName)) {
                if (examScore == checkMarks) {
                    System.out.println(" Marks = " + examScore);
                } else {
                    System.out.println("Marks do not match");
                }
            } else {
                System.out.println(" Name does not match");
            }
        } else {
            System.out.println("ID does not match");
        }

        scanner.close();
    }
}