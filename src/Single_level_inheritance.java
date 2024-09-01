class parent{

  static void f1()
    {
        System.out.println("Property of parent class");
    }
}
class child extends parent{
    static void f2()
    {
        System.out.println("Property of child class");
    }
}
public class Single_level_inheritance {
    public  static void main(String args [])
    {
        child c = new child();
        c.f1();
        c.f2();

        parent p = new parent();
        p.f1();

    }
}