import java.util.Scanner;

public class nested4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three angles of the triangle:");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Triangle is equilateral.");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Triangle is right-angled.");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Triangle is isosceles.");
            } else {
                System.out.println("Triangle is neither equilateral, isosceles nor right-angled.");
            }
        } else {
            System.out.println("Triangle cannot be formed with these angles.");
        }
    }
}
