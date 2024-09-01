import java.util.Scanner;

public class whileloop6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();

        int sum = 0;
        int num = 1;

        while (num <= n) {
            if (num % 2 != 0) {
                sum += num;
            }
            num++;
        }

        System.out.println("Sum of odd num " + n + " is: " + sum);
    }
}
