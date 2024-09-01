public class array2 {
    public static void main(String[] args) {
        int[] numbers = {10, 7, 25, 36, 42, 19, 8, 11, 5, 30};

        int even = 0;
        int odd = 0;

        for(int number : numbers) {
            if(number % 2 == 0) {
                even++;
                System.out.println(number + " is even");
            } else {
                odd++;
                System.out.println(number + " is odd");
            }
        }

       
    }
}