import java.util.Scanner ;
public class forloop2 {
    public  static  void main ( String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n= sc.nextInt();
//reverse printing numberr
        for(i=n;i>=1;i--)
        {
            System.out.println(i);
        }

    }
}
