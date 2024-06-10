public class two_d_array {
    public static void main(String args[])
    {
        int a[][] = {{2, 3}, {5, 1}};
        int b[][] = {{4, 2}, {8, 1}};
        int c[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();


        }



        }
    }

