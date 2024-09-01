

public class patternprint {
    public static void main(String[] args) {
        int j;

        for (int i= 1; i <= 7; i++) {
            for ( j = 1; j <=  7- i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 *i - 1); k++) {
                System.out.print(+i);

            }
            System.out.println();

        }
    }
}

