import java.util.Scanner ;
public class ifelse6 {
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
         int p ;
        if (a+b+c+d+e>=200)
        {
            p= (a+b+c+d+e)/5 ;
            System.out.println("true"+p);
        } else {
            System.out.println("false");
        }

    }
}

