class father{
    static void a1(){
         System.out.println("i am faher");
    }
}
class mother extends father {
    static void a2(){
        System.out.println(" i am mother" );
    }
}
class son extends mother {
    static void a3(){
        System.out.println("ia m son");
    }
}
public class family {
  public  static void main ( String args [])
    {
        son s= new son();
        s.a1();
        s.a2();
        s.a3();

    }
}
