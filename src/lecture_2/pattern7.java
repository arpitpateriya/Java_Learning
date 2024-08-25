package lecture_2;
import java.util.Scanner;
public class pattern7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nsp = n - 2;
        int nst = n;
        for (int row = 0; row < n; row++) {
       if (row==0||row==n-1){
           for(int cst=0;cst<nst;cst++)
           //srif star print kar na hai
           System.out.print("*");
       }else{
           System.out.print("*");
           for(int csp=0;csp<nsp;csp++){
               System.out.print(" ");
           }
           System.out.print("*");
       }
            System.out.println();
        }
    }
}