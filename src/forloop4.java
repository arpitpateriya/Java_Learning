import java.util.Scanner ;
public class forloop4 {
    public  static  void main ( String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n= sc.nextInt();
//print even no
        for(i=1;i<=n;i++)
        {
            if (i%2==0){
            System.out.println(i+" ");

        }

    }
}}