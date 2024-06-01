import java.util.Scanner;

public class nested5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to apply for a job.");

            if (age >= 18 && age <= 30) {
                System.out.println("You belong to the young age group (18-30).");

            }
            else if (age > 30 && age <= 50) {
                System.out.println("You belong to the middle age group (31-50).");

            }
            else {
                System.out.println("You belong to the senior age group (51 and above).");

            }
        } else {
            System.out.println("You are not eligible to apply for a job.");
        }
    }
}
