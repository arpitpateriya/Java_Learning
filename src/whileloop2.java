import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

// natural numbers in reverse
        System.out.println("Natural numbers in reverse from " + n + " to 1:");
        while (n >= 1) {
            System.out.println(n + " ");
            n--;
        }
    }
}
