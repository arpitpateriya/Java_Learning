package Rbu;
import mypackage.Calculator;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class MMain {
    public static void main(String []args){
        Calculator calc = new Calculator();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1=sc.nextInt();
        System.out.println("Enter Second number :");
        int num2=sc.nextInt();


        System.out.println("Adddition   :"+calc.add(num1,num2));
        System.out.println("subtraction  :"+calc.subtract(num1,num2));
        System.out.println("Multipication   :"+calc.multiply(num1,num2));
        System.out.println("Division :"+calc.divide(num1,num2));

    }
}
