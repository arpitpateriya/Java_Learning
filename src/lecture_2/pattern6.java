package lecture_2;
import java.util.Scanner;

public class pattern6 {
    public static void main (String args []){
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();
        int nsp =0;
        int nst = n;
        for(int row= 0; row <n;row++) {
            //spaces
            for (int cst = 0; cst < nsp; cst++) {
                System.out.print(" ");
            }
            //stars
            for (int cst = 0; cst < nst; cst++) {
                System.out.print("*");
            }
            nsp+=2;
            nst--;

            System.out.println();

        }}
        }
