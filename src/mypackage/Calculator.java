package mypackage;

public class Calculator {



    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;

    }
    public int multiply(int a,int b){
        return a*b;

    }
    public int divide(int a,int b){
        if (b==0){
            System.out.println("error: DIvision by zero");
            return 0;
        }
        return a/b;

    }
}
