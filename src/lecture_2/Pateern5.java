package lecture_2;

public class Pateern5 {
    public static void main (String args []){

        int n=5;
        int nsp =0;
        int nst =5;
        for(int row= 0; row<n;row++){
            //spaces
            for(int cst=0; cst<nsp;cst++){
                System.out.print(" ");
            }
            //stars
            for(int cst=0;cst<nst;cst++){
                System.out.print("*");
            }nst--;
            nsp++;
            System.out.println();


        }

    }}
