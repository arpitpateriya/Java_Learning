import java.util.Scanner;
public class ladderif2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int day;
        day = sc.nextInt();
        if (1 == day) {
            System.out.println("sunday");
        } else if (2 == day) {
            System.out.println("monday");
        } else if (3 == day) {
            System.out.println("thue");
        } else if (4 == day) {
            System.out.println("wed");
        } else if (5 == day) {
            System.out.println("thuesday");
        } else if (6 == day) {
            System.out.println("friday");
        } else if (7 == day) {
            System.out.println("satday");
        } else {
            System.out.println("not a dayu");
        }
    }
}
