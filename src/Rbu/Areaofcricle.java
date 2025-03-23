 package Rbu  ;
import  java.util.Scanner;
public class Areaofcricle {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter radius" );
        int r =scanner.nextInt();
        //operation
     double Area_circle=(3.14*r*r);
     double perimeter= 2*Math.PI*r;

     // result
        System.out.println("Area of rectangle"+Area_circle);
        System.out.println("peri"+perimeter);
    }
}

