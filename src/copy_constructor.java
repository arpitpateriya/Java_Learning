class A{
    int a;
    A(){
        a=10;
        System.out.println(a);

    }
    A(A ref){
        a=ref.a;
        System.out.println(a);

    }
}
public class copy_constructor {
public static void
    main (String args[]){
    A r=new A();
    A r2=new A(r);

}
}
