import java.util.Scanner ;
public class switch1 {
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("thuesday");
                break;
            case 3:
                System.out.println("wedsday");
                break;
            case 4:
                System.out.println("thuesday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("satuday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("it not a day");


        }

    }
}