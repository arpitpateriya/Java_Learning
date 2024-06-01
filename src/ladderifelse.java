import java.util.Scanner;
public class ladderifelse {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        num1=sc.nextInt();
        int num2;
        num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Num1 is greater than num2");
        }
        else if(num2>num1)
        {
            System.out.println("Num2 is greater than num1");
        }
        else
        {
            System.out.println("both are equal");
        }
    }
}
