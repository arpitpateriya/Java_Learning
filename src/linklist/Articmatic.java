package linklist;

import java.util.Scanner;

public class Articmatic {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num1" );
        int num1=scanner.nextInt();
        System.out.println("enter num2");
        int num2=scanner.nextInt();
        //operation
        int Addition =num1+num2;
        int subtraction = num1-num2;
        int multipication =num1*num2;
        int division = num1/num2 ;
        // result
        System.out.println("Addition :"+Addition);
        System.out.println("subtraction:"+subtraction);
        System.out.println("multipication"+multipication);
        System.out.println("division:"+division);

    }
}
