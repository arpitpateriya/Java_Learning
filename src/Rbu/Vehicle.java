package Rbu;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Vehicle {
    private String vechicleNumber;
    private String vechicleName;
    private double price ;
    private int year ;
    private  String FuelType ;
    private  int Seatnum ;
     public Vehicle() {
         vechicleNumber = "";
         vechicleName = "";
         price = 0.0;
         year = 0;
         FuelType = "";
         Seatnum = 0;
     }
     public void inputVehicledata() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter the vechile number");
         vechicleNumber = scanner.nextLine();


         System.out.println("enter the vechile name");
         vechicleName = scanner.nextLine();

         System.out.println("enter price");
         price = scanner.nextDouble();


         System.out.println("enter manifacturing year");
         year = scanner.nextInt();

         scanner.nextLine(); //consume nextline
         System.out.println("Enter the fuel type:");
         FuelType = scanner.nextLine();
         System.out.println("enter the number of seats :");
         Seatnum = scanner.nextInt();
         System.out.println("Vehicle data has been recored Sucessfully");
     }
     public void displayVehicledata(){
        System.out.println("\n Vechicle Details");
        System.out.println("Vehicle name" + vechicleName);
        System.out.println("vehicle number" + vechicleNumber);
        System.out.println("price" + price);
        System.out.println("year" + year);
        System.out.println("fuel type" + FuelType);
        System.out.println("seat number" + Seatnum);
    }

         public static void main (String []args){

             Vehicle vehicle =new Vehicle();

             vehicle.inputVehicledata();
             vehicle.displayVehicledata();
         }

}
