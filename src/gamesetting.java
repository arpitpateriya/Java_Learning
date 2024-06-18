class setting{
    static void f1(){
        System.out.println("audio");


    }


    static void f1( int x) {System.out.println("video");
    }
    public static void f1(char a)
    {
        System.out.println("sensivity");
    }
    static void f1(double v){
        System.out.println("control");
    }
}
public class gamesetting {
    public static void main (String args []){
        setting m =new setting();
        m.f1();
        m.f1(1.5);
        m.f1('h');
        m.f1(3);
    }
}

