import java.util.Scanner ;
public class forloop6 {
    public  static  void main ( String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n= sc.nextInt();
        int sum =0;
//print sum of natural  no
        for(i=1;i<=n;i++)
        {
       sum= sum+i;
            System.out.println(sum);
            }

        }
    }