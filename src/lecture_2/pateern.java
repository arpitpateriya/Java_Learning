package lecture_2;

public class pateern {
    public static void main(String args []){
        int nst=5;
        for (int row=0;row<5;row++)
        {
            for(int cst=0;cst<nst;cst++)
            {
                System.out.print("*");
            }nst--;
            System.out.println();
        }

    }
}
