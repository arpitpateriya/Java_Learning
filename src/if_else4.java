import java.util.Scanner;
public class if_else4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number :- ");
        a = sc.nextInt();

        if (a <= 9999 && a >= 1000) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

