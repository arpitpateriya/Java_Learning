import java.util.Scanner;

public class nested2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 1000 && number <= 9999) {
            System.out.println("The number is a 4-digit number.");
        } else {
            System.out.println("The number is not a 4-digit number.");
        }
    }
}
