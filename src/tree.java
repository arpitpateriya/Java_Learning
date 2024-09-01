class one{
    static void a1(){
        System.out.println("one");
    }
}
class two extends one {
    static void a2(){
        System.out.println("two");
    }
}class three extends one {
    static void a3(){
        System.out.println("three");
    }
}
class four extends two{
    static void a4()
    {
        System.out.println("four");
    }
}
class five extends two{
    static void a5()
    {
        System.out.println("five");
    }
}
class six extends three{
    static void a6(){
        System.out.println("six");
    }
}
class seven extends three{
    static void a7(){
        System.out.println("seven");
    }
}

public class tree {
    public  static void main ( String args [])
    {
       seven s=new seven();
       six   i=new six();
       four f=new four();
       five v=new five();
       s.a1();
       s.a3();
       s.a7();
       i.a1();
       i.a3();
       i.a6();
      f.a1();
      f.a2();
       f.a4();
       v.a1();
       v.a2();
       v.a5();

    }
}
