class phone{
    static void f1(){
        System.out.println("camera");


        }


    static void f1(int x)
    {
        System.out.println("pubg");
    }
}
public class compiletime_polymorphism {
    public static void main (String args []){
        phone m =new phone();
        m.f1();
        m.f1(1);
    }
}
