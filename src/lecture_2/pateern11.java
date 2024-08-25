package lecture_2;
import java.util.Scanner;
public class pateern11 {
    public static void main (String args []){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp1 = n - 1;

        int nsp2 = n - 2;

        int nst = 1;

        for (int row = 0; row < n; row++) {

// phele space h nsp1 wala;

            for (int csp = 0; csp < nsp1; csp++) {

                System.out.print("  ");

            }

            for (int cst = 0; cst < nst; cst++) {

                System.out.print("*");

                for (int csp = 0; csp < nsp2; csp++) {

                    System.out.print(" ");

                }



            }

            System.out.println();

            nsp1--;
            nst++;
    }
}}
