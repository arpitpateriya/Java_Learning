import java.util.Scanner;
public class sheet_1 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        boolean result = num%2==0;
        System.out.println("even:- "+result);
    }
}
