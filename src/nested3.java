import java.util.Scanner;

public class nested3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 1000 && number <= 9999) {
            int firstTwoDigitsSum = (number / 1000) + ((number / 100) % 10);
            int lastTwoDigitsSum = ((number / 10) % 10) + (number % 10);

            if (firstTwoDigitsSum == lastTwoDigitsSum) {
                System.out.println("The number is a 4-digit number and the sum of its first 2 digits is equal to the sum of its last 2 digits.");
            } else {
                System.out.println("The number is a 4-digit number but the sum of its first 2 digits is not equal to the sum of its last 2 digits.");
            }
        } else {
            System.out.println("The number is not a 4-digit number.");
        }
    }
}