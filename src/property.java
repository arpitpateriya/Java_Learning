class parents{
    static int a=10;
    static void f1()
    {
        System.out.println(parents.a);
    }
}
class childs extends parent{
    static int b=5;
    static void f2()
    {
        childs.b=parents.a+childs.b;
        System.out.println(childs.b);
    }
}

public class property {
    public  static void main(String args [])
    {
        childs c = new childs();
        c.f1();
        c.f2();

    }
}
