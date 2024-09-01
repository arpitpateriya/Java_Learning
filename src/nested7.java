import java.util.Scanner;

public class nested7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first digit: ");
        int digit1 = scanner.nextInt();

        System.out.print("Enter the second digit: ");
        int digit2 = scanner.nextInt();

        System.out.print("Enter the third digit: ");
        int digit3 = scanner.nextInt();

        int largestDigit = Math.max(Math.max(digit1, digit2), digit3);
        int secondLargestDigit = 0;
        int thirdLargestDigit = 0;

        if (largestDigit == digit1) {
            secondLargestDigit = Math.max(digit2, digit3);
            thirdLargestDigit = Math.min(digit2, digit3);
        } else if (largestDigit == digit2) {
            secondLargestDigit = Math.max(digit1, digit3);
            thirdLargestDigit = Math.min(digit1, digit3);
        } else {
            secondLargestDigit = Math.max(digit1, digit2);
            thirdLargestDigit = Math.min(digit1, digit2);
        }

        System.out.println("The three largest digits are: " + largestDigit + ", " + secondLargestDigit + ", " + thirdLargestDigit);
    }
}
