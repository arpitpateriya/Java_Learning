import java.util.Scanner ;
public class if_else5 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
                int a;
                a  =sc.nextInt();
        int b;
        b=sc.nextInt();
        int c;
        c  =sc.nextInt();
        int d;
        d=sc.nextInt();
        int e;
        e  =sc.nextInt();

        if (a+b+c+d+e>=200)
        {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
