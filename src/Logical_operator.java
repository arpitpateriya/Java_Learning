import java.util.Scanner;
public class Logical_operator {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        boolean result = num%11==0 && num%5==0;
        System.out.println("Result :- "+result);
    }
}
