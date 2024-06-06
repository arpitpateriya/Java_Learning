import java.util.Scanner ;
public class forloop5 {
    public  static  void main ( String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n= sc.nextInt();
//print odd no
        for(i=0;i<=n;i++)
        {
            if (i%2!=0){
                System.out.println(i+" ");

            }

        }
    }}