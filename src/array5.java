import java.util.Scanner;
public class array5 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
       int max =a[0];
        int i;
        int j;
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        for(i=0;i<5;i++){
            if(a[i] > max)
            {
                max = a[i];
                System.out.println(+max);
            }
        }
    }
}
