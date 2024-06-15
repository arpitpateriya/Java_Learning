class grandfather{
static int c=15;
static void f3(){
    System.out.println(grandfather.c);
}
}
class parentss extends grandfather{
    static int a=10;
    static void f1()
    {
        parentss.a= grandfather.c+parentss.a;
        System.out.println(parentss.a);
    }
}
class childss extends parentss{
    static int b=5;
    static void f2()
    {
        childss.b=parentss.a+childss.b;
        System.out.println(childss.b);
    }
}
public class properties {
    public  static void main(String args [])
    {
        childss c = new childss();

        c.f1();
        c.f2();

c.f3();

    }}