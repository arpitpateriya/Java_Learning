package lecture_2;

public class patternn {
    public static void main (String  args []){
        int n=5;
        int nsp =4;
        int nst =1;
        for(int row= 0; row<n;row++){
            //spaces
            for(int cst=0; cst<nsp;cst++){
                System.out.print(" ");
        }
          //stars
            for(int cst=0;cst<nst;cst++){
                System.out.print("*");
            }nst++;
            nsp--;
            System.out.println();


    }

}}