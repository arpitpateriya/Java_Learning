public class whileloop5 {
    public static void main(String[] args) {
        int num = 1;

        System.out.println("Even numbers from 1 to 50:");

        while (num <= 50) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}