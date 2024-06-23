import java.lang.String;
public class exception1 {
  public   static void main(String args[]){
        int a=10;
        int b=0;
        try{
            int result =a/b;//division by zero
            System.out.println("result"+result);

        }catch (ArithmeticException e){
            System.out.println("divide by zero is not allowed");
        }
    }

}
