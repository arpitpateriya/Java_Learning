package lecture_2;
import java.util.Scanner;

public class else_if {
    public static void main(String args []){
       Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        if (a>90){
            System.out.println("a");
        }
        else if(a>80){
            System.out.println("b");
        }
        else if (a>70){
            System.out.println("c");
        }
        else {
            System.out.println("fail" );
        }

    }
}
