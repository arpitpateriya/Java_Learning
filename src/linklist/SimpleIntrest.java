package linklist;

import java.util.Scanner;
import  java.util.Scanner;
public class SimpleIntrest {



        public static void main(String args[]){
            Scanner scanner=new Scanner(System.in);
            System.out.println("rate" );

            int r =scanner.nextInt();
            System.out.println("priciple value" );
            int p =scanner.nextInt();
            System.out.println("time" );
            int n=scanner.nextInt();

            int SI=(p*r*n)/100;

            System.out.println("simple intrest:"+SI);

        }
}
