import java.util.Scanner;
public class biketaxifelse  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int bike;
        bike = sc.nextInt();
        if (100000< bike) {
            System.out.println("tax will be 15 percentage");
        }
        else if (50000<<100000<= bike) {
            System.out.println("tax will be 10 percentage");
        }


        else {
            System.out.println("5");
        }
    }
}
