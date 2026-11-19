package lt.vcd;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentsGrades {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int subjects = scanner.nextInt();
            int students = scanner.nextInt();

            int[][] grades = new int[students][subjects];
            double[] studentAverages = new double[students];
            double totalSum = 0;

            for (int i = 0; i < students; i++) {
                int studentSum = 0;
                for (int j = 0; j < subjects; j++) {
                    grades[i][j] = scanner.nextInt();
                    studentSum += grades[i][j];
                }
                studentAverages[i] = (double) studentSum / subjects;
                totalSum += studentAverages[i];
            }


            System.out.println("Student averages:");
            for (int i = 0; i < students; i++) {
                printNumber(studentAverages[i]);
            }
            System.out.println();


            double groupAverage = totalSum / students;
            System.out.println("Group average:");
            printNumber(groupAverage);
            System.out.println();


            double maxAverage = studentAverages[0];
            for (int i = 1; i < students; i++) {
                if (studentAverages[i] > maxAverage) {
                    maxAverage = studentAverages[i];
                }
            }


            System.out.println("Highest-performing student:");
            List<String> topStudents = new ArrayList<>();
            for (int i = 0; i < students; i++) {
                // Using a tiny tolerance (1e-9) to safely compare double values
                if (Math.abs(studentAverages[i] - maxAverage) < 1e-9) {
                    topStudents.add(String.valueOf(i + 1));
                }
            }
            System.out.println(String.join(" ", topStudents));
            System.out.println();


            System.out.println("Students with at least one grade below 5:");
            List<String> failingStudents = new ArrayList<>();
            for (int i = 0; i < students; i++) {
                for (int j = 0; j < subjects; j++) {
                    if (grades[i][j] < 5) {
                        failingStudents.add(String.valueOf(i + 1));
                        break; // Stop checking this student once one grade < 5 is found
                    }
                }
            }

            if (failingStudents.isEmpty()) {
                System.out.println("None");
            } else {
                System.out.println(String.join(" ", failingStudents));
            }
        }

        scanner.close();
    }

    // Helper method to print whole numbers cleanly without ".0"
    private static void printNumber(double val) {
        if (val == (long) val) {
            System.out.println((long) val);
        } else {
            System.out.println(val);
        }
    }
}
