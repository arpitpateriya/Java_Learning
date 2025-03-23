import java.util.Scanner;
<<<<<<< HEAD
import java.lang.String;
=======
>>>>>>> ab67380feae8361d0cf36e3bf73a3b4d727a78a0

public class gradeingsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        String grade = calculateGrade(percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String calculateGrade(double percentage) {
        if (percentage < 25) {
            return "D";
        } else if (percentage >= 25 && percentage < 45) {
            return "C";
        } else if (percentage >= 45 && percentage < 50) {
            return "C+";
        } else if (percentage >= 50 && percentage < 60) {
            return "B+";
        } else if (percentage >= 60 && percentage <= 80) {
            return "A";
        } else {
            return "A+";
        }
    }
}