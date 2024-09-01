class ff1{
    ff1()
    {
        System.out.println("hello world");
    }
    ff1(double d){
        System.out.println(d);

    }
    ff1(float f){
        System.out.println(f);
    }
    ff1(int x)
    {
        System.out.println(x);
    }
}


public class constructor_overloading{
    public static void main(String args [])
    {
        ff1 f = new ff1(10);
ff1 x=new ff1(10.5);
        ff1 d=new ff1(12.1);
        ff1 g= new ff1();
    }
}
