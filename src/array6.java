import java.util.Scanner;
public class array6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {2,3,4,5,6};
        int min = a[0];
        int i;


        for (i = 0; i < 5; i++) {
            if (a[i] < min) {

                min = a[i];
            }



        }System.out.println(min);
    }
}