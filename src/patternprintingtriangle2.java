public class patternprintingtriangle2{

    public static void main(String[] args) {
        int rows = 5;


        for(int i = 0; i <= rows; i++){
            for(int j = 0; j < i; j++) {
                if (i == 1 || i == rows || j == 1 ){
             System.out.print("*");

            }
                else {
                    System.out.println(" ");
                }
            System.out.println();
        }
    }
}}

