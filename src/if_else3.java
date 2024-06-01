import java.util.Scanner;

public class if_else3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number :- ");
        a=sc.nextInt();
                if(a<=99 && a>=10)
      {
            System.out.println("It is 2 digit");
        } else {
            System.out.println("It is not 2 digit");
        }
    }
}