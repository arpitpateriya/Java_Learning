import java.util.Scanner ;
public class forloop7 {
    public  static  void main ( String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n= sc.nextInt();
        int sum =0;
//print sum ofodd no
        for(i=0;i<=n;i++)
        {
            if (i%2!=0){
               sum =sum+i;
                System.out.println(sum);

            }

        }
    }}