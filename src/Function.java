/*
user defined function
1 function default
2 function with parameter
3 function with return type
4 function with return type and parameter
pre-defined function
println
 */
import java.util.Scanner;
public class Function {
    static void f1()
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        a=sc.nextInt();
        int b;
        System.out.println("Enter the Number :- ");
        b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition of two number :- "+c);
    }
    public static void main(String args [])
    {
        f1();
        f1();
    }
}
