public class eee  {
    public static void main(String[] args) {
        int rows = 4;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(number);
            }

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            number += 2;
            System.out.println();
        }
    }
}
