package lecture_2;

import java.util.Scanner;

public class pattern10 {public static void main (String args []){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int nsp=1;
    int nst =n+1;
    for(int row=0; row<n;row++){
        //space
        for (int csp=0;csp<nsp;csp++){
            System.out.print(" ");
        }
        //star
        for (int cst=0;cst<nst;cst++){
            System.out.print("*");
        }
        //nsp+=2
        nst=nst-2;
        nsp++;
        System.out.println();
    }

}
}
