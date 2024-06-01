import java.util.Scanner;
public class Nested_if_else {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the marks  of a :- ");
         a= sc.nextInt();
         int b;
        System.out.println("Enter the marks of b :- ");
        b=sc.nextInt();
        int c;
        System.out.println("Enter the marks of c :- ");
        c=sc.nextInt();
        if(a>35 && a<=50)
        {
            System.out.println("Pass in aptitude");
            if(b>40 && b<=50)
            {
                System.out.println("pass in coding");
                if(c>45 && c<=50)
                {
                    System.out.println("congratulation you got a job");
                }
                else
                {
                    System.out.println("Reject in interview");
                }
            }
            else
            {
                System.out.println("reject in coding");
            }
        }
        else
        {
            System.out.println("reject in aptitude");
        }

    }
}
