import java.util.Scanner;
public class function2 {
    static void f1() {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        a = sc.nextInt();
        int b;
        System.out.println("Enter the Number :- ");
        b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int percent;
        if (a > 35) {
            if (b > 35) {
                if (c > 35) {
                    if (d > 35) {
                        if (e > 35) {
                        }
                    }
                }
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
            int total = a + b + c + d + e;
            System.out.println(+total);
            percent = (a + b + c + d + e) / 5;
            System.out.println(+percent);

        }
    }
        public static void main (String args [])
        {

            f1();
            f1();
            f1();
            f1();
        }
    }

