import java.util.Scanner;
public class two_digit_or_not {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        boolean result = num<=9999 && num>=1000;
        System.out.println("two digit number :- "+result);
    }
}