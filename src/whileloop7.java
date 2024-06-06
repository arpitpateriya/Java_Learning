import java.util.Scanner;

public class whileloop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input num: ");
        int num = input.nextInt();

        System.out.println("Output:");
        int i = 1;
        while ( i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}