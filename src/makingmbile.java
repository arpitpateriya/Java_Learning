<<<<<<< HEAD
import java.lang.String;
=======
>>>>>>> ab67380feae8361d0cf36e3bf73a3b4d727a78a0
class mobile{
    String Brand;
    String name;
    String color;
  String camrera;

    static void turnon()
    {
        System.out.println("turn on" );
    }
}
class makingmbile {
    public static void main(String args [])
    {
     mobile m=new mobile();
     m.Brand="vivo";
     m.name= "23";
     m.color="black";
     m.camrera="48p";
     m.turnon();
        System.out.println(m.Brand);
        System.out.println(m.name);
        System.out.println(m.color);
        System.out.println(m.camrera);

        mobile mb=new mobile();
        mb.Brand="oppo";
        mb.name= "3";
        mb.color="blue";
        mb.camrera="48p";
        mb.turnon();
        System.out.println(mb.Brand);
        System.out.println(mb.name);
        System.out.println(mb.color);
        System.out.println(mb.camrera);

        mobile mm=new mobile();
        mm.Brand="apple";
        mm.name= "13";
        mm.color="white";
        mm.camrera="12p";
        mm.turnon();
        System.out.println(mm.Brand);
        System.out.println(mm.name);
        System.out.println(mm.color);
        System.out.println(mm.camrera);

        mobile mmm=new mobile();
        mmm.Brand="mi";
        mmm.name= "23";
        mmm.color="black";
        mmm.camrera="128p";
        mmm.turnon();
        System.out.println(mmm.Brand);
        System.out.println(mmm.name);
        System.out.println(mmm.color);
        System.out.println(mmm.camrera);

        mobile a=new mobile();
        a.Brand="samsung";
        a .name= "24";
        a.color="red";
        a.camrera="108p";
        a.turnon();
        System.out.println(a.Brand);
        System.out.println(a.name);
        System.out.println(a.color);
        System.out.println(a.camrera);
    }
}