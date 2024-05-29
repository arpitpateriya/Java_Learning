import java.sql.SQLOutput;
import java.util.Scanner;
public class Relational_operators {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the Value :- ");
        a=sc.nextInt();
        int b;
        System.out.println("Enter the second value :- ");
        b=sc.nextInt();
        boolean c = a>b;
        System.out.println("C :- "+c);
    }
}
