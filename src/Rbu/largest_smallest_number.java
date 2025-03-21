package Rbu;

import java.util.Scanner;

public class largest_smallest_number {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);

        // input taken by client
        System.out.println("enter first number");
        int num1= scanner.nextInt();


        System.out.println("enter second number");
        int num2= scanner.nextInt();

        System.out.println("enter third number");
        int num3= scanner.nextInt();

        int largest =(num1>num2)?(num1>num3?num1:num3):(num2 > num3 ? num2: num3);
        int smallest =(num1<num2)?(num1<num3?num1:num3):(num2 < num3 ? num2: num3);


        System.out.println("the largest number is:"+largest);
        System.out.println("the smallest number is "+smallest);

    }
}
