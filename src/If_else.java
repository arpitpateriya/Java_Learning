/*
if(condition)
{
    body if condition is true
}
else
{
    body if condition is false
}
 */
import java.util.Scanner;
public class If_else {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :- ");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("It is Even number");
        }
        else {
            System.out.println("It is odd number");
        }
    }
}
