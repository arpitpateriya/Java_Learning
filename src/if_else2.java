import java.util.Scanner;
public  class if_else2{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number :- ");
        a=sc.nextInt();
        int b;
        b=sc.nextInt();
        int c;
        c=sc.nextInt();
        if(a+b+c==180)
        {
            System.out.println("It is tiangle");
        }
        else {
            System.out.println("It is not a triangle" );
        }
    }
}