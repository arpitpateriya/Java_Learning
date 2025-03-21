package Rbu;
import java.sql.SQLOutput;
import java.util.Scanner;

public class grading_system {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your marks");
        double marks = sc.nextDouble();



        if(marks>=90)
        {
            System.out.println("AA grade");


        }
        else if(marks>=80){
            System.out.println("AB grade");

        }
       else if(marks>=70){
            System.out.println("BB grade");

        }
        else if(marks>=60){
            System.out.println("BC grade");

        }
       else if(marks>=50){
            System.out.println("CC grade");

        }
        else {
            System.out.println(" FF grade");
        }
        sc.close();


    }

}
