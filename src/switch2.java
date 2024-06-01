import java.util.Locale;
import java.util.Scanner ;
public class switch2 {
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int num1= sc.nextInt();
        System.out.println("enter th no");
        int num2= sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+' :

                System.out.println(num1 +num2);
                break;
            case '-' :
                System.out.println(num1 -num2);
                break;
            case '*' :
                System.out.println(num1 *num2);
                break;
            case '/' :
                System.out.println(num1 /num2);
                break;


            default:
              break;

        }

    }
}