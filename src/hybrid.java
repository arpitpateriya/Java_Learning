class onezero{
    static void a1(){
        System.out.println("one zero");
    }
}
class oneone extends onezero{
    static void a2(){
        System.out.println("one one");
    }
}
class onetwo extends onezero{
    static void a3(){
        System.out.println("one two");
    }
}
class onethree extends oneone{
    static void a4(){
        System.out.println("one three");
    }
}
class onefour  extends onethree{
    static void a5(){
        System.out.println("one four");
    }
}
class onefive extends onethree {
    static void a6(){
        System.out.println("one five" );
    }
}


public class hybrid {
    public  static void main ( String args [])
    {
        onefive s=new onefive();
        s.a1();
       s.a2();
       s.a4();
       s.a6();

    }
}