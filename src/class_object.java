import java.lang.String;

class car{
    String name;
    String color;
    String Brand;
    double avg;
    int model_no;
    static void startEngine()
    {
        System.out.println("START CAR");
    }
}
public class class_object {
    public static void main(String args [])
    {
        car c = new car();
        c.name="BMW";
        c.color="Black";
        c.avg=1.1;
        c.model_no=789;
        c.Brand="7x";
        System.out.println(c.name);
        System.out.println(c.color);
        System.out.println(c.avg);
        System.out.println(c.model_no);
        System.out.println(c.Brand);
        c.startEngine();

        car cc = new car ();
        c.name = "audi";
        c.color="blue";
        c.avg = 10.3;
        c.model_no=100;
        c.Brand="8x";
        System.out.println(c.name);
        System.out.println(c.color);
        System.out.println(c.model_no);
        System.out.println(c.avg);
        System.out.println(c.Brand);
        c.startEngine();
    }
}
