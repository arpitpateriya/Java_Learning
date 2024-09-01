import java.util.Scanner;
public class array7 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        int d[]=new int[5];
        int i;
        int j;
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            b[i]=sc.nextInt()    ;
        }
        for(i=0;i<5;i++)
        {
            d[i]=sc.nextInt()    ;
        }
        for(i=0;i<5;i++) {
            c[i] = a[i] + b[i]+d[i];
            System.out.println(+c[i]);
        }
    }
}

