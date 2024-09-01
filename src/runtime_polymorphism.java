class s1{
    static void f1()
    {
        System.out.println("f1 function from s1 class");
    }
}
class s2 extends s1{
    static  void f1()
    {
        System.out.println("f1 function from s2 class");
    }
}
public class runtime_polymorphism {
    public static void main(String args [])
    {
        s2 s = new  s2();
        s.f1();
    }
}
