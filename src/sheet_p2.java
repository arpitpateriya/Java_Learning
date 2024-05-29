import java.util.Scanner;
public class sheet_p2{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the no");
        a=sc.nextInt();
        int b;
        System.out.println("enter the no");
        b=sc.nextInt();
        int c;
        System.out.println("enter the no30");
        c=sc.nextInt();
        boolean result = a+b+c==180;
        System.out.println("trianglr:- "+result);
    }
}